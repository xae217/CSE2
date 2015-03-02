// Xavier Escobar
// CSE 002
// March 3rd, 2015
// RunFactorial.java will calculate the factorial of a number from 9 to 16

import java.util.Scanner;//imports Scanner class

public class RunFactorial {
    //main method
    public static void main(String[] args){
        //declares and construct an instace of the Scanner class
        Scanner myScanner = new Scanner(System.in);
        //asks user for 5-non negative integers
        System.out.println("Please enter an integer that is between 9 and 16:");
        //declare variables to use in and outside the for loop
        long factorial = 1; 
        int x = 1; i = 0; input = 0;
        do {
            //this will only run once the input is validated
            if ( i > 0) { 
                factorial *= x;//each time the loop runs it multiples by value x
                x--;//decrements x by one so we can keep using it
                continue;//ignores all subsequent code
            }//end if statement
            //validates input
            if (myScanner.hasNextInt()) {
                //if input is an int then set x to the input
                x = myScanner.nextInt();
                //this makes sure that the first if statement runs next time
                i = 1;
                // this stores the original input to be used in the final print
                input = x;
                //if statement to checx if x is not between the desired interval
                if (x < 9 || x > 16) {
                    //if true then print error message and ask for input again
                   System.out.println("Invalid input, enter again:"); 
                   //reset x back to 1 and i to 0 so that the loop can run again 
                   x = 1;
                   i = 0;
                }//end nested if 
            } //end if statement
            //if the input is not an int then:
            else {
                //scanner accepts invalid input, but does nothing with it
                String invalid  = myScanner.nextLine(); 
                //now Scanner can accept another input
                System.out.println("Invalid input, enter again:");
            }//end else statement
        }//end do statement
        while (x > 0);//while statement. The loop will run unti x reaches 0
        // prints out results
        System.out.println("Input accepted!");
        System.out.println(input + "! = " + factorial);
    }//end main method
}//end class
