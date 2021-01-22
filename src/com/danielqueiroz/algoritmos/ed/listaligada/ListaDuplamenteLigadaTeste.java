package com.danielqueiroz.algoritmos.ed.listaligada;

public class ListaDuplamenteLigadaTeste {

    public static void main(String[] args) {

        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();

        lista.addFirst("Daniel Queiroz");
        lista.addFirst("João da Silva");
        lista.addFirst("Carla Silva");
        System.out.println(lista);

        lista.addLast("Priscila Nunes");
        System.out.println(lista);

        lista.add(2, "Maria");
        System.out.println(lista);

        lista.remove(2);
        System.out.println(lista);
    }

}
