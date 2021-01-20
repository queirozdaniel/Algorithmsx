package com.danielqueiroz.algoritmos.ed.vetor;

public class VetorTeste {

    public static void main(String[] args) {
        Livro l1 = new Livro("O Poder do Hábito", 20.0);
        Livro l2 = new Livro("O segredo", 20.0);

        Vetor vetor = new Vetor();

        vetor.add(l1);
        vetor.add(l2);
        System.out.println(vetor);

        Livro l3 = new Livro("Java 8", 20.0);
        vetor.add(2, l3);
        System.out.println(vetor);

        vetor.remove(1);
        System.out.println(vetor);

    }

}
