package OOP;
import java.util.Scanner;
public class GelismisHesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int select;
         String menu = "1- Toplama İşlemi\n"
                 + "2- Çıkarma İşlemi\n"
                 + "3- Çarpma İşlemi\n"
                 + "4- Bölme işlemi\n"
                 + "5- Üslü Sayı Hesaplama\n"
                 + "6- Faktoriyel Hesaplama\n"
                 + "7- Mod Alma\n"
                 + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                 + "0- Çıkış Yap";
            do {
                System.out.println("\nLütfen bir işlem seçiniz ");
                System.out.println(menu);
                select = scanner.nextInt();
                switch (select){
                    case 1: plus(); break;
                    case 2: minus(); break;
                    case 3: times(); break;
                    case 4: divided(); break;
                    case 5: power(); break;
                    case 6: factorial(); break;
                    case 0: break;
                    default:
                        System.out.println("Yanlış değer girdiniz tekrar deneyiniz.");
                }
            }while (select != 0);



    }

    static void plus(){
        Scanner scanner = new Scanner(System.in);
        int number,result = 0, i =1;
        while (true){
            System.out.print(i++ +". sayı = ");

            number =scanner.nextInt();
            if(number == 0){
                break;
            }
             result += number;
        }
        System.out.println("\nSonuç = "+result);

    }
    static void minus(){
        Scanner scanner = new Scanner(System.in);
        int number,result = 0,i = 1;
        while (true){
            System.out.print(i++ +". sayı = ");
            number =scanner.nextInt();
            if (number == 0){
                break;
            }
                result -= number;
        }
        System.out.println("\nSonuç = "+result);
    }
    static void times(){
        Scanner scanner = new Scanner(System.in);
        int number,result = 0,i = 1;
        while (true){
            System.out.println(i++ +". sayı = ");
            number = scanner.nextInt();
            if (number == 0){
                result = 0;
                break;
            }
              if (number == 1){
                  break;
              }
                result *= number;

        }
        System.out.println("\nSonuç = "+result);
    }
    static void divided(){
            Scanner scanner = new Scanner(System.in);
            int number,result = 0,i = 1;
            while (true){
                System.out.println(i++ +". sayi = ");
                number = scanner.nextInt();
                if (number == 0){
                    break;
                }
                if (number == 1){
                    result = number;
                }
                    result /=number;
            }
        System.out.println("\nSonuç = "+result);
    }
    static void power(){
        Scanner scanner = new Scanner(System.in);
        int us,taban,result = 1;
        System.out.println("Sayı giriniz.");
        taban = scanner.nextInt();
        System.out.println("Ussu giriniz ");
        us = scanner.nextInt();
        for(int i = 1; i <=us ;i++){
            result *=taban;
        }
        System.out.println("\nSonuc = "+result);
    }
    static void factorial(){
            Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz = ");
        int sayıDegeri = scanner.nextInt();
        int result =  1;
        for (int i = 1;i<=sayıDegeri;i++){
                     result *=i;
        }
        System.out.println("\nSonuç = "+result);
    }



}
