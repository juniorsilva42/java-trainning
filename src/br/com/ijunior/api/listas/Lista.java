package br.com.ijunior.api.listas;

public class Lista {

    private String[] lista;
    private int tamanho;

    /*
     * Inicializa a classe
     * @constructor
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

    /*
     *
     * Remove um elemento da lista
     *
     */
    public void delete(int posicao){
        /*
         *
         * Nega a existência da posição na Lista.
         * Uma pequena gambiarra para não aninhar expressões if e else
         *
         */
        if(!verificaPosicao(posicao))
            throw new IllegalArgumentException("Posição inválida");

        for (int i = posicao; i < this.tamanho-1; ++i){
            this.lista[i] = this.lista[i+1];
        }
        this.tamanho--;
    }

    /*
     *
     * Busca um elemento pelo índice
     *
     */
    public String buscaPeloIndice (int posicao) {

        // Nega a existência da posição na Lista.
        if(!verificaPosicao(posicao))
            throw new IllegalArgumentException("Posição inválida");

        return this.lista[posicao];
    }

    /*
     *
     * Procedimento que busca um elemento e seu índice
     *
     */
    public void buscaCompleta (int posicao) {

        // Nega a existência da posição na Lista.
        if(!verificaPosicao(posicao))
            throw new IllegalArgumentException("Posição inválida");

        /*
          * Percorre a lista buscando uma igualdade entre a posição passada
          * no argumento e o índice corrente dentro da repetição.
          *
          * Quando na primeira execução o retorno for verdadeiro, breca o laço,
          * pois não há mais o porquê de percorrer a lista.
          *
        */
        for (int i = 0; i < this.tamanho; ++i){
            if (this.lista[posicao] == this.lista[i]){
                System.out.println("Elemento: "+this.lista[posicao]+"\nÍndice: "+i);
                break;
            }
        }
    }

    /*
     *
     * Faz um range de posições q não podem ser acessadas
     *
     */
    public boolean verificaPosicao (int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            return false;
        }
        return true;
    }

    /*
     *
     * Retorna o tamanho da lista
     *
     */
    public int obtemTamanho() {
        return this.tamanho;
    }
}
