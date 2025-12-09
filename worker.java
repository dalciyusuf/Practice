package LAB;
import java.util.Scanner;
public class worker {

    String name;
    int salary;
    static int sayac=0;
    public void setName(String name) {
        this.name = name;
    }
    
    public void SetSalary(int salary){
        if(salary == 0){
            throw new IllegalArgumentException("Salary amount must be greater than zero");
        }
        this.salary = salary;
    }

    public worker(){
        sayac++;
    }
    
    public static void main(String[] args){
       
        worker w1  = new worker();
        worker w2  = new worker();
        worker w3  = new worker();
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.println("1.Calisan İsim giriniz: ");
            w1.setName(input.nextLine());
            System.out.println("1.Calisan Salary giriniz: ");
            w1.SetSalary(input.nextInt());
            input.nextLine();

            System.out.println("2.Calisan İsim giriniz: ");
            w2.setName(input.nextLine());
            System.out.println("2.Calisan Salary giriniz: ");
            w2.SetSalary(input.nextInt());
            input.nextLine();

            System.out.println("3.Calisan İsim giriniz: ");
            w3.setName(input.nextLine());
            System.out.println("3.Calisan Salary giriniz: ");
            w3.SetSalary(input.nextInt());
            input.nextLine();
       
            System.out.println("Name:"+w1.name);
            System.out.println("Salary:"+w1.salary);

            System.out.println("Name:"+w2.name);
            System.out.println("Salary:"+w2.salary);
       
            System.out.println("Name:"+w3.name);
            System.out.println("Salary:"+w3.salary);
            
            System.out.println("Calisan sayisi:"+sayac);
       
        }
        
        catch(Exception e)
        {
        System.out.println("Exception caught: "+e.getMessage());
        }
        
    

    input.close();
    }

    }
    





