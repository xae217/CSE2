// Xavier Escobar
// CSE 002
// February 13th, 2015
// Cookies.java determines if the number of cookies is evenly divisible among 
//  the people and if there is enough for each person, by accepting user input.

import java.util.Scanner;//imports Scanner class

public class Cookies {
    //main method
    public static void main(String[] args){
        //declares and construct an instace of the Scanner class
        Scanner myScanner = new Scanner(System.in);
        //propmts user for input on number of People as an int
        System.out.println("Enter the number of People: ");
        int nPeople;//declare variable to be used outside if statement
        //if statement that checks for correct input (int)
        if (myScanner.hasNextInt()) {
            //if the input is an int then it stores it a variable
            nPeople = myScanner.nextInt();
            //nested if statement checks if the int is negative
            if (nPeople < 0) { 
                //if condition is true then it prints an error message
                System.out.println("You did not enter and int > 0");
                return;//and terminates the program
            }//nested if statement ends
        }//if statement ends
        else {//else statement befins
            //if the input is not an int then it prints an error message 
          System.out.println("You did not enter an int");
          return;//and it terminates the program
        }//else statement ends
        
        //prompts user for input on # of cookies they are planning to buy
        System.out.println("Enter the number of cookies" +
            " you are planning to buy:");
        int nCookies;//declare variable to be used outside if statement
        //checks for correct input (int > 0) using same method as above
         if (myScanner.hasNextInt()) {
             nCookies = myScanner.nextInt();
             if (nCookies < 0){ 
                System.out.println("You did not enter and int > 0");
                return;
            }//nested if statement ends
        }//if statement ends
        //if the input is not an int then the program is terminated
        else {
             System.out.println("You did not enter an int");
          return;
        }//else statement ends
        
        //prompts the user on how many cookies each person gets
        System.out.println("How many do to want each person to get?");
        int cookiesPP;//declare variable to be used outside if statement
        //checks for correct input (int > 0) using same method as above
        if (myScanner.hasNextInt()) {
             cookiesPP = myScanner.nextInt();
             if (cookiesPP < 0){ 
                System.out.println("You did not enter and int > 0");
                return;
            }//nested if statement ends
        }//if statement ends
        //if the input is not an int then the program is terminated
        else {
             System.out.println("You did not enter an int");
          return;
        }//else statement ends
        
        //perform calculations to see if:
        //  there is enough cookies for each person
        //  there the amount will divide evenly
        //  there is a deficit and print how much
        //do so by creating an if statement
        //checks if there are enough cookies and if they are evenly divisible
        if ((nCookies/nPeople) > cookiesPP && nCookies%nPeople == 0) {
            //prints the results
            System.out.println("You have enough cookies for each person" +
                " and the amount will divide evenly.");
        }
        //checks if there are enough cookies and if they aren't evenly divisible
        else if ((nCookies%nPeople) > 0) {
            //prints the results
            System.out.println("You have enough, but they will not" +
                " divide evenly.");
        }
        //if there are not enough cookies then it outputs the deficit
        else {
            //calculates the deficit of cookies
            int deficit = (nPeople*cookiesPP - nCookies);
            //prints message and least number of cookies needed
            System.out.println("You will not have enough cookies. " +
                "You need to buy at least " + deficit + " more.");
        }
    }//end main method
}//end class
        