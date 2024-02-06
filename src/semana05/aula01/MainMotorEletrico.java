package semana05.aula01;

import java.util.Scanner;

public class MainMotorEletrico {
    public static void main(String[] args) {
        MotorEletrico motorEletrico = new MotorEletrico();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura atual do motor: ");
        motorEletrico.temperatura = entrada.nextInt();

        System.out.println("Digite a velocidade atual do motor: ");
        motorEletrico.velocidade = entrada.nextInt();

        System.out.println("Digite a tensão aplicada sobre o motor: ");
        motorEletrico.tensaoAplicada = entrada.nextInt();

       motorEletrico.exibirInformacoes();



    }
}
