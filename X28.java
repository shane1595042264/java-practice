public class X28 {
    public String theEnd(String str, boolean front) {
        if (front) {
            String f = str.substring(0, 1);
            return f;
        } else {
            String f = str.substring(str.length() - 1);
            return f;
        }
    }
}
