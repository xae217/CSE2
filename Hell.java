import java.util.Random;
public class Hell{
    
    public static void main(String[] args) {
        
        String input = "c";
        String string = "c";
        Random rand=new Random();
        int escape = rand.nextInt(11);
        
        if (input.equals(string)){
            System.out.println("Yay");
        }
       System.out.println(escape);
    }
    
}


