package Giris;
import java.util.Scanner;
public class Taksimetre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taksimetre İle Kaç Km Gidilecek ?");
        double mesafe = scanner.nextInt();
        double fiyat = (mesafe * 2.20);
        int  kmFiyat;

        kmFiyat = (int) (10+fiyat);
        if(kmFiyat < 20){
            kmFiyat = 20;
            System.out.println(kmFiyat);
        }

        else if (kmFiyat > 20){
            System.out.println(kmFiyat);
        }

    }

}
