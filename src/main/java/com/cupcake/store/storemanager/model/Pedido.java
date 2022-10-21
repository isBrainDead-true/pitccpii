package com.cupcake.store.storemanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne()
    @JoinColumn(name = "cliente_id")
    private UserApp cliente;

    private Date dataDaCompra;


}
