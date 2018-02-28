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
}
