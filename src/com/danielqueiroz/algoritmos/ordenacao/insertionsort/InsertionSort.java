package com.danielqueiroz.algoritmos.ordenacao.insertionsort;

import com.danielqueiroz.algoritmos.ordenacao.Produto;

public class InsertionSort {

    public void ordenaMenor(Produto[] produtos, int quantidadeDeElementos){
        for (int atual = 1; atual < quantidadeDeElementos; atual++){
            int analise = atual;
            while (analise > 0 && produtos[analise].getValor() < produtos[analise - 1].getValor()){


                trocaPosicao(produtos, analise, analise - 1);

                analise--;
            }
        }
    }

    private static void trocaPosicao(Produto[] produtos, int primeiro, int segundo){
        Produto primeiroProduto = produtos[primeiro];
        Produto segundoProduto = produtos[segundo];

        produtos[primeiro] = segundoProduto;
        produtos[segundo] = primeiroProduto;
    }

}
