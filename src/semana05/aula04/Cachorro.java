package semana05.aula04;

public class Cachorro extends Animal {

    private String corPelo;
    private String raca;
    private String porte;
    private String nome = "Caramelo";

    private boolean temPedigree;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTemPedigree() {
        return temPedigree;
    }

    public void setTemPedigree(boolean temPedigree) {
        this.temPedigree = temPedigree;
    }

    public void latir() {
        System.out.println("AU! AU!");
    }
}
