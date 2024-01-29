package Semana01.ExerciciosFerias;

import java.util.Scanner;

public class Calculadora {
    Scanner entrada = new Scanner(System.in);

    public void soma() {
        System.out.println("Digite o primeiro número: ");
        double primeiroNumero = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        double segundoNumero = entrada.nextDouble();
        double resultado = primeiroNumero + segundoNumero;
        System.out.println("O resultado é: " + resultado);

    }

    public void subtracao() {
        System.out.println("Digite o primeiro número: ");
        double primeiroNumero = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        double segundoNumero = entrada.nextDouble();
        double resultado = primeiroNumero - segundoNumero;
        System.out.println("O resultado da subtração é: " + resultado);

    }

    public void multiplicacao() {
        System.out.println("Digite o primeiro número: ");
        double primeiroNumero = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        double segundoNumero = entrada.nextDouble();
        double resultado = primeiroNumero * segundoNumero;
        System.out.println("O resultado da multiplicação é: " + resultado);

    }

    public void divisao() {
        System.out.println("Digite o primeiro número: ");
        double primeiroNumero = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        double segundoNumero = entrada.nextDouble();
        double resultado = primeiroNumero / segundoNumero;
        System.out.println("O resultado da divisao é: " + resultado);
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner entrada = new Scanner(System.in);

        int escolha;


        do {
            System.out.println("Digite qual operação você quer fazer: ");
            System.out.println("1 - Adição ");
            System.out.println("2 - Subtração ");
            System.out.println("3 - Multiplicação ");
            System.out.println("4 - Divisão ");
            System.out.println("5 - Parar ");

            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    calculadora.soma();
                    break;
                case 2:
                    calculadora.subtracao();
                    break;
                case 3:
                    calculadora.multiplicacao();
                    break;
                case 4:
                    calculadora.divisao();
                    break;
                case 5:
                    System.out.println("Programa Encerrado!");
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }

        } while (escolha != 5);


    }

}