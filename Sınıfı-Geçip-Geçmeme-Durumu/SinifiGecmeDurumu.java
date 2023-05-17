package Giris;
import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int mat,fizik,turkce,kimya,muzik,n = 5;

            System.out.print("Matematik notunuzu giriniz : ");
            mat = scanner.nextInt();
            if(mat < 0 || mat > 100){
                System.out.println("Geçersiz not girdiniz");
                n = n-1;
            }

            System.out.print("Fizik notunuzu giriniz : ");
            fizik = scanner.nextInt();
            if(fizik < 0 || fizik > 100){
                System.out.println("Geçersiz not girdiniz");
                n = n-1;
            }

            System.out.print("Türkçe notunuzu giriniz : ");
            turkce = scanner.nextInt();
            if(turkce < 0 || turkce > 100){
                System.out.println("Geçersiz not girdiniz");
                n = n-1;
            }

            System.out.print("Kimya notunuzu giriniz : ");
            kimya = scanner.nextInt();
            if(kimya < 0 || kimya > 100){
                System.out.println("Geçersiz not girdiniz");
                n = n-1;
            }

            System.out.print("Muzik notunuzu giriniz : ");
            muzik = scanner.nextInt();
            if(muzik < 0 || muzik > 100){
                System.out.println("Geçersiz not girdiniz");
                n = n-1;
            }
            double ortalama = (mat+fizik+turkce+kimya+fizik/n);

                if (ortalama >= 55){
                    System.out.println("Bravo Dönemi Geçtiniz");
                    System.out.println("Ortalama = "+ortalama);
                }
                else {
                    System.out.println("Dönemden Kaldınız");
                    System.out.println("Ortalama = "+ortalama);
                }
    }

}
