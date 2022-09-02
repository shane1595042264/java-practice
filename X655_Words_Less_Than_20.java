public class X655_Words_Less_Than_20 {
    String fullWords(String s)
    {
        if(s ==null ){
            return s;
        }
        int n = s.length();
        Boolean isNumeric = false;
        try {
            double d = Double.parseDouble(s);
            isNumeric = true;
        } catch (NumberFormatException nfe) {
           isNumeric = false;
        }
        if(isNumeric) {
        return s;
        }
        if (n == 0){
            return s;
        }
        if(n<=20){
            return s;
        }
        else{
            int spaceLocation = 0;
            for(int i=0; i<20; i++){
                if(s.charAt(i)==' '){
                    spaceLocation = i;
                }

            }
            if(spaceLocation==0){
                String a = "";
                return a;
            }
            return s.substring(0, spaceLocation);
        }
    }

}

}
