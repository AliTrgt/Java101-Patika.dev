import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random rand = new Random();
            int number = rand.nextInt(100);
            int selected;
            int right = 0;
            while (right < 5){
                System.out.print("Sayı Değeri giriniz = ");
                 selected = scanner.nextInt();
                 if (selected == number){
                     System.out.println("Tebrikler sayıyı doğru bildiniz.");
                     break;
                 }

                 if (selected < 0 || selected > 99){
                     System.out.println("Lutfen 0-100 arası bir sayı giriniz.");
                     continue;
                 }

                else{
                     System.out.println("Hatalı bir sayı girdiniz.");
                     right++;
                     System.out.println((5-right)+" Hakkınız kaldı.");
                     if ((5- right) == 0){
                         System.out.println("Oyun bitti sonra tekrar deneyiniz.");
                            break;
                     }

                    if (selected > number){
                        System.out.println(selected+" Sayısı gizli sayıdan büyüktür.");
                    }

                        else System.out.println(selected+" Sayısı gizli sayıdan küçüktür.");
                 }

                System.out.println("==========================");

            }

    }
}
