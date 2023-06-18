package Giris;
import java.util.Scanner;
public class KullanıcıGirisi {
    public static void main(String[] args) {
        String userName,password,newpassword;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adını Giriniz : ");
        userName = scanner.nextLine();
        System.out.print("Şifreyi giriniz : ");
        password = scanner.nextLine();


        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Hesaba Başarıyla Giriş Yapıldı.");
        }
        else {
            System.out.println("Hesaba Giriş Yapılamadı Şifrenizi Sıfırlamak İstiyor Musunuz.");

        }
    }
}
