    package Giris;
    import java.util.Scanner;
    public class Daire {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            float pi = 3.14f;
            System.out.println("Dairenin alanını bulmak için Sırasıyla açı ve yarıçap değerlerini giriniz.");
            double aci = scanner.nextDouble();
            int r = scanner.nextInt();
            float alan = (float) ((pi*(r*r)*aci)/360);
    
            System.out.println("Daire Diliminin Alanı = "+alan);
    
        }
    
    
    
    }
