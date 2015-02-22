// Xavier Escobar
// CSE 002
// February 17th, 2015
// SpaceExploration.java  will give output a timeline of significant
//  space exploration advances from 2000 - 2010

import java.util.Random;//import Random method

public class SpaceExploration {
    //main method
    public static void main(String[] args){
        //declares and constructs an instace of the Random method
        Random randomN = new Random();
        //creates a random int from 2000 to 2010 and stores it
        int year = randomN.nextInt(11) + 2000;
        //prints the range of the timeline that will be displayed
        System.out.println("Here is a timeline of space exploration events " +
            "from " + year + " to " + 2000);
        //create a switch statement withn no breaks for intentional fallthrough
        //each case belongs to a year from 2000 to 2001
        //the timeline will be displayed in decending order
        switch (year) {
            //years must be in decending order to make this work. That way
            //  by using falthrough we make sure all the years before the one
            //  randomly selected are printed
            case 2010:
                //prints the event on an specific year
                System.out.println("2010: " + "SpaceX sucessfully sends " +
                    "spacecraft to orbit and back.");
            case 2009:
                //if nothing happened then print N/A
                System.out.println("2009: " + "N/A");
            case 2008: 
                System.out.println("2008: " + "Kepler launched to study " +
                    "deep space. ");
            case 2007:
                System.out.println("2007: " + "N/A");
            case 2006:
                System.out.println("2006: " + "Spacecraft returns with " +
                    "collections from a comet.");
            case 2005:
                System.out.println("2005: " + "Spacecraft collies with comet.");
            case 2004:
                System.out.println("2004: " + "N/A");
            case 2003:
                System.out.println("2003: " + "Largest infrared telescope " +
                    "released.");
            case 2002:
                System.out.println("2002: " + "N/A");
            case 2001:
                System.out.println("2001: " + "First spacecraft lands on asteroid");
            case 2000:
                System.out.println("2000: " + "First spacecraft orbits an asteroid");
                break;
        }//end switch statement
    }//end main method
}//end class