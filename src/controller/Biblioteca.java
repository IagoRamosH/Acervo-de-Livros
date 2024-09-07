package controller;
import model.Livro;


public class Biblioteca {
    private Livro[] livros;
    private int contador;

    public Biblioteca(int capacidade) {
        livros = new Livro[capacidade];
        contador = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (contador < livros.length) {
            livros[contador] = livro;
            contador++;
        } else {
            System.out.println("Acervo cheio!");
        }
    }

    public Livro[] listarLivros() {
        return livros;
    }

    public int getContador() {
        return contador;
    }



}











