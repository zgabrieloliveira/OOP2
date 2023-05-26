import java.util.Scanner;

/*

1) Escreva um programa Java que implementa o padrão de projeto criacional Builder. 
O objetivo do programa é construir um personagem de um jogo de RPG. As opções de construção são selecionadas pelo usuário. 
O programa deve ter uma interface de texto estilo“menu” e oferecer ao usuário opções 
“Criar Novo Personagem”, “Digitar Nome”, “Selecionar Profissão”, “Selecionar Equipamento”, “Rolar Atributos Aleatoriamente”, etc, 
em qualquer ordem (use a imaginação para elaborar as opções).
Também deve haver uma opção para o usuário avisar que terminou de montar o personagem.

2) Implemente o método toString() para que, ao término da construção do personagem seu programa imprima uma descrição do personagem completo 
(exemplo: “Ragnar, elfo guerreiro | Vida: 5 | Força: 8 | Defesa: 7 | Arma: espada de gelo | Item: poção de cura”).

*/


public class Main {
    public static void main(String[] args) throws Exception {
        menu();
    }

    private static void menu() {

        Scanner sc = new Scanner(System.in);
        CharacterBuilder character = new CharacterBuilder();
        Director director = new Director(character);
        int op=0;

        while(op != 6) {
            System.out.println("\n=========================================");
            System.out.println("\tBRIGHT SOULS");
            System.out.println("=========================================\n");
            System.out.println("1. Create new character");
            System.out.println("2. ");
            System.out.println("3. Leave Game\n");
            System.out.println("=========================================");
            System.out.println("Please, choose a option");
            op = sc.nextInt();
            op = Director.verifyOption(sc, op, 1, 3); // validating option 
            
            switch(op) {
                case 1:
                    character.reset(); // reseting character
                    director.makeCharacter();
                    break;
                case 2: 
                    break;
                case 3: 
                    leave();
            }          
        }
    }

    private static void leave() {

        System.out.println("\nThank you for joining the game! See you soon...");
        System.exit(0);

    }
}
