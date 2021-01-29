package com.danielqueiroz.algoritmos.ordenacao.mergesort;

import com.danielqueiroz.algoritmos.ordenacao.Nota;

public class TesteMerge {

    public static void main(String[] args) {

        Nota[] notasUm = {
          new Nota("daniel", 7),
          new Nota("joão", 4),
          new Nota("paula", 8),
          new Nota("carlos", 5),
        };

        Nota[] notasDois = {
                new Nota("priscila", 9),
                new Nota("roberta", 6),
                new Nota("josé", 9.3),
        };

        MergeSort mergeSort = new MergeSort();

        Nota[] notas = mergeSort.merge(notasUm, notasDois);

        for (Nota nota: notas) {
            System.out.println(nota.getAluno() + ": " +nota.getValor());
        }

        System.out.println("--");
        //mergeSort.intercalate(notas, 1, 3, notas.length);
        mergeSort.sort(notas, 0, notas.length);

        for (Nota nota: notas) {
            System.out.println(nota.getAluno() + ": " +nota.getValor());
        }



    }
}
