package com.company;

public class Participante {
    //RG, nome, sobrenome, idade, telefone celular, número de emergência e grupo sanguíneo.
    String docRG;
    String nome;
    String sobrenome;
    int idade;
    String foneCel;
    String foneEmergencia;
    String grupoSang;
    String circuito;



    String getdadosPaticipante(){
        return "Nome: "+nome+" "+sobrenome+
               " | Idade:"+idade ;

    }

    float valorPagar;

    public void setValorPagar(float valorPagar) {
        this.valorPagar = valorPagar;
    }

    public float getValorPagar() {
        return valorPagar;
    }

    String tamanho;

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }
}

