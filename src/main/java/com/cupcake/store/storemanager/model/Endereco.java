package com.cupcake.store.storemanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String cep;
    private String rua;
    private String numeroDaCasa;
    private String cidade;
    private String estado;
    private String pais;

}
