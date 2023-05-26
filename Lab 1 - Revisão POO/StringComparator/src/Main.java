import java.util.Random;
import java.util.HashMap;
import java.util.Scanner;

/*

STRINGS 

1) Faça um programa que lê 2 strings e checa se a primeira termina com os caracteres da segunda.

*/

public class Main {

    public static void main (String[] args) {

        // Ex01
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira String: ");
        String str1 = sc.nextLine();
        System.out.println("Digite a segunda String: ");
        String str2 = sc.nextLine();

        if (str1.contains(str2) || str2.contains(str1))
            System.out.println("Há caracteres correspondentes entre as Strings fornecidas");
        else
            System.out.println("Não há caracteres correspondentes entre as Strings");

    }
}