import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        //asks user for input
        System.out.println("Please enter an intiger: ");
        int n = myScanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            //will calculate de factorial of each decrement of n and add them
            sum += factorial(i);//super factorial
        }
        //call print method
        print(n,sum);
  
    }//end main method
    //create method that calculates the factorial of the input
    public static int factorial(int input) {
        
         for (int i = input - 1; i > 0; i--) {
            input *= i;
        }//end fo loop
        //returns the value of new value of input-- the factorial of the input.
        return input;
    }// end factorial method
    //create method print will print out the output 
    //use void because method does not return a value
    public static void print(int input, int sum) {
        
        System.out.println("The super factorial of " + input + " is  " + sum);

    }// end print method
}//end class
