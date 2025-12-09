package LAB;
import java.util.InputMismatchException;
import java.util.Scanner;
public class lab2 {

    
public static void main(String[] args)
{
 Scanner input = new Scanner(System.in);

    

    try{
        System.out.println("Bir sayı giriniz: ");
        int value = input.nextInt();
        System.out.println("you entered this int value :"+value);
    }

    catch(InputMismatchException e){
        System.out.println("You need to enter integer value!");

    }





input.close();


}













}

