public class Main {
    public static void main(String[] args) throws Exception {
        
        // criação de fábricas
        LamborghiniFactory lamborghiniFac = new LamborghiniFactory();
        PoloFactory poloFac = new PoloFactory();
        TeslaFactory teslaFac = new TeslaFactory();

        // criação de carros 
        Lamborghini lamborghini = lamborghiniFac.createCarro();
        Polo polo = poloFac.createCarro();
        Tesla tesla = teslaFac.createCarro();

        System.out.println();
        
        // criação de motores
        MotorLamborghini mtLamborghini = lamborghiniFac.createMotor();
        MotorPolo mtPolo = poloFac.createMotor();
        MotorTesla mtTesla = teslaFac.createMotor();

        System.out.println();

        // criação de acessórios
        AcessorioLamborghini acLamborghini = lamborghiniFac.createAcessorio();
        AcessorioPolo acPolo = poloFac.createAcessorio();
        AcessorioTesla acTesla = teslaFac.createAcessorio();

        System.out.println();

        // testando métodos dos carros
        lamborghini.acelerar(100);
        polo.acelerar(50);
        polo.frear(25);
        tesla.acelerar(200);

        System.out.println();

        // testando métodos dos motores
        mtLamborghini.ignicao();
        mtPolo.ignicao();
        mtTesla.ignicao();

        System.out.println();
        
        // testando métodos dos acessórios
        acLamborghini.multimidia();
        acPolo.multimidia();
        acTesla.multimidia();

    }
    
}
