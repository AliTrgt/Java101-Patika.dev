package Giris;
import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayiDegeri;
        System.out.print("Lutfen hesaplanacak sayı değerini giriniz : ");
        sayiDegeri = input.nextInt();
        double result = 0;
        for (double i = 1 ;i<sayiDegeri;i++){
            result += (1/i);
        }
        System.out.println("Sonuç = "+result);
    }
}
