package semana05.aula03.exercicio01;

public class Pessoa {
    private String  nome;
    private int idade;

    public Pessoa (
            String nome,
            int idade
    ){
        this.nome = nome;
        this.idade = idade;
    }
@Override
    public String toString(){
        return "Nome: " + nome + "\nIdade: " + idade;
    }

}
