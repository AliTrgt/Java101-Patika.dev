package Arrays;
import java.util.*;
public class Siralama {

    static void bubleSort(int[] arr){
            int temp = 0;
            for (int i = 0;i<arr.length;i++){
                for (int j = 0 ;j<arr.length-i-1;j++){
                    if (arr[j] > arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu : ");
        int a = scanner.nextInt();
        int[] arr = new int[a];

        System.out.println("Dizinin elemanlarını giriniz  ");
        for (int i = 0;i<arr.length;i++){
            System.out.print((i+1)+". Elemanı : ");
             arr[i] = scanner.nextInt();

        }
        bubleSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
