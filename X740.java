import java.util.ArrayList;

public class X740 {
    public int countStrLongerThan(ArrayList<String> names, int minLen)
    {

         if(names==null){
        return 0;}

    else if(names.isEmpty()){
        return 0;
    }
        int len = names.size();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (names.get(i).length() > minLen) {
                count++;
            }
        }
    return count;
    }

}
