package br.com.empresa.domain;

import lombok.Data;

@Data
public class State {

    private String id;
    private String sigla;
    private String nome;
    private Regiao regiao;

}
