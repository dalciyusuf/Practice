package LAB;
import java.util.Scanner;
public class employee{
    
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;

    void displayInfo()
    {
        System.out.println("Your name and socialSecurityNumber :"+name+" "+socialSecurityNumber);
    }

    float displaySalary()
    {
        return wage*workingHours;
    }
    
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

   employee employee1 = new employee();
   
   employee1.name = "Yusuf";
   employee1.socialSecurityNumber = 2660897;
   employee1.wage = 10;
   employee1.workingHours = 8;
   
   employee1.displayInfo();
   System.out.println(employee1.displaySalary());

   employee employee2 = new employee();

   System.out.println("Adinizi Giriniz: ");
   employee2.name = input.nextLine();
   System.out.println("Tc nizi girin: ");
   employee2.socialSecurityNumber = input.nextInt();
    System.out.println("Working Hours Gir: ");
   employee2.workingHours = input.nextInt();
    System.out.println("wage gir: ");
   employee2.wage = input.nextFloat();

   employee2.displayInfo();
   System.out.println("salary: "+employee2.displaySalary());


        input.close();
    }









}