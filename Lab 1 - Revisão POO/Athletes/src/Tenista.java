public class Tenista extends Atleta {

    private int numTitulos;

    public Tenista(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    public Tenista(String nome, int idade, double peso, double altura, int numTitulos) {
        super(nome, idade, peso, altura);
        this.numTitulos = numTitulos;
    }

    public void jogar() {
        System.out.println("Jogando Tênis\n");
    }

    public int getNumTitulos() {
        return numTitulos;
    }

    public void setNumTitulos(int numTitulos) {
        this.numTitulos = numTitulos;
    }

    @Override
    public String toString() {
        return "NOME: " + getNome() + '\n'
                + "IDADE: " + getIdade() + '\n'
                + "PESO: " + getPeso() + '\n'
                + "ALTURA: " + getAltura() + '\n'
                + "TÍTULOS: " + getNumTitulos();
    }

}
