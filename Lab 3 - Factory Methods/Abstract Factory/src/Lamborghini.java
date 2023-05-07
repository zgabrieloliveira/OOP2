public class Lamborghini extends Carro {

    private String modelo;
    
    public Lamborghini(float velocidadeAtual, float velocidadeMax, String modelo) {
        super(velocidadeAtual, velocidadeMax);
        this.modelo = modelo;
    }

    public void acelerar(float incremento) {

        if ((velocidadeAtual+incremento) < velocidadeMax) 
            velocidadeAtual += incremento;
        else 
            velocidadeAtual = velocidadeMax;
        
        System.out.println("Velocidade Atual da Lamborghini: " + getVelocidadeAtual());
    }

    public void frear(float decremento) {
        
        if ((velocidadeAtual - decremento) > 0)
            velocidadeAtual -= decremento;
        
        else 
            velocidadeAtual = 0;

        System.out.println("Velocidade Atual da Lamborghini: " + getVelocidadeAtual());
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
}
