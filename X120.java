public class X120 {
//    Given an out string of length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
    public String makeOutWord(String out, String word)
    {
    String result = "";
    result += out.substring(0,2);
    result += word;
    result += out.substring(2,4);
    return result;
    }




}
