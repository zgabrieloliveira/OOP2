import java.util.Random;
import java.util.Scanner;

public class Director {
    
    private CharacterBuilder builder;

    public Director(CharacterBuilder builder) {
        this.builder = builder;
    }

    public void makeCharacter() {

        int op=0;

        while(op != 6) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\n-----------------------------------");
            System.out.println("\tCHARACTER BUILDING");
            System.out.println("-----------------------------------\n");
            System.out.println("1. Choose your name");
            System.out.println("2. Select your class");
            System.out.println("3. Select weapon");
            System.out.println("4. Select personal item");
            System.out.println("5. Generate random character");
            System.out.println("6. Done");
            System.out.println("-----------------------------------\n");
            System.out.println("Please, choose a option");
            op = sc.nextInt();
    
            op = verifyOption(sc, op, 1, 6); // validating option 
    
            // the user can make your character in any other
            switch(op) {
                case 1: chooseName(sc, builder);
                    break;
                case 2: chooseClass(sc, builder);
                    break;
                case 3: chooseWeapon(sc, builder);
                    break;
                case 4: choosePersonalItem(sc, builder);
                    break;
                case 5: gerenateRandom(sc, builder);
                    break;
                case 6: 
                    System.out.println(builder.getResult());    
                    loading();
                    break;
            }      
        }
    }

    public static int verifyOption(Scanner sc, int op, int lowBound, int highBound) {

        while (op < lowBound || op > highBound) {
            System.out.println("Type a valid value!");
            op = sc.nextInt();
        }

        return op;
        
    }

    private static void chooseName(Scanner sc, CharacterBuilder builder) {

        System.out.println("\nType your name:");
        clearBuffer(sc);
        String name = sc.nextLine();
        builder.stepName(name);
        System.out.println("\nGood luck, " + builder.hero.getName() + "!");
        loading();

    }

    private static void chooseClass(Scanner sc, CharacterBuilder builder) {

        System.out.println("\nSelect your class:");
        System.out.println("\n1. Warrior\n2. Thief\n3. Cleric\n4. Sorcerer\n5. Pyromancer\n6. Doomed");
        int expertise = sc.nextInt();

        expertise = verifyOption(sc, expertise, 1, 6);

        builder.stepExpertise(expertise);
        builder.hero.seeStats();
        
        System.out.println("Do you want to rechoose your class?");
        System.out.println("1. Yes\t2. No");
        int op = sc.nextInt();

        op = verifyOption(sc, op, 1, 2);

        while (op == 1) {

            System.out.println("\n1. Warrior\n2. Thief\n3. Cleric\n4. Sorcerer\n5. Pyromancer\n6. Doomed");
            expertise = sc.nextInt();

            expertise = verifyOption(sc, expertise, 1, 6);

            builder.stepExpertise(expertise);
            builder.hero.seeStats();

            System.out.println("Do you want to rechoose your class?");
            System.out.println("1. Yes\t2. No");
            op = sc.nextInt();
    
            op = verifyOption(sc, op, 1, 2);

        }

        System.out.println("\nOk, now you're a " + builder.hero.getExpertise() + "...");
        loading();

    }

    private static void chooseWeapon(Scanner sc, CharacterBuilder builder) {

        System.out.println("\nSelect your weapon:");
        System.out.println("\n1. Smith's Sword\n2. Black Blade\n3. War Hammer\n4. Butcher's Cleaver\n5. Knight's Halberd\n6. Broken Sword");
        int weapon = sc.nextInt();

        weapon = verifyOption(sc, weapon, 1, 6);

        System.out.println("Do you want to rechoose your weapon?");
        System.out.println("1. Yes\t2. No");
        int op = sc.nextInt();

        op = verifyOption(sc, op, 1, 2);

        while (op == 1) {

            System.out.println("\nSelect your weapon:");
            System.out.println("\n1. Smith's Sword\n2. Black Blade\n3. War Hammer\n4. Butcher's Cleaver\n5. Knight's Halberd\n6. Broken Sword");
            weapon = sc.nextInt();
    
            weapon = verifyOption(sc, weapon, 1, 6);
    
            builder.stepWeapon(weapon);

            System.out.println("\nGreat! You chose " + builder.hero.getWeapon() + "...");
            System.out.println("Do you want to rechoose your weapon?");
            System.out.println("1. Yes\t2. No");
            op = sc.nextInt();
    
            op = verifyOption(sc, op, 1, 2);

        }
        
        builder.stepWeapon(weapon);
        System.out.println("\nGreat! You chose " + builder.hero.getWeapon() + "...");
        loading();
    }

    private static void choosePersonalItem(Scanner sc, CharacterBuilder builder) {

        System.out.println("\nSelect your personal item: ");
        System.out.println("\n1. Traveler's Devotion\n2. White Flame Bomb\n3. Wrath Potion\n4. Master Key\n5. Church's Chaplet\n6. Miracle Flask");
        int personalItem = sc.nextInt();

        personalItem = verifyOption(sc, personalItem, 1, 6);

        System.out.println("Do you want to rechoose your personal item?");
        System.out.println("1. Yes\t2. No");
        int op = sc.nextInt();

        op = verifyOption(sc, op, 1, 2);
        
        while (op == 1) {

            System.out.println("\nSelect your personal item: ");
            System.out.println("\n1. Traveler's Devotion\n2. White Flame Bomb\n3. Wrath Potion\n4. Master Key\n5. Church's Chaplet\n6. Miracle Flask");
            personalItem = sc.nextInt();
    
            personalItem = verifyOption(sc, personalItem, 1, 6);

            builder.stepPersonalItem(personalItem);
            System.out.println("You chose " + builder.hero.getPersonalItem() + "! Good pick...");
            System.out.println("Do you want to rechoose your personal item?");
            System.out.println("1. Yes\t2. No");
            op = sc.nextInt();
    
            op = verifyOption(sc, op, 1, 2);

        }

        builder.stepPersonalItem(personalItem);
        System.out.println("You chose " + builder.hero.getPersonalItem() + "! Good pick...");
        loading();

    }

    private static void gerenateRandom(Scanner sc, CharacterBuilder builder) {

        Random r = new Random();
        System.out.println("\nGenerating random character...");
        loading();
        builder.stepExpertise(r.nextInt(6));
        builder.stepWeapon(r.nextInt(6));
        builder.stepPersonalItem(r.nextInt(6));

        System.out.println("Character built!");
        chooseName(sc, builder);
        System.out.println(builder.getResult());
        loading();
        
    }

    // delays the prompt, simulating a mini-loading
    private static void loading() {
        try { 
            Thread.sleep (3000); 
        } 
        catch (InterruptedException ex) {
            ex.getMessage();
        }
    }

    // cleans the reading buffer
    private static void clearBuffer(Scanner sc) {
        if (sc.hasNextLine())
            sc.nextLine();
    }

    public CharacterBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(CharacterBuilder builder) {
        this.builder = builder;
    }

}
