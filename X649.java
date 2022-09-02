public class X649 {
    String longest(String[] names)
    {
    if (names == null || names.length == 0) {
        return null;
    }
    String longestName = names[0];
    for (String name : names) {

        if (name.length() > longestName.length()) {
            longestName = name;
        }
    }
    return longestName;
    }
}
