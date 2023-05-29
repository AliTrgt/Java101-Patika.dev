package OOP;
import java.util.Scanner;
public class Palindrom {


    static boolean isPalindrom(int number){
        int temp = number,reverseNumber = 0, lastNumber;
        while(temp != 0){
            System.out.println("=================");
            System.out.println("Sayı => " + temp);
            lastNumber = temp % 10;

            System.out.println("Son Basamak =>" + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni Sayı =>"+reverseNumber);
            temp /= 10;

        }
        if (number == reverseNumber) {
            System.out.println("\nBu sayı palindrom sayıdır");
        }
        else System.out.println("\nBu sayı palindrom sayı değildir");
        return  true;
    }






    public static void main(String[] args) {
        isPalindrom(1441);

    }
}
