package Giris;
import java.util.Scanner;
public class AtmProject {
    public static void main(String[] args) {
        String userName,password;
        Scanner scanner = new Scanner(System.in);
        int right = 3 ;
        int balance = 1500;
        int select;

        while(right > 0){
            System.out.print("Kullanıcı Adınız : ");
            userName = scanner.nextLine();
            System.out.print("Parolanız : ");
            password = scanner.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("\nMerhaba, Patika Bankasına Hoşgeldiniz !");
                do{
                System.out.println("Yapmak istedğiniz işlemi seçiniz : \n1-Para yatırma\n2-Para çekme\n3-Bakiye sorgulama\n4-Çıkış yap");
                select = scanner.nextInt();
                switch (select){
                    case 1:
                        System.out.println("Para miktarı : ");
                        int price = scanner.nextInt();
                        balance += price; break;
                    case 2:
                        System.out.println("Para miktarı : ");
                        price = scanner.nextInt();
                        if(balance <price) {
                            System.out.println("Yetersiz bakiye ! ");
                        }
                        else balance -= price;

                    case 3:
                        System.out.println("Bakiyeniz : "+balance); break;
                    case 4: right = 0; break;
                }
                }while (select !=4);
                System.out.println("Tekrar Görüşmek Üzere");


            }
            else  {
                right--;
            if (right == 0){
                System.out.println("Hesabınız bloke edildi banka ile iletişime geçiniz.");
            }
            else System.out.println("Kalan Hakkınız : "+right);
            }
        }


    }
}
