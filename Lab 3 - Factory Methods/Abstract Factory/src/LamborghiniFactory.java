public class LamborghiniFactory implements CarFactory {
    
    public Lamborghini createCarro() {
        System.out.println("Lamborghini Fabricada!");
        return new Lamborghini(0, 320, "Aventador");
    }
    
    public MotorLamborghini createMotor() {
        System.out.println("Motor V12 5.0 Fabricado!");
        return new MotorLamborghini();
    }

    public AcessorioLamborghini createAcessorio() {
        System.out.println("Spoiler Lamborghini Fabricado!");
        return new AcessorioLamborghini();
    }

}
