package util;


import model.Livro;

public class AlgoritmoOrdenacao {
    public static void bubbleSortPorTitulo(Livro[] livros, int contador) {
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - i - 1; j++) {
                if (livros[j].getTitulo().compareTo(livros[j + 1].getTitulo()) > 0) {
                    Livro temp = livros[j];
                    livros[j] = livros[j + 1];
                    livros[j + 1] = temp;
                }
            }
        }
    }

    // Implementação do Quick Sort por Autor
    public static void quickSortPorAutor(Livro[] livros, int inicio, int fim) {
        if (inicio < fim) {
            int pivoIndex = particionarPorAutor(livros, inicio, fim);
            quickSortPorAutor(livros, inicio, pivoIndex - 1);
            quickSortPorAutor(livros, pivoIndex + 1, fim);
        }
    }

    private static int particionarPorAutor(Livro[] livros, int inicio, int fim) {
        Livro pivo = livros[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (livros[j].getAutor().compareTo(pivo.getAutor()) <= 0) {
                i++;
                Livro temp = livros[i];
                livros[i] = livros[j];
                livros[j] = temp;
            }
        }
        Livro temp = livros[i + 1];
        livros[i + 1] = livros[fim];
        livros[fim] = temp;
        return i + 1;
    }
}