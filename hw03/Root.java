// Xavier Escobar
// CSE 002
// February 10t, 2015
// Root.java calculates an estimate of the cube root of a number given by the user

import java.util.Scanner; //imports Scanner class

public class Root {
    //main method
    public static void main(String[] args){
        //declares and constructs an instance of the Scanner object
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a double and I print its cube root:");
        double userNumber = myScanner.nextDouble();
        
        double guess = userNumber/3;
        guess = (2*guess*guess*guess+userNumber)/(3*guess*guess);
        guess = (2*guess*guess*guess+userNumber)/(3*guess*guess);
        guess = (2*guess*guess*guess+userNumber)/(3*guess*guess);
        guess = (2*guess*guess*guess+userNumber)/(3*guess*guess);
        guess = (2*guess*guess*guess+userNumber)/(3*guess*guess);
      
        double Root = guess;
        
        System.out.println(Root);
    
    }// end of main method 
}// end of class