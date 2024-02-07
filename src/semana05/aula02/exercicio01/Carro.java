package semana05.aula02.exercicio01;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(
            String marca,
            String modelo,
            int ano
    ){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirCarro(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

}
