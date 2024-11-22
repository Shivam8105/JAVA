package oops;

class MethodOverloading{
    void greetings(){
        System.out.println("Hello,Kaisi ho?");
    }
    
    void greetings(String name){
        System.out.println(name + " kaisi ho darling?");
    }
    
    void greetings(String cute,String cute_2){
        System.out.println("Meri " + cute + " mera " + cute_2 + " kya kr rha hai?");
    }
}

public class lec2 {
    public static void main(String[] args) {  
        MethodOverloading wifey = new MethodOverloading();
    
        wifey.greetings();
        wifey.greetings("Khushi");
        wifey.greetings("gudiya","babu");
    }
    
}