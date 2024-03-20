package br.com.cbf.campeonatobrasileiro.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Time {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    private String nome;

    private String sigla;


    private String uf;

    private String estadio;
}
