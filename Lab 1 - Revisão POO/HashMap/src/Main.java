import java.util.HashMap;
import java.util.Scanner;

/* 

STRINGS

2) Faça um programa que lê uma string e conta os caracteres que aparecem nela, colocando caracteres 
e suas quantidades em um HashMap. Ao terminar a leitura, o programa mostra os caracteres e a quantidade de cada um.

*/

public class Main {

    public static void main (String[] args) {

        // Ex02
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> relacaoCV = new HashMap<>();

        System.out.println("Digite uma String qualquer, esse programa contará quantas vezes cada caracter aparece na palavra");
        String palavra = sc.nextLine();

        for (int i=0; i<palavra.length(); i++) {
            char cast = palavra.charAt(i);

            if (relacaoCV.containsKey(cast))
                relacaoCV.put(cast, (relacaoCV.get(cast)+1));
            else
                relacaoCV.put(cast, 1);
        }

        System.out.println("Este é o conjunto Letra-Repetições da palavra " + relacaoCV);

        sc.close();
    }
}

