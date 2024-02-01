package semana04.aula02;

import java.util.Calendar;
import java.util.Scanner;

public class CalculadoraIdade {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano do seu nascimento: ");
        int anoNascimento = entrada.nextInt();

        int idade = calcularIdade(anoNascimento);
        System.out.println("Idade:"+ idade);


    }



    public static int anoSistema(){
        Calendar calendario = Calendar.getInstance();
        return calendario.get(Calendar.YEAR);
    }

    public static int calcularIdade(int anoNascimento){
        return anoSistema() - anoNascimento;
    }

}
