package com.danielqueiroz.algoritmos.ed.fila;

import com.danielqueiroz.algoritmos.ed.listaligada.ListaDuplamenteLigada;

public class Fila {

    private ListaDuplamenteLigada alunos = new ListaDuplamenteLigada();

    public void add(String aluno){
        this.alunos.addLast(aluno);
    }

    public String pull(){
        int posicao = 0;
        String aux = this.alunos.get(posicao).toString();
        this.alunos.remove(posicao);
        return aux;
    }

    public boolean isEmpty(){
        return this.alunos.length() == 0;
    }

    public String peek(){
        return this.alunos.get(0).toString();
    }

    @Override
    public String toString() {
        return this.alunos.toString();
    }
}
