// Xavier Escobar
// CSE 002
// February 10th, 2015
// Bicycle.java takes user input on number of counts and seconds and calculates
// the total time, distance and averge mph

import java.util.Scanner; //imports Scanner class

public class Bicycle {
    //main method
    public static void main(String[] args){
        //declares and constructs an instance of the Scanner object
        Scanner myScanner = new Scanner(System.in);
        //asks the user for input on travel time in seconds
        System.out.println("Enter the number of seconds:");
        int nSeconds = myScanner.nextInt();//accepts and stores the number of seconds
        //asks the user for input on number of counts
        System.out.println("Enter the number of counts:");
        int nCounts = myScanner.nextInt();//accepts and stores the number of counts
        
        //Calculations:
        //first declare useful variables
        double wheelDiameter = 27.0;//diameter of the wheel
        double PI = 3.14159;//constant pi
        double inchesPerFoot = 12.0;//number of inches in a foot
        double feetPerMile = 5280.0;//number of feet in a mile
        double secondsPerMinute = 60.0;//number of seconds per minute
        
        //calculates total distance traveled
        double totalDistance = (nCounts*wheelDiameter*PI);
        //converts from inches to miles and stores in the same variable
        totalDistance /= inchesPerFoot*feetPerMile;
        //cut to two decimal places
        totalDistance *= 100;//multiplies by 100 to store 2 decimal places before casting
        totalDistance = (int) totalDistance;//casts into an intiger eliminating other decimals
        totalDistance /= 100;//divides by 100 creating two decimal places
        
        //calculates total travel time
        double totalTime = nSeconds/secondsPerMinute;//transforms seconds into minutes
        //caluclates average mph
        double averageMPH = totalDistance/(totalTime/60);
        
        //print the results
        System.out.println("The distance was " + totalDistance + 
            " miles and took " + totalTime + " minutes.");
        System.out.println("The average mph was " + averageMPH);
        
        }//main method ends
    }//class ends