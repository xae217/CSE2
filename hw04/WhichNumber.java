// Xavier Escobar
// CSE 002
// February 17th, 2015
// WhichNumber.java will guess the number the user is thinking of after 
// asking them a series of questions.

import java.util.Scanner;//imports Scanner class

public class WhichNumber {
    //main method
    public static void main(String[] args){
        //declares and construct an instace of the Scanner class
        Scanner myScanner = new Scanner(System.in);
        //propmts user for a number from 1 to 10 inclusive
        System.out.println("Think of a number between 1 and 10 inclusive.");
        System.out.println("Type 'y' for yes and 'n' for no.");
        //begin series of questions
        //asks if number is even
        System.out.println("Is your number even?");
        String input = myScanner.nextLine();
        
        //create a switch statement that will check for a certain input and
        //performs something accordingly (ask another question or guess number)
        //NOTE that each switch statement has cases for yes (y) and  no (n)
        //  and each case must end in a break in order to let the program
        //  exit the switch statement and continue to the next statement
        //  or terminate the program if there is none
        //each switch statement ends with a default statement for imvalid input
        switch (input) {
            //if the number is even then ask if it is divisible by 3
            case "y":
                System.out.println("Is it divisible by 3?");
                input = myScanner.nextLine();
                switch (input) {
                    //if the number is divisible by 3 then we can guess its 6
                    case "y":
                        //asks if the guess was correct
                        System.out.println("Is your number 6?");
                        input = myScanner.nextLine();
                        switch (input) {
                            //celebrate if user confirms correctness
                            case "y":
                                System.out.println("Yay!");
                                break;
                            //call them out if they don't
                            case "n":
                                System.out.println("Liar!");
                                break;
                            default:
                                System.out.println("Sorry, that is" + 
                                    "not a valid input.");
                            }
                        break;   
                    //if the number is not divisible by 3 then:
                    case "n":
                        //ask if it is divisible by 4
                        System.out.println("Is it divisible by 4?");
                        input = myScanner.nextLine();
                        switch (input) {
                        //if the number is divisible by 4 then:
                            case "y":
                            //ask if the answer is greater than 1
                                System.out.println("Is the number divided by"+
                                    " 4 greater than 1?");
                                input = myScanner.nextLine();
                                switch (input) {
                                //if the guess is greater than one then:
                                    case "y":
                                    //guess the number is 8 and ask if its right
                                        System.out.println("Is your number 8?");
                                        input = myScanner.nextLine();
                                        switch (input) {
                                    //celebrate if user confirms correctness
                                            case "y":
                                                System.out.println("Yay!");
                                                break;
                                    //call them out if they don't
                                            case "n":
                                                System.out.println("Liar!");
                                                break;
                                            default:
                                                System.out.println("Sorry, " + 
                                                "that is not a valid input.");
                                        }
                                        break;
                                //if the number is not > 1 
                                    case "n":
                                    //guess the number is 4 and ask if its right
                                        System.out.println("Is your number 4?");
                                        input = myScanner.nextLine();
                                        switch (input) {
                                            case "y":
                                    //celebrate if user confirms correctness
                                                System.out.println("Yay!");
                                                break;
                                            case "n":
                                    //call them out if they don't
                                                System.out.println("Liar!");
                                                break;
                                            default:
                                                System.out.println("Sorry, " + 
                                                "that is not a valid input.");
                                        }
                                        break;
                                    default:
                                        System.out.println("Sorry, that is" + 
                                    " not a valid input.");
                                }
                                break;
                            //if the number is not divisible by 3 then:
                            case "n":
                                //ask if it is divisible by 5
                                System.out.println("Is the number divisible" +
                                    " by 5?");
                                input = myScanner.nextLine();
                                switch (input) {
                                    //if it is divisible by five then guess 10
                                    case "y":
                                    //asks the user if the guess is correct
                                        System.out.println("Is your number 10?");
                                        input = myScanner.nextLine();
                                        switch (input) {
                                    //celebrate if user confrims correctness
                                            case "y":
                                                System.out.println("Yay!");
                                                break;
                                    //call them out if they don't
                                            case "n":
                                                System.out.println("Liar!");
                                                break;
                                            default:
                                                System.out.println("Sorry, " + 
                                                "that is not a valid input.");
                                        }
                                        break;
                                   
                                    //if it does not divide by 5 then guess 2
                                    case "n":
                                    //asks user if the guess is correct
                                        System.out.println("Is your number 2?");
                                        input = myScanner.nextLine();
                                        switch (input) {
                                    //celebrate if user confrims correctness
                                            case "y":
                                                System.out.println("Yay!");
                                                break;
                                    //call them out if they don't
                                            case "n":
                                                System.out.println("Liar!");
                                                break;
                                            default:
                                                System.out.println("Sorry, " + 
                                                " that is not a valid input.");
                                        }//end nested switch statement
                                        break;
                                    default:
                                        System.out.println("Sorry, that is" + 
                                            " not a valid input.");
                                }//end nested switch statement
                                break;
                            default:
                                System.out.println("Sorry, that is" + 
                                    " not a valid input.");
                        }//end nested switch statement
                        break;
                    default:
                        System.out.println("Sorry, that is not a valid input.");
                }//end nested switch statement
                break;
            //if the number is not even (odd) then:
            case "n":
                //ask if it is divisible by 3
                System.out.println("Is it divisible by 3?");
                input = myScanner.nextLine();
                switch (input) {
                    //if the number is divisible by 3 then:
                    case "y":
                        //ask if the answer is < 1
                        System.out.println("When divided by 3 is the result" +
                            " greater than 1?");
                        input = myScanner.nextLine();
                        switch (input) {
                            //if the answer is less than 1 then guess 9
                            case "y":
                                //ask user if guess is correct
                                System.out.println("Is your number 9?");
                                input = myScanner.nextLine();
                                switch (input) {
                                    //respond accordingly
                                    case "y":
                                        System.out.println("Yay!");
                                        break;
                                    case "n":
                                        System.out.println("Liar!");
                                        break;
                                    default:
                                    System.out.println("Sorry, that is" + 
                                        " not a valid input.");
                                }
                                break;
                            //if the anser is greater than 1 then guess 3
                            case "n":
                                //ask user if guess is correct
                                System.out.println("Is your number 3?");
                                input = myScanner.nextLine();
                                switch (input) {
                                    //respond accordingly 
                                    case "y":
                                        System.out.println("Yay!");
                                        break;
                                    case "n":
                                        System.out.println("Liar!");
                                        break;
                                    default:
                                    System.out.println("Sorry, that is" + 
                                        " not a valid input.");
                                }
                                break;
                        }
                        break;
                    //if number is not divisible by 3 then:
                    case "n":
                        //ask if the number is greater than 6
                        System.out.println("Is it greater than 6?");
                        input = myScanner.nextLine();
                        switch (input) {
                            //if it is greater than 6 then guess 7
                            case "y":
                                System.out.println("Is your number 7?");
                                input = myScanner.nextLine();
                                //ask if the guess is correct
                                switch (input) {
                                    //respond accordingly
                                    case "y":
                                        System.out.println("Yay!");
                                        break;
                                    case "n":
                                        System.out.println("Liar!");
                                        break;
                                    default:
                                    System.out.println("Sorry, that is" + 
                                        " not a valid input.");
                                }
                                break;
                            //if it is not greater than 6 then:
                            case "n":
                                //ask if the number is less than 3
                                System.out.println("Is it less than 3?");
                                input = myScanner.nextLine();
                                switch (input) {
                                    //if it is less than 3 then guess 1
                                    case "y":
                                        System.out.println("Is your number 1?");
                                        input = myScanner.nextLine();
                                        //ask if answer is correct
                                        switch (input) {
                                            //respond accordingly
                                            case "y":
                                                System.out.println("Yay!");
                                                break;
                                            case "n":
                                                System.out.println("Liar!");
                                                break;
                                            default:
                                            System.out.println("Sorry, " + 
                                                "that is not a valid input.");
                                        }
                                        break;
                                    //if it is not less than 3 then guess 2
                                    case "n":
                                        System.out.println("Is your number 2?");
                                        input = myScanner.nextLine();
                                        //ask if answer is correct
                                        switch (input) {
                                            //respond accordingly
                                            case "y":
                                                System.out.println("Yay!");
                                                break;
                                            case "n":
                                                System.out.println("Liar!");
                                                break;
                                            default:
                                            System.out.println("Sorry, " + 
                                                "that is not a valid input.");
                                            
                                        }//end nested switch statement
                                        break;
                                    default:
                                        System.out.println("Sorry, that is" + 
                                            " not a valid input.");
                                }//end nested switch statement
                                break;
                            default:
                                System.out.println("Sorry, that is" + 
                                    " not a valid input.");
                        }//end nested switch statement
                        break;
                    default:
                        System.out.println("Sorry, that is not a valid input.");
                }//end nested switch statement
                break;
            //the default statement is used when the input is not valid
            //  not "y" or "n"
            default:
                //prints error message
                System.out.println("Sorry, that is not a valid input.");
        }//end switch statement
    }//end main method
}//end class