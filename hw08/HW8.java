import java.util.Scanner; //import Scanner object
import java.util.Random; //import Random object
public class HW8 {

    public static void main(String[] args) {

        char option;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");

        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");

        String input = getInput(scan, "Cc");//calls method getInput

        System.out.println("You are in a dead valley.");

        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");

        input = getInput(scan, "Cc");//calls method getInput

        System.out.println("You walked and walked and walked and you saw a cave!");

        cave(); // calls cave method

        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");

        input = getInput(scan, "Cc");//calls method getInput

        System.out.println("You entered a cave!");

        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");

        input = getInput(scan, "Cc");//calls method getInput

        System.out.println("Unfortunately, you ran into a GIANT!");

        giant(); // calls giant method

        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");

        input = getInput(scan, "AaEe", 10);//calls method getInput

        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");

        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");

        box(); // calls box method box

        input = getInput(scan);//calls method getInput

        System.out.println("Hero! Have a good day!");

    }//end main method
    //create giant method
    public static void giant() {

        System.out.println("                                 ---------                    ");

        System.out.println("                                |  /    \\ |                  ");

        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ         ");

        System.out.println("                           H     ---------    H               ");

        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ         ");

        System.out.println("                           H    HHHHHHHHHHH    H              ");

        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ         ");

        System.out.println("                                HHHHHHHHHHH                   ");

        System.out.println("                                HHH     HHH                   ");

        System.out.println("                               HHH       HHH                  ");

    }//end giant method
    //create cave method
    public static void cave() {

        System.out.println("                              *****   * * * * * * * *         ");

        System.out.println("                         ***         ***                      ");

        System.out.println("                      ***               ***                   ");

        System.out.println("                 |    ***               ***                   ");

        System.out.println("                 |    ***               ***                   ");

        System.out.println("             O __|__  ***               ***                   ");

        System.out.println("           ******l    ***               ***                   ");

        System.out.println("            * *       ***               ***                   ");

        System.out.println("           *   *      ********************* * * * * * *       ");

    }//end cave method
    //create box method
    public static void box(){

       System.out.println("                      *********************     *********************    *********************              ");

        System.out.println("                     ***               ***     ***               ***    ***               ***              ");

        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");

        System.out.println("                     ***               ***     ***               ***    ***               ***              ");

        System.out.println("                     *********************     *********************    *********************              "); 

    }//end box method
    //create getInput method
    public static String getInput(Scanner scan, String string) {
       String input = scan.nextLine();
       if (input.equalsIgnoreCase("c")) {
           return string;
       } else {
           System.out.println("Yeah right Loser!");
           System.exit(0);
           return string;
       }
        
    }//end getInput method
    public static String getInput(Scanner scan, String string, int trial) {
        //constructs Random object
        Random rand = new Random();
        //declare and initialize Life Points variable
        int LP = 100;
        //print out the initial LP value of the giant
        System.out.println("The giant has 100 life point (LP: 100)");
        System.out.println("Attack, escape or yield!");
        //for loop will run until there has been 10 succesful hits,
        //  the user has succesfully escaped or the user yielded
        for ( int i= 0; trial > i; i++) {
            //takes user input and stores into a variable
            String input = scan.nextLine();
            //if statement for the different cases;
            //if user enters a or A then:
            if (input.equalsIgnoreCase("a")) {
                //then generate random numbers 0 or 1
                int hit = rand.nextInt(2);
                //if the number is 1 then a succesful hit is recorded
                if (hit == 1) {
                    //print that the user succesfully hit the giant
                    System.out.println("Nice hit!   -10 LP");
                    //giant loses 10 LP
                    LP-= 10;
                }//end nested if statement
                //if the number is 0 then a missed hit is recorded
                else {
                    //print out that the hit was missed
                    System.out.println("You missed...");
                    //since it was a miss, we decrease the value of i so that
                    //  there is still the same amount of required hits left
                    i--;
                }//end nested else statement
                //prints out the current LP of the giant after each hit or miss
                //  (decreases by 10 if hit is succesful, stays the same if miss)
                System.out.println("LP: " + (LP));
            }//end if statement
            //if uses enter e or E 
            else if (input.equalsIgnoreCase("e")) {
                //generate random int from 1 to 10 inclusive
                int escape = rand.nextInt(10) + 1;
                //if the number is 10 then:
                if (escape == 10) {
                    //print that user escaped succesfully
                    System.out.println("You escaped without trouble!");
                    //set i = trial so that loop ends
                    i = trial;
                }
                //if number is not 10 then:
                else {
                    //print that user failed to escape
                    System.out.println("You failed to escape!");
                    //print the AaEew otion again
                    System.out.println("Enter 'A' or 'a' to Attack, " + 
                        "'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    //decrease the value of i so that loop doesn't end
                    //  and number of remaining hits are still intact
                    i--;
                }//end nested else statement
            }//end else if statement
            else {
                //if user enters anythin other than AaEe, GAME OVER
                System.out.println("Executed by the GIANT! Game Over!");
                //terminates program
                System.exit(0);
            }//end else statement
        }//end for loop
        return string;
    }// end method
    //create another getInput method
    public static String getInput(Scanner scan) {
        //check if user inputs an int, if true then:
        if (scan.hasNextInt()) {
            //store user input in a variable
            int input = scan.nextInt();
            //create switch statement for the different cases
            switch (input) {
                //if input = 1 
                case 1 :
                    //print out the reward
                    System.out.println("Its gold... Lots of it!");
                    break;
                //if input = 2 
                case 2 : 
                    //print out the reward
                    System.out.println("Ever heard of Excalibur? It's now yours");
                    break;
                //if input = 3
                case 3 :
                    //print out the reward
                    System.out.println("Yout reward is... Experience! ;)");
                    break;
                //for any other int
                default:
                    System.out.println("A Wrong Number! You get nothing! " +
                        "Better restart the game LOL");
            }//end switch statement
        }//end if statement
        //if input is not an int then;
        else {
            //print out GAMEOVER message
            System.out.println("You did not enter a Number! You get nothing!" +
                " Better restart the game LOL");
            //Terminates program
            System.exit(0);
        }//end else statement
        return "End game";
    }//end method

}//end class

