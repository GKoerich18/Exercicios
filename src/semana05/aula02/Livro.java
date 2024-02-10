package semana05.aula02;

import java.util.Locale;

public class Livro {

    private String autor;
    private String titulo;
    private int anoPublicacao;


    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibir() {
        System.out.println("Autor: " + autor);
        System.out.println("Titulo: " + titulo);
        System.out.println("Ano de publicação: " + anoPublicacao);
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao + 1000;
    }



    public Livro(
            String autor,
            String titulo,
            int anoPublicacao

    ) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;


    }

    public Livro(
            String autor,
            String titulo


    ) {
        this.autor = autor;
        this.titulo = titulo;


    }

    public Livro(
            String autor


    ) {
        this.autor = autor;


    }

}

