// Xavier Escobar
// CSE 002
// February 17th, 2015
// Banking.java will give the user a random amount of money and let them perform
// banking transactions such as withdrawing or deposting money

import java.util.Scanner;//imports Scanner class
import java.util.Random;//import Random method

public class Banking {
    //main method
    public static void main(String[] args){
        //declares and construct an instace of the Scanner class
        Scanner myScanner = new Scanner(System.in);
        //declares and constructs an instace of the Random method
        Random randomN = new Random();
        //generates initial value for user from $1000 to $5000 using random class
        int inValue = randomN.nextInt(4000) + 1000;
        //converts initial value into a double in variable 'available balance'
        double avBalance = (double) inValue;
        //prints welcome message, display available balance
        // and gives the user options to deposit, withdraw, view balance or exit
        System.out.println("Welcome back!");
        System.out.println("What would you like to do?");
        //to display balance in $xxxx.xx format add a 0 in the end of avBalance
        System.out.println("Your available balance is: $" + avBalance + "0");
        System.out.println("- Enter '1' to make deposit.");
        System.out.println("- Enter '2' to withdraw.");
        System.out.println("- Enter '3' to view available balance.");
        System.out.println("- Enter '4' to exit.");
        
        //if statement to check if the input is an int
        if (myScanner.hasNextInt()) {
            //if it is an int then run a switch statement with different cases
            int input = myScanner.nextInt();//stores user input
            switch (input) {
            //if the input is an int and is the number 1 then:
            case 1:
                //ask the user how much would they want to deposit
                System.out.println("How much would you like to deposit?");
                double deposit = myScanner.nextDouble();//store user input
                //check if input is greater than 0
                if (deposit > 0) {
                    avBalance = avBalance + deposit;
                    //print new available balance
                    System.out.println("Your available balance is: $" 
                        + avBalance);
                }//end nested if statement
                //if input is less than 0
                else {
                    //print error message
                    System.out.println("Please enter a number greater than 0.");
                }//end nested else statement
                break;
            //if the input is an int and it is the number 2 then:
            case 2:
                //ask the user how much would they like to withdraw
                System.out.println("How much would you like to withdraw?");
                double withdraw = myScanner.nextDouble();//store user input
                //check if input is > 0 and less than the available balance
                if (0 < withdraw && withdraw < avBalance) {
                    avBalance = avBalance - withdraw;
                    //print new available balance
                   System.out.println("Your available balance is: $" 
                            + avBalance); 
                }//end nested if statement
                //if input is less than 0 or more than the available balance
                else {
                    //print error message
                    System.out.println("Please enter a number greater than 0"
                        + " or less than your available balance.");
                }//end nested else statement
                break;
            //if input is an int and it is the number 3 then:
            case 3:
                //print available balance
                System.out.println("Your available balance is: $" + 
                    avBalance + "0");
                break;
            //if input is an int and it is the number 4 then:
            case 4:
                //print goodbye message and terminate program
                System.out.println("Thank you for prefering us.");
                break;
            //if input is an int but it is not the number 1,2,3 or 4 then:
            default:
                //print an error message
                System.out.println("Sorry, that is not a valid input");
            }//end switch statement
        }//end if statement
        //if the number is not an int then:
        else { 
            //print error message
            System.out.println("Sorry, that is not a valid input");
        }//end else statement
    }//end main method
}//end class
