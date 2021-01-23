package com.danielqueiroz.algoritmos.ed.pilha;

import com.danielqueiroz.algoritmos.ed.listaligada.ListaDuplamenteLigada;

public class Pilha {

    private ListaDuplamenteLigada nomes = new ListaDuplamenteLigada();

    public void push(String nome){
        this.nomes.addLast(nome);
    }

    public String pop(){
        int posicao = nomes.length() - 1;
        String aux = this.nomes.get(posicao).toString();
        this.nomes.remove(posicao);
        return aux;
    }

    public String peek(){
        return this.nomes.get(nomes.length() - 1).toString();
    }

    public boolean isEmpty(){
        return this.nomes.length() == 0;
    }

    @Override
    public String toString() {
        return nomes.toString();
    }
}
