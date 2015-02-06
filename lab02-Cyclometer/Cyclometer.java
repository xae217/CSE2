// Xavier Escobar
// January 30th, 2015
// CSE002
// Cyclometer.java will input time and number of rotations and will output:
//      number of minutes for each trip
//      number of counts for each trip
//      distance of each trip in miles
//      distance of two trips combined
public class Cyclometer{
    
  public static void main(String [] args){
      
	int secsTrip1=480; // number of seconds in trip one
	int secsTrip2=3220; // number of second of trip two
	int countsTrip1=1561; // number of counts of trip one
	int countsTrip2=9037; // number of counts of trip two
	
	// useful constants
	double wheelDiameter=27.0; //diameter of the wheel in inches
	double PI=3.14159; // constant Pi
	double feetPerMile=5280.0; // number of feet in a mile
	double inchesPerFoot=12.0; // number of inches in a foot
	double secondsPerMinute=60.0; // number of seconds in a minute
	
	// calculate and print time for each trip
	System.out.println("Trip 1 took"+" "+(secsTrip1/secondsPerMinute)+
	    " minutes and had"+" "+countsTrip1+" counts.");
	System.out.println("Trip 2 took"+" "+(secsTrip2/secondsPerMinute)+
	    " minutes and had"+" "+countsTrip2+" counts.");
	    
	// calculate and store distances for each trip in new variables
	double distanceTrip1=countsTrip1*wheelDiameter*PI; // Calculate and stores the distance of trip 1
	distanceTrip1/=inchesPerFoot*feetPerMile; // Coverts from inches to miles and stores it in the same variable
	double distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Calculates and stores distance of trip2 and also converts to miles
	double totalDistance=distanceTrip1+distanceTrip2;
	
	// print the distance of each trip and the total distance
	
	System.out.println("Trip 1 was "+distanceTrip1+" miles.");
	System.out.println("Trip 2 was "+distanceTrip2+" miles.");
	System.out.println("The total distance was "+totalDistance+" miles.");
	
  }
}