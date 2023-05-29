package OOP;
import java.util.Scanner;
public class RecursifUsluSayi {

    static int usHesaplama(){
        Scanner scanner = new Scanner(System.in);
        int taban,us,sonuc = 1;
        System.out.print("Taban değerini giriniz = ");
        taban = scanner.nextInt();
        System.out.print("Us degerini giriniz = ");
        us = scanner.nextInt();
        for (int i = 1;i <=us;i++){
             sonuc  *=taban;
        }


        return sonuc;
    }



    public static void main(String[] args) {
        System.out.println(usHesaplama());
    }
}
