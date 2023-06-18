package Giris;
import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
         /*int fakt,i,toplam = 1;
        System.out.print("Merak Ettiğiniz Sayıyı Giriniz : ");
        fakt = scanner.nextInt();
        for(i = 1;i<=fakt;i++){        //Faktoriyelini Bulan Kod
            toplam *= i;
        }
        System.out.println(fakt+"! değeri = "+toplam);*/
        int a,n,r,nFakt = 1,rFakt = 1,aFakt = 1;

        System.out.print("N değerini giriniz : ");
        n = scanner.nextInt();

        System.out.print("R değerini giriniz : ");
        r = scanner.nextInt();
        a = n - r;
        for(int i = 0;i<n;i++){
            nFakt *= i;
        }

        for(int i = 0;i<r;i++){
            rFakt *= i;
        }

        for(int i = 0;i<a;i++){
            aFakt *= i;
        }


        int  komb = ((nFakt) / (rFakt * aFakt));



        System.out.println("Sonuç = "+komb);

    }
}
