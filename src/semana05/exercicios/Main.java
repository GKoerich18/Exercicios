package semana05.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        Jogador jogador = new Jogador();
        Jogo pedraPapelTesoura = new Jogo();
        Jogo numeroSorte = new Jogo();



        public void adicionarJogadores (){
            jogador.adicionarJogadoresPadrao();
        }
        public void menu(){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("1 - Ver ranking completo");
            System.out.println("2 - Ver top 10");
            System.out.println("3 - Jogar pedra papel tesoura");
            System.out.println("4 - Jogar numero da sorte");
            System.out.println("0 - Encerrar");
            int escolha = entrada.nextInt();

            switch (escolha){
                case 1:
                    jogador.exibirRanking();
                    menu();
                    break;
                case 2:
                    jogador.exibirTop10();
                    menu();
                    break;
                case 3:
                    pedraPapelTesoura.jogar();
                    menu();
                    break;
                case 4:
                    numeroSorte.jogar(1);
                    menu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    menu();


            }
        }



    public static void main(String[] args) {
            Main menu = new Main();
            menu.adicionarJogadores();
            menu.menu();







        }













}