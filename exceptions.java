package bitenler;
public class exceptions {
    
    public static void main(String[] args) {

    try{
        int x = 10/0;
        System.out.println(x);
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    // getMessage() e exceptionunun hata mesajını yazdırır

}
}
