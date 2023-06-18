package Giris;
import java.util.Scanner;
public class IkiUssu {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int sayi;
        System.out.print("Lütfen bir sayı değeri giriniz : ");
        sayi = scanner.nextInt();
        for(int i = 1 ;i<sayi;i+=1){
            if(i % 4 == 0) {
                System.out.println("Sayılar = "+i);
            }
            if(i % 5 == 0) {
                System.out.println("Sayılar = "+i);
            }

        }

    }

}
