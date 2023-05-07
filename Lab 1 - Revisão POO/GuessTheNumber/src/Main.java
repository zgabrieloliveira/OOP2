import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ex03
        Random gerador = new Random();
        int numAleatorio = gerador.nextInt(101);
        System.out.println(numAleatorio);

        System.out.println("Foi criado um número aleatório entre 0 e 100! Adivinhe qual é!");
        int chute = sc.nextInt();

        while (numAleatorio != chute) {

            if ((numAleatorio - chute) <= 5) // se a diferença for pequena, o user é informado
                System.out.println("SINTO MUITO!\nVocê errou, porém está próximo! Tente novamente");
            else
                System.out.println("SINTO MUITO!\nVocê errou! Tente novamente");

            chute = sc.nextInt();
        }

        if (numAleatorio == chute)
            System.out.println("PARABÉNS! Você acertou o número!");

    }
}