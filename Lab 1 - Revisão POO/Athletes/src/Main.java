import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

/* 

CLASSES E OBJETOS

4) Crie uma classe abstrata chamada Atleta. Inclua atributos privados (nome, idade, peso, altura, etc), e getters e setters públicos. 
Inclua também um construtor que possa criar a classe com estes atributos setados. A classe tem um método "aquecer" que recebe o número
de minutos de aquecimento e imprime na tela informações de aquecimento. A classe também possui um método abstrato "jogar".

5) Implemente o método 'toString' da classe. 

6) Crie 3 classes que herdam de Atleta, por exemplo: Futebolista, Tenista e Corredor. Use polimorfismo para que cada um tenha sua
implementação própria do método "jogar", que imprime um texto diferente (por exemplo, o método jogar de Tenista imprime "jogando tênis").

7) Construa e popule duas listas de Atletas, uma em forma de vetor e outra em forma de ArrayList. Ordene os atletas das listas por nome 
usando o método "compareTo" da interface Comparable (você precisa implementar essa interface). Percorra o vetor com um 'for', chamando 
os métodos "aquecer" e "jogar" para todos os objetos da lista. No caso da List, percorra a lista usando um loop do tipo 'for-each'. 

8) Por fim, inclua um método estático para 'calcularProximaOlimpiada' que imprime o tempo restante para a próxima Olimpíada em dias,
e retorna um objeto Date com a data da próxima Olimpíada.

9) Demonstre o funcionamento de tudo no seu método "main".

*/

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