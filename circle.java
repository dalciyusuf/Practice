package LAB;
public class circle {
    
private int radius;
private static final double pi=3.141519;

double computeArea(){

    return radius*pi*radius;
}

public circle ( int radius){
    this.radius = radius;
}



public static void main(String[]args){

    circle c1 = new circle(5);
    circle c2 = new circle(10);
    circle c3 = new circle(15);

    circle[] circles = {c1,c2,c3};

    for(circle c : circles )  //for   each
    {
        System.out.println("Daire Alani:"+c.computeArea());
    }
}
}

// circle c : circles yaptık cunku circlesın eleman türü circle
// circlesın elemanlarını sırayla c tutuyor.

/*  

for-each, diziler (arrays) veya koleksiyonlar (ArrayList, Set vb.) gibi birden fazla eleman 
içeren yapıları tek tek dolaşmak için kullanılır.


for (veriTipi geçiciDeğişken : diziVeyaListe) {
    // her eleman için yapılacak işlem
}

veriTipi → dizinin içinde hangi türde eleman varsa (örneğin int, String, circle)
geçiciDeğişken → her turda o elemanı temsil eder
: → “içinde” anlamına gelir
diziVeyaListe → üzerinde döneceğin veri kümesi

*/ 