package br.com.ijunior.api.listas;

public class ListaDeCarrosTestes {

    public static void main(String[] args) {

        // Instancia a classe Lista informando seu tamanho.
        Lista lista = new Lista(6);

        // Adiciona o número respectivo de carros à lista.
        lista.add("Ford Edge");
        lista.add("Honda Civic");
        lista.add("Toyota Corolla");
        lista.add("Hyundai H20s");
        lista.add("Celta");
        lista.add("Gol");

        System.out.println("LISTA DE CARROS");
        System.out.println("Nº de carros na lista: "+lista.obtemTamanho());

        // Exibe o elmento no índice 2 (Toyota Corolla)
        System.out.println("\nBUSCA 1: "+lista.buscaPeloIndice(2));

        // Remove o elemento 2 (Toyota Corolla)
        lista.delete(2);

        /*
         *
         * Exibe novamente o elemento do índice 2. Porém, note que agora não é mais "Toyota Corolla", e sim o
         * seu sucessor que foi para o seu lugar, neste caso, o elemento "Hyundai H20s".
         */
        System.out.println("\nBUSCA 2: "+lista.buscaPeloIndice(2));

        /*
         *
         * Após o delete do índice 2, a lista toda se move à esquerda.
         * Logo, o novo índice 3 é formado pelo elemento "Celta", o que antes era o "Hyundai H20s".
         */
        System.out.println("\nBUSCA 3:\n"+lista.buscaCompleta(3));
    }
}
