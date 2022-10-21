package com.cupcake.store.storemanager.service;

import com.cupcake.store.storemanager.model.UserApp;
import com.cupcake.store.storemanager.repository.UserRepository;
import com.cupcake.store.storemanager.model.Authority;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class JpaUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserApp user = userRepository.findByUsername(username)
                .orElseThrow( () -> {return new UsernameNotFoundException("Usuario não encontrado"); });
        System.out.println(user);

        return new org.springframework.security.core.userdetails.User(user.getUsername(), 
                user.getPassword(), user.isEnabled(), user.isAccountNonExpired(), user.isCredentialsNonExpired(),
                user.isAccountNonLocked(), convertToSpringAuthorities((user.getAuthorities())));
    }

    private Collection<? extends GrantedAuthority> convertToSpringAuthorities(Set<Authority> authorities) {
        if(authorities != null && authorities.size() > 0){
            return authorities.stream()
                    .map(Authority::getRole)
                    .map(SimpleGrantedAuthority::new)
                    .collect((Collectors.toSet()));
        }else{
            return new HashSet<>();
        }
    }


    public UserApp create(UserApp newUser) {
        String password = newUser.getPassword();
        password = new BCryptPasswordEncoder().encode(password);
        newUser.setPassword(password);
        return userRepository.save(newUser);
    }


    public List<UserApp> getAll() {
        return userRepository.findAll();
    }
}
