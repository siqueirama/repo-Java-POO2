package com.company;

public class ListaParticipantes {

    static  final  int QUANTIDADE_LISTA = 1;

    Participante[] lista = new Participante[QUANTIDADE_LISTA];

    int tamanhoLista = 0;

    Participante obter (int indice){
        return  lista[indice];
    }

    int tamanho(){
        return tamanhoLista;
    }

    void  adicionar(Participante participante){
        if(tamanhoLista == lista.length ){
            Participante[] novaLista = new Participante[QUANTIDADE_LISTA + lista.length];

            for (int i = 0; i < lista.length; i++){
                novaLista[i] = lista[i];
            }

            lista = novaLista;
        }
        lista[tamanhoLista] = participante;
        tamanhoLista++;

        if(participante.circuito == "pequeno"){
            participante.setTamanho("Pequeno Ciruito");
            if(participante.idade<=18){
               participante.setValorPagar(1300);
            }else{
                participante.setValorPagar(1500);
            }
        }
        if(participante.circuito == "medio"){
            participante.setTamanho("Circuito médio");
            if(participante.idade<=18){
                participante.setValorPagar(2000);
            }else{
                participante.setValorPagar(2300);
            }
        }

        if(participante.circuito == "avançado"){
            participante.setTamanho("Ciruito Avançado");
            if(participante.idade<=18){
                participante.setValorPagar(0);
            }else{
                participante.setValorPagar(2800); ;
            }
        }

    }
    void remover(Participante participante){
        for (int i = 0; i < tamanhoLista; i++){
            Participante a = lista[i];

            if(a != null && a.equals(participante)){
                remover(i);
                break;
            } else if (a == null && participante == null){
                remover(i);
            }
        }
    }
    void remover(int indice){
        int indiceInicial = indice + 1;

        for(int i = indiceInicial; i< tamanhoLista; i++){
            lista[i-1] = lista[i];
        }

        tamanhoLista--;
        lista[tamanhoLista] = null;

    }

}
