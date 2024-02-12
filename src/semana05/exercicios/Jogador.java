package semana05.exercicios;

import java.util.ArrayList;
import java.util.Comparator;
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

    public Jogador(
            String nome,
            int pontuacao
    ) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public void adicionarJogadoresPadrao() {
        Jogador jogador1 = new Jogador("jogador1", 100);
        rankingJogadores.add(jogador1);
        Jogador jogador2 = new Jogador("jogador2", 90);
        rankingJogadores.add(jogador2);
        Jogador jogador3 = new Jogador("jogador3,", 80);
        rankingJogadores.add(jogador3);
        Jogador jogador4 = new Jogador("jogador4", 70);
        rankingJogadores.add(jogador4);
        Jogador jogador5 = new Jogador("jogador5", 60);
        rankingJogadores.add(jogador5);
        Jogador jogador6 = new Jogador("jogador6", 50);
        rankingJogadores.add(jogador6);
        Jogador jogador7 = new Jogador("jogador7", 40);
        rankingJogadores.add(jogador7);
        Jogador jogador8 = new Jogador("jogador8", 30);
        rankingJogadores.add(jogador8);
        Jogador jogador9 = new Jogador("jogador9", 20);
        rankingJogadores.add(jogador9);
        Jogador jogador10 = new Jogador("jogador10", 10);
        rankingJogadores.add(jogador10);
        Jogador jogador11 = new Jogador("jogador10", 0);
        rankingJogadores.add(jogador11);

    }

    //Exercicio 05
    public void novoJogador(Scanner entrada) {
        do {
            System.out.print("Digite o nome do novo jogador: ");
            String nome = entrada.nextLine();

            if (nomeExiste(nome)) {
                System.out.println("Esse nome já foi utilizado, por favor tente outro: ");
                novoJogador(entrada);
            } else {
                Jogador novoJogador = new Jogador();
                novoJogador.setNome(nome);
                rankingJogadores.add(novoJogador);
            }

        } while (nomeExiste(nome));

    }


    private boolean nomeExiste(String nome) {
        for (Jogador jogador : rankingJogadores) {
            if (jogador.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public void validarJogador(Scanner entrada) {
        novoJogador(entrada);
    }

    //Exercicio 04
    public void exibirTop10() {
        System.out.println("Lista dos 10 melhores jogadores:");
        for (int i = 0; i < rankingJogadores.size() && i < 10; i++) {
            Jogador jogador = rankingJogadores.get(i);
            System.out.println((i + 1) + " - " + jogador.getNome() + " - " + jogador.getPontuacao() + " pontos");
            rankingJogadores.sort(Comparator.comparingInt(Jogador::getPontuacao).reversed());
        }
    }

    public void exibirRanking() {
        System.out.println("Lista de todos os jogadores: ");
        for (int i = 0; i < rankingJogadores.size(); i++) {
            Jogador jogador = rankingJogadores.get(i);
            System.out.println((i + 1) + " - " + jogador.getNome() + " - " + jogador.getPontuacao() + " pontos");
            rankingJogadores.sort(Comparator.comparingInt(Jogador::getPontuacao).reversed());
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
