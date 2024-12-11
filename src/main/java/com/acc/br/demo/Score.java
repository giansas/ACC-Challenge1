package com.acc.br.demo;

import org.springframework.data.annotation.Id;

public class Score {

    @Id
    private Integer id;

    private int vitorias, derrotas, empates;

    public Score(int vitorias, int derrotas, int empates){
        super();
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;

    }

    public int getVitorias(){
        return vitorias;
    }

    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

}
