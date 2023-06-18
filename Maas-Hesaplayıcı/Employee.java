package MaasHesaplayıcı;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;


    public  Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int tax(){
        int currentTax = 0;
        if (this.salary >1000){
            currentTax = (int) (this.salary * 0.03);
            return currentTax;
        }
            return  currentTax;
    }

   public  int  bonus(){
       int total = 0;
        if (this.workHours > 40){
             total  +=  30 * (this.workHours - 40);
            return total;
        }
       return total;
    }
   public int raiseSalary(){
        int currentSalary = 0;
        int currentYear = 2021;
       if (currentYear - this.hireYear > 19 ){
           currentSalary = (int) (salary * 0.15);
           return  currentSalary;
       }
        if (currentYear - this.hireYear < 10){
            currentSalary = (int) (salary * 0.05);
            return currentSalary;
        }
        if (currentYear -this.hireYear > 9 || currentYear - this.hireYear < 20){
            currentSalary = (int)(salary * 0.1);
            return currentSalary;
        }



        return  1;
   }

    public void print(){
        System.out.println("Adı : "+this.name);
            System.out.println("Maaşı : "+this.salary);
            System.out.println("Çalışma Saati : "+this.workHours);
            System.out.println("Başlangıç Yılı : "+this.hireYear);
            System.out.println("Vergi : "+tax());
            System.out.println("Bonus : "+bonus());
            System.out.println("Maaş Artışı : "+raiseSalary());
            System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+((this.salary+raiseSalary())-(bonus()+tax())));
            System.out.println("Toplam Maaş : "+(this.salary+raiseSalary()));
    }


}
