package semana05.aula02;

public class MainLivro {
    public static void main(String[] args) {

        Livro livro = new Livro("autor","titulo",1920);
        livro.setAutor("Jorginho");

        livro.exibir();

        System.out.println(livro.getAutor());
        System.out.println(livro.getAnoPublicacao());


    }
}
