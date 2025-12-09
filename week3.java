package bitenler;
import java.util.Scanner;
public class week3 {
    
    private float age;
    private String color; 

    void printData(){

        System.out.println("the age : "+age+"the color:"+color);
    }
   //public static void main(String[]args){

     //Scanner input = new Scanner(System.in);
   // week3 dog1 = new week3();
    

    //System.out.println("renk gir");
    //dog1.color = input.nextLine();
   // System.out.println("Yas gir :");
    //dog1.age = input.nextFloat();
   // dog1.printData(); 
    // boyle olsa problem yoktu.


    }

class Yusuf{

public static void main(String[]args){


Scanner input = new Scanner(System.in);
    week3 dog1 = new week3();
    

    System.out.println("renk gir");
   // dog1.color = input.nextLine(); dog1 lilerin yorumunu kaldır not vısıble dıcek anlarsın
    System.out.println("Yas gir :");
    // dog1.age = input.nextFloat();
    dog1.printData();
    // boyle calısmıyor cunku private olarak atadık degıskenlerı ve farklı clasta calısmıyor
    // yukarıdakı classta cagırmıs olsak calısacaktı gayet duzgunce
    // illa ben burada kullanıcam dıyorsan da week3 classına fonsksiyon acarsın
    //void setAge(int a){
    // age = a;} dersin student.setAge(15) dedigin an a 15 olur yanı age 15 olur .
    // bu olaya encapsulation denir gizleme yani


    input.close();
}


}