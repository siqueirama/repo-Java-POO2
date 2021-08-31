package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        int numInscricao = 0;

        ListaParticipantes lista = new ListaParticipantes();

        Participante participante1 = new Participante();
        participante1.nome = "Joao";
        participante1.sobrenome = "Silva";
        participante1.docRG = "2369854599";
        participante1.foneCel = "11332578896";
        participante1.idade = 35;
        participante1.grupoSang = "A+";
        participante1.foneEmergencia = "1198745632";
        participante1.circuito = "pequeno";
        lista.adicionar(participante1);

        Participante participante2 = new Participante();
        participante2.nome = "Kleber";
        participante2.sobrenome = "Silva";
        participante2.docRG = "2369854599";
        participante2.foneCel = "11332578896";
        participante2.idade = 16;
        participante2.grupoSang = "A+";
        participante2.foneEmergencia = "1198745632";
        participante2.circuito = "pequeno";
        lista.adicionar(participante2);

        Participante participante3= new Participante();
        participante3.nome = "Marco";
        participante3.sobrenome = "Silva";
        participante3.docRG = "2369854599";
        participante3.foneCel = "11332578896";
        participante3.idade = 17;
        participante3.grupoSang = "A+";
        participante3.foneEmergencia = "1198745632";
        participante3.circuito = "avançado";
        lista.adicionar(participante3);

        Participante participante4 = new Participante();
        participante4.nome = "Otto";
        participante4.sobrenome = "Silva";
        participante4.docRG = "2369854599";
        participante4.foneCel = "11332578896";
        participante4.idade = 50;
        participante4.grupoSang = "A+";
        participante4.foneEmergencia = "1198745632";
        participante4.circuito = "medio";
        lista.adicionar(participante4);

        Participante participante5 = new Participante();
        participante5.nome = "Ricardo";
        participante5.sobrenome = "Silva";
        participante5.docRG = "2369854599";
        participante5.foneCel = "11332578896";
        participante5.idade = 14;
        participante5.grupoSang = "A+";
        participante5.foneEmergencia = "1198745632";
        participante5.circuito = "medio";
        lista.adicionar(participante5);

        Participante participante6 = new Participante();
        participante6.nome = "Ana";
        participante6.sobrenome = "Silva";
        participante6.docRG = "2369854599";
        participante6.foneCel = "11332578896";
        participante6.idade = 70;
        participante6.grupoSang = "A+";
        participante6.foneEmergencia = "1198745632";
        participante6.circuito = "avançado";
        lista.adicionar(participante6);

        Participante participante7 = new Participante();
        participante7.nome = "Pedro";
        participante7.sobrenome = "Silva";
        participante7.docRG = "2369854599";
        participante7.foneCel = "11332578896";
        participante7.idade = 12;
        participante7.grupoSang = "A+";
        participante7.foneEmergencia = "1198745632";
        participante7.circuito = "avançado";
        lista.adicionar(participante7);

        for(int i = 0; i < lista.tamanho(); i++){
            Participante a = lista.obter(i);

            if(a.valorPagar == 0){
                System.out.println("inscrição númro: : "+ a.getdadosPaticipante());
                System.out.println("valor da Inscrição: "+ a.getValorPagar());
                System.out.println("Categoria: "+ a.getTamanho());
                System.out.println("Participante precisa ter mais de 18 anos para essa categoria");
                System.out.println("************************************************************");

            }else {
                numInscricao += 1;
                System.out.println("inscrição númro: " + numInscricao + ": " + a.getdadosPaticipante());
                System.out.println("valor da Inscrição: " + a.getValorPagar());
                System.out.println("Categoria: " + a.getTamanho());
                System.out.println("************************************************************");
            }
        }
        System.out.println(" Lista Final");
        System.out.println(" Insrcições Realizadas com sucesso");
        System.out.println("_______________________________________________");
        lista.remover(participante3);
        lista.remover(participante7);
        for(int i = 0; i < lista.tamanho(); i++){
            Participante a = lista.obter(i);
            numInscricao =1+i;
            if (a != null) {
                System.out.println("Inscrição numero:"+numInscricao);
                System.out.println("Participante: "+a.getdadosPaticipante());
                System.out.println("Categoria: " + a.getTamanho());
                System.out.println("_______________________________________________");
            }
        }
    }
}


