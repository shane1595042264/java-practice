public class X661_Title_Case {
    public static String toTitleCase(String s)
    {
        if (s.length() == 0)
        {
            return s;
        }
        int len = s.length();
        String result = "";
        Boolean isInWord = false;
        for (int i = 0; i < len; i++){
            char c = s.charAt(i);
            if(c == ' ' ){
                isInWord = false;
                result += c;
            }
            else if (!isInWord)
            {
                c = Character.toUpperCase(c);
                isInWord = true;
                result += c;
            }
            else if (isInWord){
                if(Character.isUpperCase(c)){
                    c = Character.toLowerCase(c);
                }
                result += c;
            }
            else{
                isInWord = false;
                result += c;
            }
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(toTitleCase("WHERE WE GO FROM HERE"));
        System.out.println(toTitleCase("i have a dream"));



    }
}
