package Giris;
import java.util.Scanner;
public class UcVeDorteBolunebilme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayiDegeri,sayac = 0,ortalama,toplam = 0;
        System.out.print("Sayı Degeri Giriniz : ");
        sayiDegeri = scanner.nextInt();
        for(int i = 1;i<=sayiDegeri;i++){
            if(i % 12 == 0){
                sayac++;
                toplam +=i;
            }

        }

        System.out.println("Ortalama Değer = "+(toplam/sayac));
    }
}
