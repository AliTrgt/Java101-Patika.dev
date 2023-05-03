package Giris;
import java.util.Scanner;
public class Indeks {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
            float boy = scanner.nextFloat();
            System.out.println("Lütfen kilonuzu giriniz :");
            double kilo = scanner.nextDouble();

            double vki = (kilo) / (boy) * (boy);

             System.out.println("Vücut Kitle İndeksiniz :"+vki);





        }



}
