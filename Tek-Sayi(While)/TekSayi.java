package Giris;
import java.util.Scanner;
public class TekSayi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi = 0,toplam = 0;
        while(1 == 1){
        System.out.print("Sayı Değeri Giriniz : ");
        sayi = scanner.nextInt();
            while(sayi > 0){
                for(int i = 0;i<sayi;i++){
                    if(i % 2 == 1){
                        toplam = toplam+i;
                    }

                }

                System.out.println("Toplam Deger = "+toplam);
               break;
            }
            if(sayi < 0) System.out.println("Hatalı Değer Girdiniz ! ");
        }
}
}
