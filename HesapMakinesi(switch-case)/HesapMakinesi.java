package Giris;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n1,n2;
        int select;
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = scanner.nextInt();
        System.out.print("İkinci Sayiyi Giriniz : ");
        n2 = scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminizi Giriniz : ");
        select = scanner.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplama İşlemi Sonucu = "+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma İşlemi Sonucu = "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma İşlemi Sonucu = "+(n1*n2));
                break;
            case 4:
                System.out.println("Bölme İşlemi Sonucu = "+(n1/n2));
                break;
        }
    }
}
