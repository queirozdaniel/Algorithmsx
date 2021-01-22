package com.danielqueiroz.algoritmos.ed.listaligada;

public class ListaDuplamenteLigada {

    private Celula primero = null;
    private Celula ultimo = null;
    private int totalDeElementos = 0;

    public void addFirst(Object elemento) {
        if (this.totalDeElementos == 0) {
            Celula nova = new Celula(elemento);
            this.primero = nova;
            this.ultimo = nova;
        } else {
            Celula nova = new Celula(elemento, this.primero);
            this.primero.setAnterior(nova);
            this.primero = nova;
        }

        this.totalDeElementos++;
    }

    public void addLast(Object elemento) {
        if (this.totalDeElementos == 0) {
            addFirst(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultimo.setProximo(nova);
            nova.setAnterior(this.ultimo);
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
            Celula proxima = anterior.getProximo();
            Celula nova = new Celula(elemento, anterior.getProximo());
            nova.setAnterior(anterior);
            anterior.setProximo(nova);
            proxima.setAnterior(nova);
            this.totalDeElementos++;
        }
    }

    public Object get(int posicao) {
        return this.getCelula(posicao).getElemento();
    }

    public void removeFirst() {
        if (this.totalDeElementos == 0) throw new IllegalArgumentException("Lista vazia");

        this.primero = this.primero.getProximo();
        this.totalDeElementos--;

        if (this.totalDeElementos == 0){
            this.ultimo = null;
        }
    }

    public void removeLast() {
        if (this.totalDeElementos == 1) {
            this.removeFirst();
        } else {
            Celula penultima = this.ultimo.getAnterior();
            penultima.setProximo(null);
            this.ultimo = penultima;

            this.totalDeElementos--;
        }
    }

    public void remove(int posicao) {
        if (posicao == 0) {
            this.removeFirst();
        } else if (posicao == this.totalDeElementos - 1) {
            this.removeLast();
        } else {
            Celula anterior = this.getCelula(posicao).getAnterior();
            Celula proximo = this.getCelula(posicao).getProximo();
            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);

            this.totalDeElementos--;
        }
    }

    public int length() {
        return this.totalDeElementos;
    }

    public boolean contains(Object elemento) {
        Celula atual = this.primero;

        while (atual !=null){
            if (atual.getElemento().equals(elemento)){
                return true; }

            atual = atual.getProximo();
        }
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
