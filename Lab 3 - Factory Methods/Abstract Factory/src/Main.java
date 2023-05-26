/*
Implemente o padrão Abstract Factory em uma aplicação de Combo, em que há fábricas diferentes para carros de marcas diferentes.
Cada Carro possui um Motor e Acessórios. 
Demonstre o funcionamento do padrão na sua função main, fabricando pelo menos 3 tipos diferentes de Carro. 

*/


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
