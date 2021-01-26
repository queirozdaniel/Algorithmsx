package com.danielqueiroz.algoritmos.ordenacao.selectionsort;

import com.danielqueiroz.algoritmos.ordenacao.Produto;

public class SelectionSort {

    public void ordenaMenor(Produto[] produtos, int quantidadeDeElementos){
        for (int atual = 0; atual < quantidadeDeElementos - 1; atual++ ){
            int menor = buscaMenor(produtos, atual, quantidadeDeElementos - 1);

            trocaPosicao(produtos, atual, menor);
        }
    }

    private static void trocaPosicao(Produto[] produtos, int primeiro, int segundo){
        Produto primeiroProduto = produtos[primeiro];
        Produto segundoProduto = produtos[segundo];

        produtos[primeiro] = segundoProduto;
        produtos[segundo] = primeiroProduto;
    }

    private static int buscaMenor(Produto[] produto, int inicio, int termino) {
        int maisBarato = inicio;
        for (int atual = inicio; atual <= 4; atual++) {
            if (produto[atual].getValor() < produto[maisBarato].getValor()) {
                maisBarato = atual;
            }
        }
        return maisBarato;
    }

}
