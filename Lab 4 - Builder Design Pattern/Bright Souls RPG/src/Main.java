import java.util.Scanner;

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
