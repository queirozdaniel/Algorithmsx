package com.danielqueiroz.algoritmos.ordenacao.mergesort;

import com.danielqueiroz.algoritmos.ordenacao.Nota;

public class MergeSort {

    public Nota[] merge(Nota[] notasUm, Nota[] notasDois){
        int total = notasUm.length + notasDois.length;
        Nota[] notasFinal = new Nota[total];

        int atualUm = 0;
        int atualDois = 0;
        int atual = 0;

        while (atualUm < notasUm.length && atualDois < notasDois.length){
            Nota notaUm = notasUm[atualUm];
            Nota notaDois = notasDois[atualDois];

            if (notaUm.getValor() <  notaDois.getValor()){
                notasFinal[atual] = notaUm;
                atualUm++;
            } else {
                notasFinal[atual] = notaDois;
                atualDois++;
            }
            atual++;
        }

        while (atualUm < notasUm.length){
            notasFinal[atual] = notasUm[atualUm];
            atual++;
            atualUm++;
        }

        while (atualDois < notasDois.length){
            notasFinal[atual] = notasDois[atualDois];
            atual++;
            atualDois++;
        }

        return notasFinal;
    }

    public void intercalate(Nota[] notas, int inicio, int miolo, int termino){
        Nota[] notasFinal = new Nota[notas.length];

        int atualUm = inicio;
        int atualDois = miolo;
        int atual = 0;

        while (atualUm < miolo && atualDois < termino){
            Nota notaUm = notas[atualUm];
            Nota notaDois = notas[atualDois];

            if (notaUm.getValor() < notaDois.getValor()){
                notasFinal[atual] = notaUm;
                atualUm++;
            } else  {
                notasFinal[atual] = notaDois;
                atualDois++;
            }
            atual++;
        }

        while (atualUm < miolo){
            notasFinal[atual] = notas[atualUm];
            atual++;
            atualUm++;
        }

        while (atualDois < termino){
            notasFinal[atual] = notas[atualDois];
            atual++;
            atualDois++;
        }

        for(int contador = 0; contador < atual; contador++){
            notas[inicio + contador] = notasFinal[contador];
        }
    }

    public void sort(Nota[] notas, int inicial, int termino){
        int quantidade = termino - inicial;

        if (quantidade > 1){
            int meio = (inicial + termino) / 2;
            sort(notas, inicial, meio);
            sort(notas,meio, termino);
            intercalate(notas, inicial, meio,termino);
        }

    }

}
