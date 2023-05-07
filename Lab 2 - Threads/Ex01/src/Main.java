/* utilizando apenas threads "na mão", a saída está correta: 
 * um arquivo tem 15 linhas!
 * um arquivo tem 18 linhas!
 * um arquivo tem 9 linhas!
 */

public class Main {
    public static void main(String[] args) {

        Thread lc1 = new Thread(new LineCounter("C:\\Users\\xgabr\\OneDrive - Universidade Federal de Uberlândia\\GSI 020\\Labs\\Lab 1\\Arquivos de Teste\\file1.txt"));
        lc1.start();
        Thread lc2 = new Thread(new LineCounter("C:\\Users\\xgabr\\OneDrive - Universidade Federal de Uberlândia\\GSI 020\\Labs\\Lab 1\\Arquivos de Teste\\file2.txt"));
        lc2.start();
        Thread lc3 = new Thread(new LineCounter("C:\\Users\\xgabr\\OneDrive - Universidade Federal de Uberlândia\\GSI 020\\Labs\\Lab 1\\Arquivos de Teste\\file3.txt"));
        lc3.start();

    }
}