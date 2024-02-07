package semana05.aula02.exercicio06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Contador contador = new Contador();

        String escolha;

        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println(" a - Para incrementar números na contagem");
            System.out.println(" b - Para zerar a contagem");
            System.out.println(" c - Para exibir o valor atual da contagem");
            System.out.println(" q - Para encerrar o programa");
            escolha = entrada.next();

            switch (escolha.toLowerCase()) {
                case "a":
                    contador.incrementarContagem(entrada);
                    System.out.println(contador.getNumeroContagem());
                    break;
                case "b":
                    contador.zerarContagem();
                    System.out.println(contador.getNumeroContagem());
                    break;
                case "c":
                    System.out.println(contador.getNumeroContagem());
                    break;
                case "q":
                    System.out.println("Programa encerrado!");
                    return;
            }
        } while (escolha != "q");


    }
}
