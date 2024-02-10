package semana05.aula04;

public class Animal {

    private int numeroPatas;

    private String paisOrigem;

    private String tamanho;
    private String corCorpo;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCorCorpo() {
        return corCorpo;
    }

    public void setCorCorpo(String corCorpo) {
        this.corCorpo = corCorpo;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
}
