public class X331 {
    public static String reverseConcatStrings(String[] strs)
    {
        
        String[] result = new String[strs.length];
        for(int i = strs.length-1; i >=0; i--)
        {
            System.out.println(i);
            result[strs.length-1-i] = strs[i];
        };
        String finalResult = String.join("", result);
        return finalResult;
    };
    public static void main(String[] args){
        String[] wizards = {"Harry", "Ron", "Hermione", "Ginny"};
        try {
            System.out.println(X331.reverseConcatStrings(wizards));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
