package com.danielqueiroz.algoritmos.ordenacao.selectionsort;

import com.danielqueiroz.algoritmos.ordenacao.Produto;

import java.util.Arrays;

public class TesteSelection {

    public static void main(String[] args) {

        Produto produtos[] = {
                new Produto("Lamborgini", 1000000.0),
                new Produto("Jipe", 46000.0),
                new Produto("Brasilia", 16000.0),
                new Produto("Fusca", 17000.0),
                new Produto("Fusion", 48000.0)
        };

        Arrays.stream(produtos).forEach(System.out::println);

        System.out.println("-- Ordenados do menor --");
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.ordenaMenor(produtos, produtos.length);

        Arrays.stream(produtos).forEach(System.out::println);
    }

}
