package LAB;

public class nft {
    public double balance;
    public String owner;
    
}

class EncapsulatedNFT{
    private double balance;
    private String owner;

    public double getBalance(){

        return balance;

    }
    

    public String getOwner(){
        return owner;
    }
    
    public void setBalance(int balance){

        if(balance<0 || balance>10000){
        throw new IllegalArgumentException("wrong balance ınput");}
            this.balance = balance;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }

    public void printInfo(){
        System.out.println("Balance:"+balance+"Owner Name:"+owner);
    }


public static void main(String[]args){

    EncapsulatedNFT enft = new EncapsulatedNFT();
    enft.balance = 1000;
    enft.owner = "Yusuf";

    enft.printInfo();

}
}