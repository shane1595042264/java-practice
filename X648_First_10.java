public class X648_First_10 {
    String first10(String s) {
        String result = "";

        for (int i = 0; i < 10; i++) {

            if (i > s.length() - 1) {
                result += " ";
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }
}
