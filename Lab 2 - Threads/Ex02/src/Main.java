import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/* utilizando executores, a saída se mantém correta:
 * um arquivo tem 18 linhas!
 * um arquivo tem 15 linhas!
 * um arquivo tem 9 linhas!
 */

public class Main {
    public static void main(String[] args) {

        ThreadPoolExecutor e = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
        e.execute(new LineCounterExecutors("C:\\Users\\xgabr\\OneDrive - Universidade Federal de Uberlândia\\GSI 020\\Labs\\Lab 1\\Arquivos de Teste\\file1.txt"));
        e.execute(new LineCounterExecutors("C:\\Users\\xgabr\\OneDrive - Universidade Federal de Uberlândia\\GSI 020\\Labs\\Lab 1\\Arquivos de Teste\\file2.txt"));
        e.execute(new LineCounterExecutors("C:\\Users\\xgabr\\OneDrive - Universidade Federal de Uberlândia\\GSI 020\\Labs\\Lab 1\\Arquivos de Teste\\file3.txt"));
    }
}