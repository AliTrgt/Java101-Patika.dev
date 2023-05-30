package OOP;
import java.util.Scanner;
public class RecursifAsalSayi {


        static void isAsal(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Sayı Değeri Giriniz : ");
            int input = scanner.nextInt(),counter = 0;


            for (int i = 2;i<input;i++){
                if (input % i == 0){
                        counter++;

                }

            }

            if (counter == 0){
                    System.out.println(input+" sayısı asal sayıdır. ");

                }
                    else System.out.println(input+" sayısı asal sayı değildir. ");

        }



    public static void main(String[] args) {
            isAsal();
    }
      }
