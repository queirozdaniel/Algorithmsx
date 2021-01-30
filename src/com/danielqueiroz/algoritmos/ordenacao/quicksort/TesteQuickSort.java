package com.danielqueiroz.algoritmos.ordenacao.quicksort;

import com.danielqueiroz.algoritmos.ordenacao.Nota;

import java.util.Arrays;

public class TesteQuickSort {

    public static void main(String[] args) {
        Nota daniel = new Nota("daniel", 7);

        Nota[] notas = {
                new Nota("joão", 4),
                new Nota("paula", 8),
                new Nota("carlos", 5),
                new Nota("priscila", 9),
                new Nota("roberta", 6),
                new Nota("josé", 9.3),
                daniel
        };

        QuickSort quickSort = new QuickSort();

        quickSort.sort(notas, 0, notas.length);

        Arrays.stream(notas).forEach(s -> {
            System.out.println(s.getAluno() +": "+s.getValor());
        });

    }

}
