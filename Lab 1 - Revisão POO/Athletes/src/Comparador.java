import java.util.Comparator;

public class Comparador implements Comparator<Atleta> {

    // classe que será passada como parâmetro no arraySort, assim, ordenando conforme o alfabeto
    public int compare(Atleta a1, Atleta a2) {
        return a1.getNome().compareTo(a2.getNome());
    }

}
