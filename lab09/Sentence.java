import java.util.Random;

public class Sentence{
    
    public static void main(String[] args) {
        
    System.out.println(adjective());    
    }
    
    public static String adjective() {
        Random rand= new Random();
        int randomInt = rand.nextInt(10);
        String adjective = "";
        switch (randomInt) {
            case 0 :
                adjective = "black";
                break;
            case 1:
                adjective = "lazy";
                break;
            case 2: 
                adjective = "agile";
                break;
            case 3:
                adjective = "loyal";
                break;
            case 4:
                adjective = "quick";
                break;
            case 5:
                adjective = "confused";
                break;
            case 6:
                adjective = "mighty";
                break;
            case 7:
                adjective = "ferocious";
                break;
            case 8:
                adjective = "happy";
                break;
            case 9:
                adjective = "kind";
                break;
        }
        return adjective;
    }
    
    public static String subjectNoun() {
        Random rand= new Random();
        int randomInt = rand.nextInt(10);
        String adjective = "";
        switch (randomInt) {
            case 0 :
                adjective = "dog";
                break;
            case 1:
                adjective = "lion";
                break;
            case 2: 
                adjective = "horse";
                break;
            case 3:
                adjective = "rhino";
                break;
            case 4:
                adjective = "snake";
                break;
            case 5:
                adjective = "fox";
                break;
            case 6:
                adjective = "coyote";
                break;
            case 7:
                adjective = "panter";
                break;
            case 8:
                adjective = "elephan";
                break;
            case 9:
                adjective = "badger";
                break;
        }
        return adjective;
    }
    
    public static String verb() {
        Random rand= new Random();
        int randomInt = rand.nextInt(10);
        String adjective = "";
        switch (randomInt) {
            case 0 :
                adjective = "attacked";
                break;
            case 1:
                adjective = "passed";
                break;
            case 2: 
                adjective = "ate";
                break;
            case 3:
                adjective = "hurt";
                break;
            case 4:
                adjective = "chased";
                break;
            case 5:
                adjective = "hunted";
                break;
            case 6:
                adjective = "killed";
                break;
            case 7:
                adjective = "saved";
                break;
            case 8:
                adjective = "helped";
                break;
            case 9:
                adjective = "buried";
                break;
        }
        return adjective;
    }
    
    public static String subjectObject() {
        Random rand= new Random();
        int randomInt = rand.nextInt(10);
        String adjective = "";
        switch (randomInt) {
            case 0 :
                adjective = "cat";
                break;
            case 1:
                adjective = "tiger";
                break;
            case 2: 
                adjective = "mouse";
                break;
            case 3:
                adjective = "deer";
                break;
            case 4:
                adjective = "squirle";
                break;
            case 5:
                adjective = "turtle";
                break;
            case 6:
                adjective = "rabbit";
                break;
            case 7:
                adjective = "ant";
                break;
            case 8:
                adjective = "leopard";
                break;
            case 9:
                adjective = "puppy";
                break;
        }
        return adjective;
    }
}
