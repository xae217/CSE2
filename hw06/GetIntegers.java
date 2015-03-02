// Xavier Escobar
// CSE 002
// March 3rd, 2015
// GetIntegers.java  will get 5 ints from user and them together

import java.util.Scanner;//imports Scanner class

public class GetIntegers {
    //main method
    public static void main(String[] args){
        //declares and construct an instace of the Scanner class
        Scanner myScanner = new Scanner(System.in);
        //asks user for 5-non negative integers
        System.out.println("Please enter 5 non-negative integers:");
        //declare variables to use in and outside the for loop
        int sum = 0; 
        int x = 0;
        //for loop initializes int i and gives the condition so that it runs
        // 5 times
        for (int i = 0; i < 5 ; i++ ) {
            //validates input
            if (myScanner.hasNextInt()) {
                //if input is an int then set x to the input
                x = myScanner.nextInt();
                //if statement to chec if x is negative
                if (x < 0) {
                    //if true then print error message and ask for input again
                   System.out.println("Invalid input, enter again:"); 
                   //reset x back to zero 
                   x = 0;
                   //reset i back by one position
                   i--;
                }//end nested if statement
            }//end if stament
            //if the input is not an int then:
            else {
                //scanner accepts invalid input, but does nothing with it
                String invalid  = myScanner.nextLine(); 
                //now Scanner can accept another input
                System.out.println("Invalid input, enter again:");
                i--;
            }
            //adds the accepted x values together
            sum += x;
        }
        // prints out final answer
        System.out.println("Sum is: " + sum);
    }//end main method
}//end class
