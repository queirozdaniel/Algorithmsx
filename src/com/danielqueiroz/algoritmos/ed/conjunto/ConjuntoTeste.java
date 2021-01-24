package com.danielqueiroz.algoritmos.ed.conjunto;

public class ConjuntoTeste {

    public static void main(String[] args) {

        Conjunto conjunto = new Conjunto();

        conjunto.add("Daniel");
        conjunto.add("Davi");
        conjunto.add("Guilherme");
        conjunto.add("Julia");
        conjunto.add("Carla");
        System.out.println(conjunto);

        conjunto.remove("Davi");
        System.out.println(conjunto);

    }

}
