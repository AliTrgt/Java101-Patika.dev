package Giris;
import java.util.Scanner;
public class Baslangic {

    public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Matematik Dersi Notunu Giriniz.");
            int notMat = input.nextInt();

            System.out.println("Fizik Dersi Notunu Giriniz.");
            int notFiz = input.nextInt();

            System.out.println("Kimya Dersi Notunu Giriniz.");
            int notKim = input.nextInt();

            System.out.println("Türkce Dersi Notunu Giriniz.");
            int notTür = input.nextInt();

            System.out.println("Tarih Dersi Notunu Giriniz.");
            int notTar = input.nextInt();

            System.out.println("Müzik Dersi Notunu Giriniz.");
            int notMüz = input.nextInt();


          float ortalama = (notMat+notFiz+notKim+notTür+notTar+notMüz)/6;
          System.out.println("Not Ortalamanız: "+ortalama);

          String gecmeDurum = ortalama >= 60  ?  "Sınavı Geçti":"Sınavdan Kaldı";
          System.out.println("Sınavdan Geçme Durumu: "+gecmeDurum);

    }

}
