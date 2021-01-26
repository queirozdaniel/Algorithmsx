package com.danielqueiroz.algoritmos.ordenacao.insertionsort;

import com.danielqueiroz.algoritmos.ordenacao.Produto;
import com.danielqueiroz.algoritmos.ordenacao.selectionsort.SelectionSort;

import java.util.Arrays;

public class TesteInsertion {

    public static void main(String[] args) {
        Produto produtos[] = {
                new Produto("Lamborgini", 1000000.0),
                new Produto("Jipe", 46000.0),
                new Produto("Brasilia", 16000.0),
                new Produto("Fusca", 17000.0),
                new Produto("Fusion", 48000.0)
        };

        Arrays.stream(produtos).forEach(System.out::println);

        System.out.println("\n-- Ordenados do menor --");
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.ordenaMenor(produtos, produtos.length);

        Arrays.stream(produtos).forEach(System.out::println);
    }
}
