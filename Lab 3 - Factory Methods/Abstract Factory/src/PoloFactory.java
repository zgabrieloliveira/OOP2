public class PoloFactory implements CarFactory {
    
    public Polo createCarro() {
        System.out.println("Polo Fabricado!");
        return new Polo(0, 200, false);
    }

    public MotorPolo createMotor() {
        System.out.println("Motor 200 TSI Fabricado!");
        return new MotorPolo();
    }

    public AcessorioPolo createAcessorio() {
        System.out.println("Teto Solar Fabricado!");
        return new AcessorioPolo();
    }

}
