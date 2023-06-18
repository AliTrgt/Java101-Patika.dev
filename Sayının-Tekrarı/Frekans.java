package Arrays;
import java.util.*;
public class Frekans {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
            int[] frekanslar = new int[arr.length];


            for (int i = 0;i<arr.length;i++){
                int eleman = arr[i];
                int frekans = 0;

                for (int j = 0;j< arr.length;j++){
                    if (arr[j] == eleman){
                        frekans++;
                    }
                }


            frekanslar[i] = frekans;
            }

            for (int i  = 0;i<arr.length;i++){
                System.out.println(arr[i]+" elemanı " + frekanslar[i] + " kez tekrar edildi ");
            }

        }



    }

