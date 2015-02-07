// Xavier Escobar
// CSE 002
// February 10th, 2015
// FourDigits.java will pint the first 4 digits to the right of the decimal point.

import java.util.Scanner;//import Scanner class

public class FourDigits {
    //main method
    public static void main(String[] args){
        //declares and constructs an instance of the Scanner object
        Scanner myScanner = new Scanner(System.in);
        //prompts user to input a double
        System.out.println("Enter a double and I display the four digits " + 
            "to the right of the decimal point:");
        double userNumber = myScanner.nextDouble();//accepts and stores user input
        
        //multiplies the number by 10000 to put the first four digits before the
        //  decimal point, then converts into an intiger eliminating everything
        //  after the decimal point. Finally it substracts the original user number
        //  in intiger form * 10000 in order to eliminate the digits before the decimal
        //  and keep the ones after the decimal.
        int fourDigits = (int) (userNumber * 10000) - ((int) userNumber * 10000);
        
        //this section stores the first four digits individually
        int firstDigit = (fourDigits/1000) %10;
        int secondDigit = (fourDigits/100) %10;
        int thirdDigit = (fourDigits/10) %10;
        int fourthDigit = (fourDigits) %10;
        //prints out the first four digits after the decimal point
        System.out.println(""+firstDigit+secondDigit+thirdDigit+fourthDigit);
        
    }// main method ends
}// class ends
        
