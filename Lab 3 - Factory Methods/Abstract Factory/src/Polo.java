public class Polo extends Carro {

    private Boolean usado;

    public Polo(float velocidadeAtual, float velocidadeMax, Boolean usado) {
        super(velocidadeAtual, velocidadeMax);
        this.usado = usado;
    }

    public void acelerar(float incremento) {

        if ((velocidadeAtual+incremento) < velocidadeMax) 
            velocidadeAtual += incremento;
        else 
            velocidadeAtual = velocidadeMax;
        
        System.out.println("Velocidade Atual do Polo: " + getVelocidadeAtual());
    }

    public void frear(float decremento) {
        
        if ((velocidadeAtual - decremento) > 0)
            velocidadeAtual -= decremento;
        
        else 
            velocidadeAtual = 0;

        System.out.println("Velocidade Atual do Polo: " + getVelocidadeAtual());
    }

    public Boolean getUsado() {
        return usado;
    }

    public void setUsado(Boolean usado) {
        this.usado = usado;
    }

    
}
