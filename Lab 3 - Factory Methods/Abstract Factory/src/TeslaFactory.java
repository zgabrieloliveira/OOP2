public class TeslaFactory implements CarFactory {
    
    public Tesla createCarro() {
        System.out.println("Tesla Fabricado!");
        return new Tesla(0, 220, true);
    }

    public MotorTesla createMotor() {
        System.out.println("Motor Elétrico Fabricado!");
        return new MotorTesla();
    }

    public AcessorioTesla createAcessorio() {
        System.out.println("Piloto Automático Fabricado!");
        return new AcessorioTesla();
    }


}
