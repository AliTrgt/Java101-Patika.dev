package Giris;
import java.util.Scanner;
public class Deneme {

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Verilecek Olan Para Değerini Giriniz : ");
    int fiyat = input.nextInt();
        System.out.println("KDV'siz Fiyat = "+fiyat);
    if(fiyat <=1000){
        float toplamPara = fiyat;
        fiyat *= 1.18;
            System.out.println("KDV'li Fiyat : "+fiyat);
            System.out.println("KDV tutarı : "+(fiyat-toplamPara));
    }
    else  if(fiyat > 1000){
        float toplamPara = fiyat;
        fiyat *= 1.08;
        System.out.println("KDV'li Fiyat : "+fiyat);
        System.out.println("KDV tutarı : "+(fiyat-toplamPara));

    }



    










    }

}
