package Arrays;
import java.util.*;
public class HarfYazdırmaB {
    public static void main(String[] args) {
        String arr[][] = new String[12][6];

        for(int i = 0;i<arr.length; i++){
            for (int j = 0;j<arr[i].length;j++){
                if (i == 0 || i == 5 ||  i ==11 ){
                    arr[i][j] = " * ";
                }
                else if (j == 0 || j == 5){
                    arr[i][j] = " * ";
                }
                else arr[i][j] = "   ";
            }
        }
        for (String[] a : arr){
            for (String gez : a){
                System.out.print(gez);
            }
            System.out.println();
        }

    }
}
