package semana05.aula02.exercicio05;

public class Aluno {
    private String nome;
    private int idade;
    private double nota;


    public Aluno(
            Aluno aluno
    ){
        Aluno aluno1 = new Aluno(aluno);
        aluno1.nome = this.nome;
        aluno1.idade = this.idade;
        aluno1.nota = this.nota;
    }
}
