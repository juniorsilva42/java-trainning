package br.com.ijunior.api.listas;

public class Lista {

    private String[] lista;
    private int tamanho;

    /*
     *
     * Inicializa a classe
     * @arguments {capacidade} - capacidade da lista
     *
     */
    public Lista(int capacidade) {

        this.lista = new String[capacidade];
        this.tamanho = 0;
    }

    /*
     *
     * Adiciona um elemento à lista
     *
     */
    public boolean add(String elemento) {

        /*
         *
         * Se o tamanho da lista em contexto da classe é menor que a contagem de elementos da lista,
         * então há espaço na lista, pode adicionar.
         *
         */
        if (this.tamanho < this.lista.length) {
            this.lista[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
}
