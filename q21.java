import java.util.ArrayList; // import the ArrayList class
public class Wizards{ 
    public static ArrayList<String> reverse(String[] wizards ) throws Exception{
        ArrayList<String> reversed = new ArrayList<String>();
        for(int i = wizards.length-1; i>=0; i--){
            reversed.add(wizards[i]);
        }
        return reversed;
    };
    public static void main(String[] args){
        String[] wizards = {"Harry", "Ron", "Hermione", "Ginny"};
        try {
            System.out.println(reverse(wizards));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}