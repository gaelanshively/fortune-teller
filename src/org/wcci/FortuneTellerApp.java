package org.wcci;

import java.util.Scanner;

public class FortuneTellerApp {

    public static void main(String[] args) {
	// get first name
        System.out.println("What is your first name?");
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        //System.out.println(firstName);

        // ask for last name
        System.out.println("What is your last name, " + firstName + "?");
        String lastName = input.nextLine();
        String fullName = firstName + " " + lastName;
        //System.out.println(lastName);

        // Ask for age
        System.out.println("How old are you, " + firstName + ", in an integer value?");
        int age = input.nextInt();
        //System.out.println(age);

        //Get birth month
        System.out.println("What is your birth month (as an integer), " + firstName + "?");
        int birthMonth = input.nextInt();
        //System.out.println(birthMonth);
        input.nextLine();

        //get favorite color
        System.out.println("What is your favorite color (from ROYGBIV), " + firstName + "?  If you are uncertain, please type help.");
        String favoriteColor = input.nextLine();
        if (favoriteColor.equalsIgnoreCase("help")){
            System.out.println("Use Red, Orange, Yellow, Green, Blue, Indigo, or Violet.");
                    System.out.println("What is your favorite color (from ROYGBIV), " + firstName + "?");
            favoriteColor = input.nextLine();
        }
        //System.out.println(favoriteColor);

        //get siblings
        System.out.println(firstName + ", how many siblings do you have (as an integer?");
        int numberOfSiblings = input.nextInt();
        //System.out.println(numberOfSiblings);

        // part 2
        // determine years until retirement

        int numberYearsUntilRetirement = 0;
        if(age % 2 == 0){
            numberYearsUntilRetirement = age + birthMonth;
            numberYearsUntilRetirement = numberYearsUntilRetirement / numberOfSiblings;
        } else {
            numberYearsUntilRetirement = age - birthMonth;
            numberYearsUntilRetirement = numberYearsUntilRetirement / numberOfSiblings;
        }

        //System.out.println(firstName + ", you have " + numberYearsUntilRetirement + " years until you retire.");

        //get vacation home
        String vacationHome = "";

        if(numberOfSiblings == 0){
            vacationHome = "Boca Raton, FL";
        } else if(numberOfSiblings == 1){
            vacationHome = "Nassau, Bahamas";
        } else if(numberOfSiblings == 2){
            vacationHome = "Ponta Negra, Brazil";
        } else if(numberOfSiblings == 3){
            vacationHome = "Portland, OR";
        } else if(numberOfSiblings > 3){
            vacationHome = "Baton Rouge, LA";
        } else {
            vacationHome = "Chernobyl";
        }
        //System.out.println(firstName + ", you will own a vacation home in " + vacationHome + ".");

        //get mode of transportation
        String modeOfTransportation = "";

        switch (favoriteColor.toLowerCase()){
            case "red" : modeOfTransportation = "Maserati";
            break;
            case "orange" : modeOfTransportation = "stallion";
            break;
            case "yellow" : modeOfTransportation = "chariot";
            break;
            case "green" : modeOfTransportation = "taxi";
            break;
            case "blue" : modeOfTransportation = "rickshaw";
            break;
            case "indigo" : modeOfTransportation = "motor scooter";
            break;
            case "violet" : modeOfTransportation = "flying saucer";
            break;
            default:
                modeOfTransportation = "useless pair of shoes";
        }
        // System.out.println(firstName + ", you will get around in a " + modeOfTransportation + ".");

        //get bank balance
        double bankBalance = 0;

        if(birthMonth>=1 && birthMonth<=4){
            bankBalance = 256000.76;
        } else if(birthMonth>=5 && birthMonth<=8) {
            bankBalance = 3687105.42;
        } else if(birthMonth>=9 && birthMonth<=12){
            bankBalance = 512084.32;
        } else {
            bankBalance = -100004.17;
        }

        //display
        System.out.println(fullName + ", you will retire in " + numberYearsUntilRetirement + " years with $" + bankBalance + " in the bank. \n" +
            "You will own a vacation home in " + vacationHome + ", and get around in a " + modeOfTransportation + ".");

    }
}
