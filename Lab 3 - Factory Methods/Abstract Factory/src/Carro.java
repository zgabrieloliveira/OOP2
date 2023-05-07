public abstract class Carro implements InterfaceCarro {
    
    protected float velocidadeAtual;
    protected float velocidadeMax;

    public Carro(float velocidadeAtual, float velocidadeMax) {
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMax = velocidadeMax;
    }

    public void acelerar(float incremento) {

        if ((velocidadeAtual+incremento) < velocidadeMax) 
            velocidadeAtual += incremento;
        else 
            velocidadeAtual = velocidadeMax;
        
        System.out.println("Velocidade Atual: " + getVelocidadeAtual());
    }

    public void frear(float decremento) {
        
        if ((velocidadeAtual - decremento) > 0)
            velocidadeAtual -= decremento;
        
        else 
            velocidadeAtual = 0;

        System.out.println("Velocidade Atual: " + getVelocidadeAtual());
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    public float getVelocidadeMax() {
        return velocidadeMax;
    }
    public void setVelocidadeMax(float velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
  
}
