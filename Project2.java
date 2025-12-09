package bitenler;
import java.util.Scanner;
class Student{
String name;
float midterm;
float finalExam;
float calculateAvg(){
    return midterm*0.4f+finalExam*0.6f;
}
void ShowStudentInfoandScore(){
    System.out.println("Name: "+name+ "\n"+"Average : "+calculateAvg());
}

 }  

public class Project2 {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    Student st  = new Student();
    Student st1 = new Student();
    // st.name = "Yusuf";

    st.name = input.nextLine(); // kullanıcdan girdi alıyor 
    st1.name = "Sude";
    st.midterm = 75.4f;
    st1.midterm = 90;
    st.finalExam = 80.5f;
    st1.finalExam = 100;
    float avg = st.calculateAvg();
    float avg1 = st.calculateAvg();
    
    System.out.println("Average for Yusuf :"+avg);
    System.out.println("Average for Sude: "+avg1);
    
    st.ShowStudentInfoandScore();
    st1.ShowStudentInfoandScore();

input.close();







}




} 


