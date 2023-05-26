package Menu;

import java.util.Scanner;
import Observable.WeatherForecast;
import Observers.Airport;
import Observers.Farmer;
import Observers.Journal;
import Observers.Observer;

/*
Implemente o padrão comportamental Observer. Crie uma classe concreta PrevisaoTempo que implementa a interface Observable. 
A classe contém atributos como temperatura, umidade, chuva e velocidade do vento. 
O objeto observável deve guardar uma lista de Observers e notificá-los quando houver alterações. 
Crie um menu para que o usuário possa adicionar e remover observadores à PrevisaoTempo, e uma opção para executar. 
Durante a execução, sua classe PrevisaoTempo deve mudar o estado de seus atributos aleatoriamente a cada tantos segundos. 
As classes que implementam a interface Observer são Jornal, Aeroporto e Agricultor. 
Cada uma deve reagir de forma diferente às mudanças do tempo (use println para exibir as reações). 
Por exemplo, o Aeroporto deve reagir a mudanças de velocidade do vento, mas Jornal e Agricultor não se interessam por esse atributo.
*/

public class Main {

    public static void main(String[] args) throws Exception {
        menu();
    }

    private static void menu() {
        
        Scanner sc = new Scanner(System.in);
        int option = 0;
        WeatherForecast currentWeather = new WeatherForecast();

        while (option != 4) {
            System.out.println("-----------------------------------------\n");
            System.out.println("\tWEATHER FORECAST OBSERVER\n");
            System.out.println("1. Add Observer");
            System.out.println("2. Remove Observer");
            System.out.println("3. Execute Weather Simulation");
            System.out.println("4. Exit");
            System.out.println("\n-----------------------------------------");
            System.out.println("What you want to do? Please, type the corresponding number");
            option = sc.nextInt(); 
            System.out.println();

            verifyOption(sc, option, 1, 5); // check if the option choose is valid

            switch(option) {
                case 1: add(sc, currentWeather);
                    break;
                case 2: remove(sc, currentWeather);
                    break;
                case 3: execute(sc, currentWeather);
                    break;
                case 4: exit();
                    break;
            }
        }
    }

    private static Boolean add(Scanner sc, WeatherForecast currentWeather) {

        System.out.println("Which observer do you want to add into the system?");
        System.out.println("1. Airport\t2. Journal\t3. Farmer");
        int observerChosen = sc.nextInt();

        verifyOption(sc, observerChosen, 1, 3);

        Observer observer = null;

        // creates the object by the user's choice
        switch(observerChosen) {
            
            // construct airport
            case 1: 
                clearBuffer(sc);
                System.out.println("\nWhat's the airport's name?");
                String airportName = sc.nextLine();
                System.out.println("\nIt is a internacional aiport?");
                System.out.println("1. Yes\t2. No");
                int internacional = sc.nextInt();
                verifyOption(sc, internacional, 1, 2);

                if (internacional == 1)
                    observer = new Airport(airportName, true);
                else
                    observer = new Airport(airportName, false); 

                break;  

            // construct journal 
            case 2: 
                clearBuffer(sc);
                System.out.println("\nWhat's the journal's name?");
                String journalName = sc.nextLine();
                System.out.println("\nWhat's the year of the "+ journalName +"'s foundation");
                int year = sc.nextInt();
                observer = new Journal(journalName, year);
                break;

            // construct farmer
            case 3: 
                clearBuffer(sc);
                System.out.println("\nWhat's the farmer's name?"); 
                String farmerName = sc.nextLine();
                clearBuffer(sc);
                System.out.println("\nWhat's the farmer's CPR");
                String cpr = sc.nextLine();
                observer = new Farmer(farmerName, cpr);
                break;
        }

        if (observer != null) {
            currentWeather.addObserver(observer); // adding the observer to the observable weather forecast
            return true;
        }
        else 
            return false;

    }

    private static Boolean remove(Scanner sc, WeatherForecast currentWeather) {

        clearBuffer(sc);
        System.out.println("\nPlease, type the name corresponding to the observer you want to remove:");
        String observerChosen = sc.nextLine();

        for (Observer o : currentWeather.getObservers()) {

            if (o.getName().equals(observerChosen)) {
                currentWeather.removeObserver(o);
                return true;
            }
            else {
                System.out.println("Sorry, Observer Not Found!");
                return false;
            }    
        }
        return false;    
    }

    private static Boolean execute(Scanner sc, WeatherForecast currentWeather) {

        while(true) {
            currentWeather.changeState();
            System.out.println("Do you want to gerenate another weather forecast");
            System.out.println("1. Yes\t2. No");
            int op = sc.nextInt();
            verifyOption(sc, op, 1, 2);
            if (op == 2)
                return false;
            else 
                return true;
        }

    }

    private static void exit() {
        System.out.println("Exiting...");
        System.exit(0);
    }

    private static Boolean verifyOption(Scanner sc, int option, int lowBound, int highBound) {

        while (option < lowBound || option > highBound) {
            System.out.println("Invalid option! Please, type a valid number...");
            option = sc.nextInt();
        } 
        return true;
    }

    private static void clearBuffer(Scanner sc) {
        if (sc.hasNextLine())
            sc.nextLine();
    }

}