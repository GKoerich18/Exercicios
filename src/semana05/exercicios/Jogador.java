package semana05.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {

//Exercicio 03
    private ArrayList<Jogador> rankingJogadores;
    private String nome;
    private int idade;
    private int pontuacao = 0;
    private int numeroTentativas = 0;

    public Jogador() {
        this.rankingJogadores = new ArrayList<>();

    }

    public Jogador(
            String nome,

            int idade,

            int pontuacao,

            int numeroTentativas

    ) {
        nome = this.nome;
        idade = this.idade;
        pontuacao = this.pontuacao;
        numeroTentativas = this.numeroTentativas;
    }

//Exercicio 05
    public void novoJogador(Scanner entrada) {
        do {
            System.out.print("Digite o nome do novo jogador: ");
            String nome = entrada.nextLine();

            if (nomeExiste(nome)){
                System.out.println("Esse nome já foi utilizado, por favor tente outro: ");
                novoJogador(entrada);
            }else {
            Jogador novoJogador = new Jogador();
            novoJogador.setNome(nome);
            rankingJogadores.add(novoJogador);
            }

        }while (nomeExiste(nome));

    }

    private boolean nomeExiste(String nome) {
        for (Jogador jogador : rankingJogadores) {
            if (jogador.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public void validarJogador(Scanner entrada){
        novoJogador(entrada);
    }

    //Exercicio 04
    public void exibirTop10() {
        System.out.println("Lista de Jogadores:");
        for (int i = 0; i < rankingJogadores.size() && i <10; i++) {
            Jogador jogador = rankingJogadores.get(i);
            System.out.println(i  + " - " + jogador.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
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
