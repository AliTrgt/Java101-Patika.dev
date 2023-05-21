package Giris;
import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi,us,total = 1;
        System.out.print("Ussu alınacak sayı : ");
        sayi = scanner.nextInt();
        System.out.print("Üs alınacak sayı : ");
        us = scanner.nextInt();
       for(int i = 1;i<=us;i++){
           total = total*sayi;
       }
        System.out.println("Cevap = "+total);
    }
}
