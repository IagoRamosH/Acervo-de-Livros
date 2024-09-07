package controller;
import model.Livro;
import util.AlgoritmoOrdenacao;


public class ManagementSystem {
 private Biblioteca biblioteca;

    public ManagementSystem(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        biblioteca.adicionarLivro(livro);
    }

    public Livro[] listarLivros() {
        return biblioteca.listarLivros();
    }

    public void ordenarLivrosPorTitulo() {
        AlgoritmoOrdenacao.bubbleSortPorTitulo(biblioteca.listarLivros(), biblioteca.getContador());
    }

    public void ordenarLivrosPorAutor() {
        AlgoritmoOrdenacao.quickSortPorAutor(biblioteca.listarLivros(), 0, biblioteca.getContador() - 1);
    }

    // Outros métodos para buscar e gerenciar livros
}

