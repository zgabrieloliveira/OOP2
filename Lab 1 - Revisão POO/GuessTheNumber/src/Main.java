import java.util.Scanner;
import java.util.Random;

/*

TÁ QUENTE, TÁ FRIO...

3) Escreva um programa que gera um número aleatório de 1 a 100, e então pede para o usuário adivinhar o número. 
O programa deve retornar se o chute do usuário foi muito alto ou muito baixo, e então pedir outro chute até que o usuário acerte.

*/

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