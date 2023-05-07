public class Futebolista extends Atleta {

    private String posicao;

    public Futebolista(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    public Futebolista(String nome, int idade, double peso, double altura, String posicao) {
        super(nome, idade, peso, altura);
        this.posicao = posicao;
    }

    public void jogar() {
        System.out.println("Jogando Futebol\n");
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "NOME: " + getNome() + '\n'
                + "IDADE: " + getIdade() + '\n'
                + "PESO: " + getPeso() + '\n'
                + "ALTURA: " + getAltura() + '\n'
                + "POSIÇÃO: " + getPosicao();
    }

}

