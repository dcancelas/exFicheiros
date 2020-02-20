package lectura;

public class Xogador {

    String nome;
    int dorsal;

    public Xogador() {
    }
    public Xogador(String nome, int dorsal) {
        this.nome = nome;
        this.dorsal = dorsal;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
}
