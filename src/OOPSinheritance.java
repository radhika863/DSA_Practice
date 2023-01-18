import java.util.*;
public class OOPSinheritance{
    public static void main(String[] args) {
        fish f1 = new fish();
        f1.fins(); f1.eats();
    }
}

//base class
class Animal{
    String color;
    void breathe(){
        System.out.println("breathe");
    }
    void eats(){
        System.out.println("eat");
    }
}

//derived class of Animal
class fish extends Animal{
    void fins(){
        System.out.println("fin");
    }
}