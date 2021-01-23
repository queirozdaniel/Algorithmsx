package com.danielqueiroz.algoritmos.ed.pilha;

public class PilhaTeste {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push("Daniel Queiroz");
        System.out.println(pilha);
        pilha.push("Carla Silva");
        System.out.println(pilha);

        System.out.println("Está vazia? " + pilha.isEmpty());

        String r1 = pilha.pop();
        System.out.println(r1);

        System.out.println(pilha);

    }

}
