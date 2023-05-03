package Giris;
import java.util.Scanner;
public class Ucgen {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgenin üç kenarnın uzunluğunu a,b,c sırasında giriniz.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int cevre = (a+b+c);
        double alan = Math.sqrt(cevre*(cevre-a)*(cevre-b)*(cevre-c));
        System.out.println("Bu Ucgenin Alanı = "+alan);


    }

}
