import java.util.Date;

public abstract class Atleta {

    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Atleta(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public abstract void jogar();

    public void aquecer(int tempoAqc) {
        System.out.println("TEMPO DE AQUECIMENTO: " + tempoAqc);
    }

    public void ordena() {

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}