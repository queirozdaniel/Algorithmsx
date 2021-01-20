package com.danielqueiroz.algoritmos.ed.vetor;

public class Vetor {

    private Livro[] livros = new Livro[50];
    private int totalDeLivrosEmLista = 0;

    public void add(Livro livro){
        this.aumentaEspaco();

        livros[totalDeLivrosEmLista] = livro;
        totalDeLivrosEmLista++;
    }

    public void add(int posicao,Livro livro){
        this.aumentaEspaco();

        if (!posicaoValida(posicao)) throw new IllegalArgumentException("Posição inválida");

        for (int i = totalDeLivrosEmLista - 1; i >= posicao; i -=1){
            livros[i+1] = livros[i];
        }
        livros[posicao] = livro;
        totalDeLivrosEmLista++;
    }

    public Livro get(int posicao){
        if (!posicaoOcupada(posicao)) throw new IllegalArgumentException("Posição inválida");

        return livros[posicao];
    }

    public void remove(int posicao){
        for (int i = posicao; i < this.totalDeLivrosEmLista - 1; i++){
            livros[i] = livros[i+1];
        }

        totalDeLivrosEmLista--;
        livros[totalDeLivrosEmLista] = null;
    }

    public boolean contains(Livro livro){
        for (int i = 0; i < totalDeLivrosEmLista; i++){
            if (livro.equals(livros[i])){
                return true;
            }
        }
        return false;
    }

    public int length(){
        return totalDeLivrosEmLista;
    }

    public String toString(){
        int iMax = livros.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder text = new StringBuilder();
        text.append('[');
        for (int i = 0; ; i++) {
            text.append(String.valueOf(livros[i]));
            if (i == iMax)
                return text.append(']').toString();
            text.append(", ");
        }
    }

    private void aumentaEspaco(){
        if (totalDeLivrosEmLista == livros.length){
            Livro[] novoLivros = new Livro[livros.length * 2];
            for (int i = 0; i < livros.length; i++){
                novoLivros[i] = livros[i];
            }
            this.livros = novoLivros;
        }
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < totalDeLivrosEmLista;
    }

    private boolean posicaoValida(int posicao){
        return posicao >= 0 && posicao <= totalDeLivrosEmLista;
    }


}
