package semana05.aula02.exercicio06;

import java.util.Scanner;

public class Contador {
    Scanner entrada = new Scanner(System.in);
    private int numeroContagem;


    public int getNumeroContagem() {
        return numeroContagem;
    }

    public int zerarContagem() {
        numeroContagem = 0;
        return numeroContagem;
    }

    public int incrementarContagem(Scanner entrada) {
        System.out.println("Quantos números você deseja acrescentar?");
        int numeroAcrescentar = entrada.nextInt();
        this.numeroContagem +=numeroAcrescentar;


        return numeroContagem;

    }

    public int contagemAtual() {
        return numeroContagem;
    }


}

