public class Corredor extends Atleta {

    String modalidade;

    public Corredor(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    public Corredor(String nome, int idade, double peso, double altura, String modalidade) {
        super(nome, idade, peso, altura);
        this.modalidade = modalidade;
    }

    public void jogar() {
        System.out.println("Correndo\n");
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    @Override
    public String toString() {
        return "NOME: " + getNome() + '\n'
                + "IDADE: " + getIdade() + '\n'
                + "PESO: " + getPeso() + '\n'
                + "ALTURA: " + getAltura() + '\n'
                + "MODALIDADE: " + getModalidade();
    }
}
