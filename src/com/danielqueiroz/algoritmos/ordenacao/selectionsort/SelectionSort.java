package com.danielqueiroz.algoritmos.ordenacao.selectionsort;

public class SelectionSort {

    public void ordenaMenor(Produto[] produtos, int quantidadeDeElementos){
        for (int indice = 0; indice < quantidadeDeElementos - 1; indice++ ){
            int menor = buscaMenor(produtos, indice, quantidadeDeElementos - 1);
            Produto produtoAtual = produtos[indice];
            Produto produtoMenor = produtos[menor];

            produtos[indice] = produtoMenor;
            produtos[menor] = produtoAtual;
        }
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
