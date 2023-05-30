package OOP;
import java.util.Scanner;
public class DeseneGoreMetod {

    static void output(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int input = scanner.nextInt(),temp = 0;
        temp = input;
        while(true){

            if (temp > 0){
                System.out.print(temp+" ");
                temp -=5;

            }
            else if (temp == 0 || temp < 0){
                System.out.print(temp+" ");
                temp += 5;

                while (temp <= input){
                    System.out.print(temp+" ");
                    temp += 5;
                }
                break;
            }



        }
    }









    public static void main(String[] args) {
        output();

}


}
