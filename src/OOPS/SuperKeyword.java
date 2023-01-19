package OOPS;

public class SuperKeyword {
    public static void main(String[] args) {
        Horse h1 = new Horse();

    }
}

class Animal {
    Animal(){
        System.out.println("AC id colled...");
    }
}

class Horse extends Animal {
    
    Horse(){
        super();
        System.out.println("HC is called...");
    }
}
