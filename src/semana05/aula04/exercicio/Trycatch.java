package semana05.aula04.exercicio;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class Trycatch {
    int resultado;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;

        System.out.println("Divisão");
        System.out.println("Digite um número");
        primeiroNumero = entrada.nextInt();

        System.out.println("Digite um número");
        segundoNumero = entrada.nextInt();



        try{
            int resultado = primeiroNumero / segundoNumero;

            System.out.println(resultado);

        }catch (ArithmeticException e ){
            System.out.println("Erro: " + e.getMessage());
        }



    }
}
