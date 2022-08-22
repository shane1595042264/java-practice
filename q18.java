
import java.util.Random;

public class Mavenproject1 {
       static void reverse(int o[], int n)
    {
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = o[i];
            o[i] = o[n - i - 1];
            o[n - i - 1] = t;
        };
  
      
        System.out.println("Reversed array is: \n");
        for (k = 0; k < n; k++) {
            System.out.println(o[k]);
        };
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[1000];
        for(int i = 0; i<a.length; i++){
            a[i]= rand.nextInt(11);
        };
        int freq1, freq2, freq3, freq4, freq5, freq6, freq7, freq8, freq9, freq10=freq1 = freq2= freq3= freq4= freq5= freq6= freq7= freq8=freq9=0;
        for(int j = 0; j<a.length;j++){
            
            switch(a[j]){
                case 1:
                    freq1++;
                    break;
                case 2:
                    freq2++;
                    break;
                case 3:
                    freq3++;
                    break;
                case 4:
                    freq4++;
                    break;
                case 5:
                    freq5++;
                    break;
                case 6:
                    freq6++;
                    break;
                case 7:
                    freq7++;
                    break;
                case 8:
                    freq8++;
                    break;
                case 9:
                    freq9++;
                    break;
                case 10:
                    freq10++;
                    break;
            }
        }
 
            System.out.println("freq of 1  = " + freq1);
            System.out.println("freq of 2  = " + freq2);
            System.out.println("freq of 3  = " + freq3);
            System.out.println("freq of 4  = " + freq4);
            System.out.println("freq of 5  = " + freq5);
            System.out.println("freq of 6  = " + freq6);
            System.out.println("freq of 7  = " + freq7);
            System.out.println("freq of 8  = " + freq8);
            System.out.println("freq of 9  = " + freq9);
            System.out.println("freq of 10  = " + freq10);

            reverse(a, a.length);
            int[] b = a;

    };
 

 
};
