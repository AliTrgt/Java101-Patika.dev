package Giris;
import java.util.Scanner;
public class Yıldızlar {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n;
        System.out.print("Sayı değeri giriniz : ");
        n = scanner.nextInt();

        for(int i = 0;i <= n;i++){
            for(int j = 0 ;j<(n-i);j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i + 1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=n; i>=0;i--){
            for(int j = 0 ;j<(n-i);j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i + 1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
