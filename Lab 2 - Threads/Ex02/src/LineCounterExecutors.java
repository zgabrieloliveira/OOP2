import java.io.*;
import java.io.LineNumberReader;

public class LineCounterExecutors implements Runnable {

    private File fileName;
    
    public LineCounterExecutors() {
    }


    public LineCounterExecutors(String fileName) {
        this.fileName = new File(fileName);
    }

    public void run() {

        try {
            LineNumberReader counter = new LineNumberReader(new FileReader(fileName));
            counter.skip(Long.MAX_VALUE);
            int lines = counter.getLineNumber();
            System.out.println("O arquivo tem " + lines + " linhas!");
            counter.close();
        }
        catch (IOException e) {
            System.out.println("Ops... Ocorreu um erro com os arquivos");
        }

    }

    public File getFileName() {
        return fileName;
    }


    public void setFileName(File fileName) {
        this.fileName = fileName;
    }
    
}