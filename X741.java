public class X741 {
    public ArrayList<String>  removeStrLongerThan(ArrayList<String> names, int minLen) {
        if (names == null) return null;
        ArrayList<String> result = new ArrayList<String>();
        for (String name : names) {

            if (name.length() <= minLen) {
                result.add(name);
            }



        }
        return result;
    }

}
