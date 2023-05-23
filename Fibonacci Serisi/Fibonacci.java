package Giris;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayiDegeri,n1,n2,n3;
        System.out.print("Sayı değeri giriniz = ");
        sayiDegeri = scanner.nextInt();
        n1 = 0;
        n2 = 1;
        System.out.print(n1+" "+n2);


        for(int i = 2;i<=sayiDegeri;i++){

            n3 = n1+n2;
            System.out.print(" ");
            System.out.print(n3);
            n1 = n2;
            n2 = n3;

        }

    }
}
