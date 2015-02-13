// Xavier Escobar
// CSE002
// February 6th, 2015
// BigMac.java will compute the cost of buying BigMacs by asking for user input.

import java.util.Scanner; //import Scanner class

public class BigMac {
    //main method
    public static void main(String[] args){
        //declares and construct an instace of the Scanner object
        Scanner myScanner = new Scanner(System.in);
        //asks user for input on number of Big Macs
        System.out.println("Enter the number of Big Macs(an integer > 0): ");
        int nBigMacs = myScanner.nextInt();//accepts user input and stores it as an intiger
        //asks user for cost per Big Mac
        System.out.println("Enter the cost per Big Mac as"+
            " a double (in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble();//accepts input and stores  it as a double
        //asks user for sales tax percent
        System.out.println("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();//accepts input and stores it  as a double
        taxRate/=100;
        
        //Calculate total cost icluding tax
        double cost$ = nBigMacs*bigMac$*(1+taxRate);
        int dollars = (int) cost$;//convert cost into whole dollars
        int dimes = (int) (cost$*10) % 10;//convert remeinder into dimes
        int pennies = (int) (cost$*100) % 10;//convert remeinder into pennies
        
        //print out results
        System.out.println("The total cost of " +nBigMacs
            +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +  
            " sales tax of "+ (int)(taxRate*100) + "%, is $" + //prints tax percentage 
            dollars + "."+ dimes + pennies); //prints cost in $x.xx format
        
    }//end of main method
}//end of class