package semana04.aula03.abstracao;

import java.time.LocalDate;

public class Pessoa {

    public String nome;
    public LocalDate dataNascimento;
    public float altura;
    public char sexo;
    public String etnia;
    public String corCabelo;
    public float peso;
    public String nacionalidade;
    public String corOlho;
    public String endereco;

    public void acordar(){
        System.out.println("Acordando");
    }

    public void espreguicar(){
        System.out.println("Acordando mais");
    }
    public void andar(){
        System.out.println("Andando");
    }

    public void trabalhar() {
        System.out.println("Trabalhando");
    }

    public void programar(){
        System.out.println("Programando");
    }
public int calcularIdade () {
    System.out.println("Calculando idade: ");
    return 18;
}

}
