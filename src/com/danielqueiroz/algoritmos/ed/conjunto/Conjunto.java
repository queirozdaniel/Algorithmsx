package com.danielqueiroz.algoritmos.ed.conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Conjunto {

    private List<LinkedList<String>> tabela = new ArrayList<>();

    public Conjunto() {
        for (int i = 0; i < 26; i++){
            tabela.add(new LinkedList<String>());
        }
    }

    public void add(String palavra){
        int indice = this.calculaIndiceTable(palavra);
        List<String> lista = tabela.get(indice);
        lista.add(palavra);
    }

    public void remove(String palavra){
        if (this.contains(palavra)){
            int indice = this.calculaIndiceTable(palavra);
            List<String> lista = tabela.get(indice);
            lista.remove(palavra);
        }
    }

    public boolean contains(String palavra){
        int indice = this.calculaIndiceTable(palavra);
        return tabela.get(indice).contains(palavra);
    }

    @Override
    public String toString() {
        return this.tabela.toString();
    }

    private int calculaIndiceTable(String palavra) {
        return palavra.toLowerCase().charAt(0) % 26;
    }

}
