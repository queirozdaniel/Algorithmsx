package com.danielqueiroz.algoritmos.ed.fila;

public class FilaTeste {

    public static void main(String[] args) {

        Fila fila = new Fila();

        fila.add("Daniel");
        fila.add("Juliana");
        System.out.println(fila);

        System.out.println(fila.isEmpty());

        fila.add("Maria");
        System.out.println(fila.peek());
        System.out.println(fila);

        fila.pull();
        System.out.println(fila);
    }

}
