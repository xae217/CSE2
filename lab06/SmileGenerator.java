// Xavier Escobar
// February 27th, 2015
// CSE 002
// SmileGenerator.java will generate smiles using a while loop


public class SmileGenerator{
    //main method
    public static void main(String[] args) {
       
        int i = 0;
        while (i<5) {
            System.out.print(":)");
            i++;
        }
        System.out.println("");
        
        int rNumber = (int) (Math.random()*99)+1;
        
        System.out.println(rNumber);
        
        while(rNumber != 0) {
            
            System.out.print(":)");
            rNumber--;
        }
        System.out.println("");
        
        rNumber = (int) (Math.random()*99)+1;
        i=1;
        
        System.out.println(rNumber);
        
        while(rNumber != 0 ) {
    
            i--;
            
            System.out.print(":)");
            rNumber--;
            if (i==0) {
                System.out.println("");
                i= 0;

            }
        }
        System.out.println("");
        
        rNumber = (int) (Math.random()*9)+1;
        i=1;
        int counter = 0;
        
        System.out.println(rNumber*10);
        
        while( i != rNumber) {
    
            System.out.print(":)");
            counter++;
            if (counter == i) {
                System.out.println("");
                counter = 0;
                i++;

            }
        }
        System.out.println("");
        
    
        
    
    }//end main method
}//end class