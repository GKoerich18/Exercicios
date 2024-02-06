package semana05.aula01;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();


        livro.titulo = "O Leopardo";
        livro.autor = "Lampedusa";
        livro.anoPublicacao = 2002;

        livro.exibeInformacoes();
        System.out.println("Fim da execução");

        Livro livroLeopardo = new Livro();
    }
}