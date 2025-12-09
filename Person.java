package LAB;
//2022 2023 2.soru
public class Person {
    
String name;
int age;

public Person(int age){
    this(" ",age);
}
public Person (String name,int age){
    this.name = name;
    this.age = age;
}
   }

    class EncapsulatedPerson{
        private String name;
        private int age;
        
    public String getName(){
        return name;

    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name= name ;
    }
    public void setAge(int age){
        if(age<20 || age>60){
            throw new IllegalArgumentException("age 20 ile 60 arasi olmali");
        }
    this.age = age;
    }

    
public static void main(String[]args)
{
    try{
            EncapsulatedPerson p1 = new EncapsulatedPerson();
            p1.setAge(30);
            p1.setName("Yusuf");
    }
    
    catch(Exception e){
        System.out.println(e.getMessage());
    }




}
    }