package Giris;
import java.util.Scanner;
public class UcakBiletHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yas,yolTip;
        double toplamTutar = 0,mesafe;

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolTip = scanner.nextInt();

        if(mesafe < 0 ) System.out.println("Hatalı Veri Girdiniz !");
         else if(yas <0 ) System.out.println("Hatalı Veri Girdiniz !");
         else if(yolTip<1 || yolTip>2) System.out.println("Hatalı Veri Girdiniz !");

         toplamTutar = mesafe *(0.1);

         if(yas < 12) {
             toplamTutar *= (0.5);
         }
         else if(yas>=12 && yas<24){
                toplamTutar *= (0.9);
         }
         else if (yas > 65){
                toplamTutar *= (0.7);
         }
        else toplamTutar = mesafe *(0.1);
         if(yolTip == 2){
             toplamTutar *= (0.8) * 2 ;
         }

        System.out.println("Toplam Tutar = "+toplamTutar);

    }
}
