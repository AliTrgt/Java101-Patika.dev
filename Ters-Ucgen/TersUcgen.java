package Giris;
import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 10;i >= 0;i--){
            for(int j = 0 ;j<(10-i);j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i + 1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
