import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // Ex04 -> ...

        // instanciando e populando um array e um arraylist
        Atleta[] atletasArray = new Atleta[3];
        atletasArray[0] = new Futebolista("Neymar Jr", 31, 67.00, 1.74, "MEI");
        atletasArray[1] = new Tenista("Roger Federer", 41, 85.00, 1.85, 111);
        atletasArray[2] = new Corredor("Eliud Kipchoge", 38, 52.00, 1.67, "Maratonista");
        Arrays.sort(atletasArray, new Comparador());

        ArrayList<Atleta> atletasArrayList = new ArrayList<>();
        Atleta atleta1 = new Futebolista("Lionel Messi", 35, 62.00, 1.69, "PD");
        atletasArrayList.add(atleta1);
        Atleta atleta2 = new Tenista("Novak Djokovic", 35, 77.00, 1.88, 93);
        atletasArrayList.add(atleta2);
        Atleta atleta3 = new Corredor("Usain Bolt", 36, 94.00, 1.95, "Velocista 100m");
        atletasArrayList.add(atleta3);
        atletasArrayList.sort(new Comparador());

        // percorrendo listas e chamando métodos aquecer() e jogar()
        for (Atleta a : atletasArray) {
            a.aquecer(10);
            a.jogar();
        }

        for (Atleta a : atletasArrayList) {
            a.aquecer(7);
            a.jogar();
        }

        Date olimpiadas = calcularProximaOlimpiada();
        System.out.println("DATA OLIMPÍADAS: " + olimpiadas);
    }

    private static Date calcularProximaOlimpiada() {

        LocalDateTime ldt = LocalDateTime.now();
        Date resultado;
        LocalDate lc;
        int primeiraOlimpiada=1896, anoAtual = ldt.getYear();
        Integer calculo = primeiraOlimpiada;
         
        while (calculo < anoAtual) {
            calculo += 4;
        }

        lc = LocalDate.parse(calculo.toString() + "-" + "06-04");
        resultado = java.sql.Date.valueOf(lc);

        return resultado;

    }
}