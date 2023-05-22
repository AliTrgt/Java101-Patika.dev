package Giris;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        int total = 0;
        System.out.print("Bir sayı giriniz : ");
        sayi = scanner.nextInt();

        for (int i = 1;i<sayi;i++){
            if(sayi % i == 0){
                total += i ;
            }
        }
        if(sayi == total){
            System.out.println(sayi+" Mükemmel sayıdır");
        }
        else System.out.println(sayi+" Mükemmel sayı değildir");
    }
}
