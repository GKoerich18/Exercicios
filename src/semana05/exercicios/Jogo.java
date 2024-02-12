package semana05.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

    Jogador jogador = new Jogador();
    Random random = new Random();
    private String melhorJogador;

    private int numeroJogadas;


    public void jogar() {
        Scanner entrada = new Scanner(System.in);
        boolean continuarJogando = false;
        String escolha;
        jogador.novoJogador(entrada);
        System.out.println("Pedra papel tesoura iniciado:");

        do {
            String jogadaGerada = gerarJogadaComputador();
            System.out.println("Escolha, pedra papel ou tesoura:");
            String jogada = entrada.nextLine().toLowerCase();
            if (!jogada.equals("pedra") && !jogada.equals("tesoura") && !jogada.equals("papel")) {
                System.out.println("Opção inválida, por favor escolha Pedra, papel ou tesoura");
                jogada = entrada.nextLine().toLowerCase();
                continue;
            }
            if (determinarVencedor(jogada, jogadaGerada)) {
                jogador.setPontuacao(jogador.getPontuacao() + 1);
                System.out.println("O computador escolheu: " + jogadaGerada);
                System.out.println("Você ganhou 1 ponto!! ");

            } else {
                if (jogador.getPontuacao() > 0) {
                    jogador.setPontuacao(jogador.getPontuacao() - 1);
                    System.out.println("O computador escolheu: " + jogadaGerada);
                    System.out.println("Você perdeu 1 ponto!!");
                    continue;
                } else {
                    System.out.println("O computador escolheu: " + jogadaGerada);
                    System.out.println("Você perdeu!! \n porém não perdeu pontos porque ja está com 0");
                    continue;
                }
            }
            jogador.setNumeroTentativas((jogador.getNumeroTentativas() + 1));

            System.out.println("Você deseja jogar novamente? (S/N)");
            escolha = entrada.nextLine();
            if (escolha.equalsIgnoreCase("s")) {
                continuarJogando = true;
            } else {
                continuarJogando = false;
            }
        } while (continuarJogando);


    }

    public void jogar(int num) {
        Scanner scan = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        jogador.novoJogador(scan);
        System.out.println("Tente adivinhar o número que o computador está pensando!!");
        String escolha;
        System.out.println("Jogo iniciado!");

        do {
            System.out.println("Limite até qual número o computador irá pensar");
            num = scan.nextInt();
            int numeroComputador = random.nextInt(num + 1);
            int jogadaGerada = numeroComputador;
            System.out.println("O computador irá pensar até o numero: " + num);
            System.out.println("Digite um número: ");
            int jogadaJogador = scan.nextInt();
            if (jogadaJogador == numeroComputador) {
                System.out.println("O número que o computador pensou foi: " + jogadaGerada);
                System.out.println("Você acertou!!");
                System.out.println("Parabéns, você ganhou 1 ponto");
                jogador.setPontuacao(jogador.getPontuacao() + 1);

            } else {
                if (jogador.getPontuacao() > 0) {
                    System.out.println("O número que o computador pensou foi: " + jogadaGerada);
                    System.out.println("Você perdeu 1 ponto!");
                    jogador.setPontuacao(jogador.getPontuacao() - 1);
                } else {
                    System.out.println("O número que o computador pensou foi: " + jogadaGerada);
                    System.out.println("Você perdeu!!");
                    System.out.println("Porém não perdeu pontos porque sua pontuação ja é 0");
                }
            }
            System.out.println("Você deseja jogar novamente?(S/N)");

            escolha = entrada.nextLine();



        } while (escolha.equalsIgnoreCase("s"));
    }


    private String gerarJogadaComputador() {
        int jogada = random.nextInt(3);
        switch (jogada) {
            case 0:
                return "pedra";
            case 1:
                return "papel";
            default:
                return "tesoura";
        }
    }

    private boolean determinarVencedor(String jogadaJogador, String jogadaComputador) {
        if (jogadaJogador.equals(jogadaComputador)) {
            System.out.println("Empate");
            return false;
        } else if (jogadaJogador.equals("pedra") && jogadaComputador.equals("tesoura")) {
            return true;

        } else if (jogadaJogador.equals("tesoura") && jogadaComputador.equals("papel")) {
            return true;
        } else if (jogadaJogador.equals("papel") && jogadaComputador.equals("pedra")) {
            return true;
        } else {
            return false;
        }


    }

}
