package Giris;
import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float birimA = 2.14f;
        float birimE = 3.67f;
        float birimD = 1.11f;
        float birimM = 0.95F;
        float birimP = 5f;
        float kilo;
        System.out.println("Armut Kaç Kilo ? :");
        kilo = scanner.nextFloat();
        System.out.println("Elma Kaç Kilo ? :");
        kilo = scanner.nextFloat();
        System.out.println("Domates Kaç Kilo ? :");
        kilo = scanner.nextFloat();
        System.out.println("Muz Kaç Kilo ? :");
        kilo = scanner.nextFloat();
        System.out.println("Patlıcan Kaç Kilo ? :");
        kilo = scanner.nextFloat();

        double toplamTutar = (kilo*birimA)+(kilo*birimE)+(kilo*birimD)+(kilo*birimM)+(kilo*birimP);
        System.out.println("Toplam Tutar :"+toplamTutar);
    }



}
