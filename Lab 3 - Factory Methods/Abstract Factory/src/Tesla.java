public class Tesla extends Carro {

    private Boolean ia;
    
    public Tesla(float velocidadeAtual, float velocidadeMax, Boolean ia) {
        super(velocidadeAtual, velocidadeMax);
        this.ia = ia;
    }

    public void acelerar(float incremento) {

        if ((velocidadeAtual+incremento) < velocidadeMax) 
            velocidadeAtual += incremento;
        else 
            velocidadeAtual = velocidadeMax;
        
        System.out.println("Velocidade Atual do Tesla: " + getVelocidadeAtual());
    }

    public void frear(float decremento) {
        
        if ((velocidadeAtual - decremento) > 0)
            velocidadeAtual -= decremento;
        
        else 
            velocidadeAtual = 0;

        System.out.println("Velocidade Atual do Tesla: " + getVelocidadeAtual());
    }

    public Boolean getIa() {
        return ia;
    }

    public void setIa(Boolean ia) {
        this.ia = ia;
    }

}
