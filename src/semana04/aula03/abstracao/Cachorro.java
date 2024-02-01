package semana04.aula03.abstracao;

import java.time.LocalDate;

public class Cachorro {
    public String nome;
    public LocalDate dataNascimento;
    public float altura;
    public char sexo;
    public String raca;
    public String corPelo;
    public float peso;
    public String corOlho;
    public String endereco;
    public Pessoa nomeTutor;



    public void acordar(){
        System.out.println("O " + nome + " está acordando!");
    }

    public void comer(){
        System.out.println("O " + nome + " está comendo!");
    }
    public void latir(){
        System.out.println("Au au");
    }
    public void andar(){
        System.out.println("O " + nome + " Andando");
    }

    public void dormir(){
        System.out.println("O " + nome + "Dormindo");
    }
    public int diasVacina () {
        System.out.println("Dias para a vacina do " + nome );
        return 18;
    }

}
