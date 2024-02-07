package semana05.exercicios;

public class Jogador {
    private String nome;
    private int idade;
    private int pontuacao;
    private int numeroTentativas;

    public Jogador(
            String nome,

            int idade,

            int pontuacao,

            int numeroTentativas

    ){
        nome = this.nome;
        idade = this.idade;
        pontuacao = this.pontuacao;
        numeroTentativas = this.numeroTentativas;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNumeroTentativas() {
        return numeroTentativas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void setNumeroTentativas(int numeroTentativas) {
        this.numeroTentativas = numeroTentativas;
    }

    public void adicionaPontos() {

    }

    public void perdePontos() {

    }

    public void adicionaTentativa() {

    }
}
