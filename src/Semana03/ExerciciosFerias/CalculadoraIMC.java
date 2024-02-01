package semana03.exerciciosFerias;

import java.util.Scanner;

public class CalculadoraIMC {


    public double peso;
    public double altura;

    public void calculadoraIMC() {
        double resultado = peso / Math.pow(altura, 2);
        System.out.println("O seu IMC é: " + resultado);
        if (resultado <= 16) {
            System.out.println("Magreza grave");
        } else if (resultado <= 16.9) {
            System.out.println("Magreza moderada");
        } else if (resultado <= 18.4) {
            System.out.println("Magreza leve");
        } else if (resultado <= 24.9) {
            System.out.println("Você está no peso ideal");
        } else if (resultado <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (resultado <= 34.9) {
            System.out.println("Obesidade grau 1");
        } else if (resultado <= 39.9) {
            System.out.println("Obesidade severa");
        } else {
            System.out.println("Obesidade mórbida");
        }


    }

    public static void main(String[] args) {
        CalculadoraIMC calculadora = new CalculadoraIMC();

        Scanner entrada = new Scanner(System.in);


        String escolha;

        do {
            System.out.print("Digite seu nome: ");
            String nome = entrada.next();
            System.out.print("Digite sua idade: ");
            int idade = entrada.nextInt();
            System.out.print("Digite sua altura: ");
            calculadora.altura = entrada.nextDouble();
            System.out.print("Digite seu peso: ");
            calculadora.peso = entrada.nextDouble();

            calculadora.calculadoraIMC();

            System.out.println("Deseja realizar outro cálculo? Se SIM digite S - Se NÃO digite N");
            escolha = entrada.next();

        } while (escolha.equalsIgnoreCase("S"));
    }
}