package Giris;
import java.util.Scanner;
public class ucSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.print("1.Sayıyı giriniz : ");
        a = scanner.nextInt();
        System.out.print("2.Sayıyı giriniz : ");
        b = scanner.nextInt();
        System.out.print("3.Sayıyı giriniz : ");
        c = scanner.nextInt();

        if (a < c && a < b) {
            if( c < b){
                System.out.println("Küçükten büyüğe : "+a+"<"+c+"<"+b);
            }
            else  System.out.println("Küçükten büyüğe : "+a+"<"+b+"<"+c);

        }
        else if (b < c && b < a){
            if(c < a){
                System.out.println("Küçükten büyüğe : "+b+"<"+c+"<"+a);
            }
            else  System.out.println("Küçükten büyüğe : "+b+"<"+a+"<"+c);
        }

        else if(c < b && c < a){
            if(b < a){
                System.out.println("Küçükten büyüğe : "+c+"<"+b+"<"+a);
            }
            else  System.out.println("Küçükten büyüğe : "+c+"<"+a+"<"+b);
        }

         else System.out.println("Eşit Sayı Girmeyiniz !!");
    }
}
