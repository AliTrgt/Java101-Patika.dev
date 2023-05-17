package Giris;
import java.util.Scanner;
public class Etkinlik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heat;
        System.out.print("Hava Sıcaklığını Giriniz : ");
        heat = scanner.nextInt();

            if (heat < 5){
                System.out.println("Kayak yapabilirsin");
            }
            else if (heat >=5 && heat<15){
                System.out.println("Sinemaya gidebilirsin");
            }
            else if (heat >=15 && heat<25){
                System.out.println("Piknik yapmaya gidebilirsin");
            }
            else if (heat>25){
                System.out.println("Yüzmeye gidebilirsin");
            }

    }
}
