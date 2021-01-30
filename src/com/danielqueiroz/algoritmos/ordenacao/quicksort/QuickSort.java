package com.danielqueiroz.algoritmos.ordenacao.quicksort;

import com.danielqueiroz.algoritmos.ordenacao.Nota;

public class QuickSort {

    public int findLess(Nota nota, Nota[] notas){
        int menores = 0;

        for (int atual = 0; atual < notas.length; atual++){
            Nota notaTemp =  notas[atual];
            if (notaTemp.getValor() < nota.getValor()) {
                menores++;
            }
        }
        return menores;
    }

    public int partition(Nota[] notas, int inicial, int termino){
        Nota pivo = notas[termino - 1];
        int menoresEncontrados = 0;
        for (int analisando = 0; analisando < termino - 1; analisando++){
            Nota atual = notas[analisando];
            if (atual.getValor() <= pivo.getValor()) {
                changePosition(notas, analisando, menoresEncontrados);
                menoresEncontrados++;
            }
        }

        changePosition(notas, termino - 1, menoresEncontrados);
        return menoresEncontrados;
    }

    private void changePosition(Nota[] notas, int de, int para) {
        Nota um = notas[de];
        Nota dois = notas[para];

        notas[para] = um;
        notas[de] = dois;
    }

    public void sort(Nota[] notas, int de, int ate){
        int elementos = ate - de;
        if (elementos > 1){
            int posicaoDoPivo = partition(notas, de, ate);
            sort(notas, de, posicaoDoPivo);
            sort(notas, posicaoDoPivo + 1, ate);
        }
    }

}
