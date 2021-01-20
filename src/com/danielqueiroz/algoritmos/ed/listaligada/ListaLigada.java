package com.danielqueiroz.algoritmos.ed.listaligada;

public class ListaLigada {

    private Celula primero = null;
    private Celula ultimo = null;
    private int totalDeElementos = 0;

    public void addFirst(Object elemento) {
        Celula nova = new Celula(elemento, primero);
        this.primero = nova;

        if (this.totalDeElementos == 0) {
            this.ultimo = primero;
        }

        this.totalDeElementos++;
    }

    public void addLast(Object elemento) {
        if (this.totalDeElementos == 0) {
            addFirst(elemento);
        } else {
            Celula nova = new Celula(elemento, null);
            this.ultimo.setProximo(nova);
            this.ultimo = nova;

            this.totalDeElementos++;
        }
    }

    public void add(int posicao, Object elemento) {
        if (posicao == 0) {
            addFirst(elemento);
        } else if (posicao == this.totalDeElementos) {
            addLast(elemento);
        } else {
            Celula anterior = this.getCelula(posicao - 1);
            Celula nova = new Celula(elemento, anterior.getProximo());
            anterior.setProximo(nova);

            this.totalDeElementos++;
        }
    }

    public Object get(int posicao) {
        return this.getCelula(posicao).getElemento();
    }

    public void removeFirst(int posicao) {
        if (this.totalDeElementos == 0) throw new IllegalArgumentException("Lista vazia");

        this.primero = this.primero.getProximo();
        this.totalDeElementos--;

        if (this.totalDeElementos == 0){
            this.ultimo = null;
        }
    }

    public void removeLast(int posicao) {

    }

    public void remove(int posicao) {

    }

    public int length() {
        return this.totalDeElementos;
    }

    public boolean contains(Object elemento) {
        return false;
    }

    @Override
    public String toString() {
        if (this.totalDeElementos == 0) return "[]";

        Celula atual = primero;
        StringBuilder text = new StringBuilder("[");
        for (int i = 0; i < this.totalDeElementos; i++) {
            text.append(atual.getElemento());
            text.append(", ");

            atual = atual.getProximo();
        }
        text.append("]");

        return text.toString();
    }

    private Celula getCelula(int posicao) {
        if (!posicaoOcupada(posicao)) throw new IllegalArgumentException("Posição inexistente");

        Celula atual = primero;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }

        return atual;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

}
