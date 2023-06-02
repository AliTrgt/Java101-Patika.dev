package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Ortalama {
    public static void main(String[] args) {

        int numbers[] = {1,2,3,4,5};
          /*  int sum = 0;
           for (int i = 0;i<numbers.length;i++)
            {
                sum +=numbers[i];
            }
            int average = ((sum) / (numbers.length));
                System.out.println(average);*/

        double   sum = 0,average = 0;
            for (int i = 0;i<numbers.length;i++){
                sum += (1/(i+1));
            }
            average = ((numbers.length) / (sum));
        System.out.println(average);
    }
}
