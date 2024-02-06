package semana05.aula01;

public class MotorEletrico {
    int temperatura;
    int velocidade;
    int tensaoAplicada;

    public void alterarVelocidade(int novaVelocidade){
        novaVelocidade = velocidade;

    }

    public void exibirTemperatura(){
        System.out.println("A temperatura é: " + temperatura + "°C");
    }

    public void exibirInformacoes(){
        System.out.println("A temperatura é: " + temperatura + "°C" );
        System.out.println("A velocidade é: " + velocidade + "km/h");
        System.out.println("A  tensaoAplicada é: " + tensaoAplicada + "kg");
    }
}
