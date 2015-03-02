// Xavier Escobar
// March 3rd, 2015
// CSE 002
// MakeSymbols.java will generate symbols depending on a random number


public class MakeSymbols{
    //main method
    public static void main(String[] args) {
        //generates a random number between 0 and 100 (excluding 0)
        int rNumber = (int) (Math.random()*99)+1;
        //print out generated number
        System.out.println("Random number generated: " + rNumber);
        int i = rNumber;//counter variable
        do { 
            if (rNumber % 2 == 0) {
                System.out.print("*");
                i--;
            }//end if statement
            else {
                System.out.print("&");
                i--;
            }//end else statement
        }//end do statement
        while (i !=0 );
        System.out.println("");
    }//end main method
}//end class