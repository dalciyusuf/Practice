package bitenler;
import java.util.Scanner;
class examGrade{
String name;
float midterm;
float finalExam;
float project;

float averageGrade(){
    return midterm*0.4f+finalExam*0.5f+project*0.10f;
}
void showCalculations(){

    System.out.println("Name: "+name+" "+"Average:"+averageGrade());
}

}

class calculations{

    public static void main(String[] args) {

    Scanner girdi = new Scanner(System.in);
    examGrade student1 = new examGrade();
    System.out.println("İsim giriniz :");
    student1.name = girdi.nextLine();
    System.out.println("Final Notu giriniz :");
    student1.finalExam = girdi.nextFloat();
    System.out.println("Vize Notu giriniz :");
    student1.midterm = girdi.nextFloat();
    System.out.println("Proje Notu giriniz :");
    student1.project = girdi.nextFloat();
    student1.showCalculations();
    girdi.close();
 }

}