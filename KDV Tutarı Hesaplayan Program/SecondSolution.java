package Giris;
import java.util.Scanner;
public class SecondSolution {

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Baslangic Parasını Giriniz : ");
    int startMoney = input.nextInt();
        System.out.println("KDV'siz Fiyat = "+startMoney);
        double totalMoney;
        double amount;
        if(startMoney <= 1000){
            amount = (startMoney*0.18);
            totalMoney = (startMoney+amount);
            System.out.println("KDV'li Fiyat : "+totalMoney);
            System.out.println("KDV tutarı = "+amount);

        }

        else if  (startMoney > 1000){
            amount = (startMoney*0.08);
            totalMoney = (startMoney+amount);
            System.out.println("KDV'li Fiyat = "+totalMoney);
            System.out.println("KDV tutarı = "+amount);
        }












    }

}
