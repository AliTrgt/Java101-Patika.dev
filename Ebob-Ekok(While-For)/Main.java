package Giris;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,n2,deger = 0;
        System.out.print("İlk sayı : ");
        n1 = scanner.nextInt();
        System.out.print("İkinci sayı : ");
        n2 = scanner.nextInt();
        int ebob = 1;
        int ekok = 1;

        int i = 1;
        while(i <= n1){
            i++;                                                            //EBOB
            if(n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }

        }
        System.out.println("EBOB = "+ebob);
        System.out.println("===================");
        int k = 1;
        while(k <= (n1*n2)){                                                //EKOK
            k++;
            if(k % n1 == 0  && k % n2 == 0){
                ekok = k;
                break; /*break kullanmazsan 
              başlangıca kadar gider bize lazım olan değer ilk  değer */
            }
        }
        System.out.println("Ekok = "+ekok);
        

        /*
        for(int i = 1;i<=(n1*n2);i++){
            if(i%n1 == 0 && i%n2 == 0){
                ekok = i;
                break;
            }
        }

        System.out.println("EKOK = "+ekok);
        System.out.println("====================");

        for(int i = 1 ;i<=n1;i++){
            if(n1 % i == 0 && n2 % i == 0){
                ebob = i;

            }
        }
        System.out.println("EBOB = "+ebob);
        System.out.println("====================");
        for(int k = n1;k>=1;k--){
            if(n1%k == 0 && n2 % k == 0){
                ebob = k;
                break;
            }
        }
        System.out.println("EBOB = "+ebob);
        */

    }
}
