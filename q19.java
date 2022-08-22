public class isPalindromic {
    public static boolean isPalindromic(char[] text, int startIndex, int endIndex) {
        if(endIndex>text.length-1){
            return -3;
        }
        if(startIndex <0) {
            return -2;
        }
        
        if(text == null || text.length == 0) {
            return -1;
        }
        if (startIndex >= endIndex) {
            return 1;
        }
        if (!text[startIndex].equalsIgnoreCase( text[endIndex])) {
            return 0;
        }
        return isPalindromic(text, startIndex + 1, endIndex - 1);
    }
}