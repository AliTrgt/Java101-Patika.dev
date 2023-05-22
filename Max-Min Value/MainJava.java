import java.util.Scanner;

public class MainJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi,n;
        int max = 0;
        int min = 0;

        System.out.print("Kaç tane sayı gireceksiniz:");
        n = scanner.nextInt();

        for(int i = 1;i <= n;i++){
            System.out.print(i+". Sayıyı giriniz : ");
            sayi = scanner.nextInt();

            if(sayi > max){
                max = sayi;
            }

            if(sayi < min || min == 0){
                min = sayi;

            }
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);
    }
}
