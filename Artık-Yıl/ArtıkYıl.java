package Giris;
import java.util.Scanner;
public class ArtıkYıl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yil;
        System.out.print("Yıl Giriniz : ");
        yil = scanner.nextInt();
        if(yil % 100 == 0 ){
            if(yil % 400 == 0){
                System.out.println(yil+" bir artık yıldır !");
            }
            else System.out.println(yil+" bir artık yıl değildir ! ");
        }
        else if(yil % 4 == 0){
            System.out.println(yil+" bir artık yıldır !");
        }
        else System.out.println(yil+" bir artık yıl değildir ! ");

    }
}
