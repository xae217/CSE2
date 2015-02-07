// Xavier Escobar
// CSE 002
// February 10th, 2015
// Root.java calculates an estimate of the cube root of a number given by the user

import java.util.Scanner; //imports Scanner class

public class Root {
    //main method
    public static void main(String[] args){
        //declares and constructs an instance of the Scanner object
        Scanner myScanner = new Scanner(System.in);
        //prompts user for input on a number to calculate its cube root
        System.out.println("Enter a double and I print its cube root:");
        //accepts and stores use input
        double userNumber = myScanner.nextDouble();
        
        //creates a guess estimating the square root
        double guess = userNumber/3;
        //makes the guess more accurate each time becaus a new value keeps getting stored and then used
        guess = (2*guess*guess*guess+userNumber)/(3*guess*guess);
        guess = (2*guess*guess*guess+userNumber)/(3*guess*guess);
        guess = (2*guess*guess*guess+userNumber)/(3*guess*guess);
        guess = (2*guess*guess*guess+userNumber)/(3*guess*guess);
        guess = (2*guess*guess*guess+userNumber)/(3*guess*guess);
        
        //stores the final, most accurate, guess as the cube root result
        double cubeRoot = guess;
        //print out result
        System.out.println("The cube root is " + cubeRoot + ": ");
        //checks the result
        System.out.println(cubeRoot+"*"+cubeRoot+"*"+cubeRoot+" = "+
            (cubeRoot*cubeRoot*cubeRoot));
    
    }// end of main method 
}// end of class