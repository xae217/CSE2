// Xavier Escobar
// CSE 002
// February 24th, 2015
// ToHex.java  will convert a RGB value into its hexdecimal representation
import java.util.Scanner;//imports Scanner class

public class ToHex {
    //main method
    public static void main(String[] args){
        //declares and construct an instace of the Scanner class
        Scanner myScanner = new Scanner(System.in);
        //ask user to input RGB values
        System.out.println("Please enter three numbers representing RGB values:");
        int rgb1, rgb2, rgb3;//declare variables to be used outside if statement
        //create three if/else statements to validate the three inputs.
        //check if use input is an int:
        if (myScanner.hasNextInt()) { 
            //if true then store value in a variable and...
            rgb1 = myScanner.nextInt();
            //...check if values is less than 0 or greater than 255
            if (rgb1 < 0 || rgb1 > 255)  {
            //if true then it prints an error message because we need the value
            //  to be from 0 to 255
            System.out.println("Sorry, you must enter values between 0-255.");  
            return;//terminates program
            }//end nested if statement
        }//end if statement
        //if the input is not an int then print error message
        else {
            System.out.println("Sorry, your input must consist of integers.");
            return;//terminate program
        }//end else statement
        
        //do the same for the second RGB value
        if (myScanner.hasNextInt()) {
            rgb2 = myScanner.nextInt();
            if (rgb2 < 0 || rgb2 > 255)  {
            System.out.println("Sorry, you must enter values between 0-255.");  
            return;
            }
        } 
        else {
            System.out.println("Sorry, your input must consist of integers.");
            return;
        }
        //and then again for the third
        if (myScanner.hasNextInt()) {
            rgb3 = myScanner.nextInt();
            if (rgb3 < 0 || rgb3 > 255)  {
            System.out.println("Sorry, you must enter values between 0-255.");  
            return;
            }
        } 
        else {
            System.out.println("Sorry, your input must consist of integers.");
            return;
        }
        
        //The hexadecimal output will consist of 6 digits an each pair of digits
        //  belong to the three RGB values.
        //From each RGB value we get 2 digits: the remainder and the quotient.
        //calculate the values and store them in variable respectively
        int remainder1 = rgb1%16, remainder2 = rgb2%16, remainder3 = rgb3%16;
        int quotient1 = (int)(rgb1/16), quotient2 = (int)(rgb2/16);
        int quotient3 = (int)(rgb3/16);
        
        //declare an initialize the variables where the remqinder/quotient
        //  will be stored after converting them into hexadecimal value
        String rHex1 = " ", rHex2 = " ", rHex3 = " ";
        String qHex1 = " ", qHex2 = " ", qHex3 = " ";
        
        //if the remainder/quotient is >= 10 then it needs to be converted to
        // the letter that represents it in hexadecimal value
        if (remainder1 >= 10) {
            switch (remainder1) {
                //if the value is 10 then that translates to A in hexadecimal
                case 10:
                    rHex1 = "A";
                    break;
                case 11:
                    rHex1 = "B";
                    break;
                case 12:
                    rHex1 = "C";
                    break;
                case 13:
                    rHex1 = "D";
                    break;
                case 14:
                    rHex1 = "E";
                    break;
                //hex representation is base 16 meaning it ends at the 16th value
                // which is the letter F
                case 15:
                    rHex1 = "F";
                    break;
            }
        }
        //if it is < 10 then convert into a string 
        else {
            rHex1 = (""+remainder1);//implicit cast into a String
        }
        //now repeat the process another 5 times for the other quotients/remainders
        if (remainder2 >= 10) {
            switch (remainder2) {
                case 10:
                    rHex2 = "A";
                    break;
                case 11:
                    rHex2 = "B";
                    break;
                case 12:
                    rHex2 = "C";
                    break;
                case 13:
                    rHex2 = "D";
                    break;
                case 14:
                    rHex2 = "E";
                    break;
                case 15:
                    rHex2 = "F";
                    break;
            }
        }
        else {
            rHex2 = (""+remainder1); 
        }
        //four more to go...
        if (remainder3 >= 10) {
            switch (remainder3) {
                case 10:
                    rHex3 = "A";
                    break;
                case 11:
                    rHex3 = "B";
                    break;
                case 12:
                    rHex3 = "C";
                    break;
                case 13:
                    rHex3 = "D";
                    break;
                case 14:
                    rHex3 = "E";
                    break;
                case 15:
                    rHex3 = "F";
                    break;
            }
        }
        else {
            rHex3 = (""+remainder3);
        }
        //three. to go..
        if (quotient1 >= 10) {
            switch (quotient1) {
                case 10:
                    qHex1 = "A";
                    break;
                case 11:
                    qHex1 = "B";
                    break;
                case 12:
                    qHex1 = "C";
                    break;
                case 13:
                    qHex1 = "D";
                    break;
                case 14:
                    qHex1 = "E";
                    break;
                case 15:
                    qHex1 = "F";
                    break;
            }
        }
        else {
            qHex1 = (""+ quotient1); 
        }
        //two more..
        if (quotient2 >= 10) {
            switch (quotient2) {
                case 10:
                    qHex2 = "A";
                    break;
                case 11:
                    qHex2 = "B";
                    break;
                case 12:
                    qHex2 = "C";
                    break;
                case 13:
                    qHex2 = "D";
                    break;
                case 14:
                    qHex2 = "E";
                    break;
                case 15:
                    qHex2 = "F";
                    break;
            }
        }
        else {
            qHex2 = (""+ quotient2); 
        }
        //last one...
        if (quotient3 >= 10) {
            switch (quotient3) {
                case 10:
                    qHex3 = "A";
                    break;
                case 11:
                    qHex3 = "B";
                    break;
                case 12:
                    qHex3 = "C";
                    break;
                case 13:
                    qHex3 = "D";
                    break;
                case 14:
                    qHex3 = "E";
                    break;
                case 15:
                    qHex3 = "F";
                    break;
            }
        }
        else {
            qHex3 = (""+ quotient3); 
        }
        //once we have gathered all the individual digits we put them together
        String hex = qHex1+rHex1+qHex2+rHex2+qHex3+rHex3;
        //print out the hexadecimal representation of the RGB values
        System.out.println("The decimal numbers R:" + rgb1 + ", G:" + rgb2 +
            ", B:" + rgb3 + ", is represented in hexadecimal as: " + hex);
     
    }// end main method
}// end class