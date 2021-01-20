package com.danielqueiroz.algoritmos.ed.listaligada;

import java.util.LinkedList;

public class ListaLigadaTeste {

    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        lista.addFirst("Daniel");
        lista.addFirst("João");
        lista.addFirst("Carla");
        System.out.println(lista);

        lista.addLast("Priscila");
        System.out.println(lista);

        lista.add(2, "Maria");
        System.out.println(lista);

    }

}
