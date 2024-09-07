package model;

public class Livro {

public static int lenght;
private String Autor;
private String Titulo;
private int AnoDePublicacao;
private int ID;
public Livro(String autor, String titulo, int anoDePublicacao) {
    Autor = autor;
    Titulo = titulo;
    AnoDePublicacao = anoDePublicacao;
}










public String getAutor() {
    return Autor;
}

public void setAutor(String autor) {
    Autor = autor;
}

public String getTitulo() {
    return Titulo;
}

public void setTitulo(String titulo) {
    Titulo = titulo;
}

public int getAnoDePublicacao() {
    return AnoDePublicacao;
}

public void setAnoDePublicacao(int anoDePublicacao) {
    AnoDePublicacao = anoDePublicacao;
}


















}
