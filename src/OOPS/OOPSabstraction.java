package OOPS;
public class OOPSabstraction {
    public static void main(String[] args) {
        //Horse h = new Horse();
        // h.eat();
        // h.walk();
        //System.out.println(h.color); // o/p = brown; as first animal(parent class) constructor is called

        //Chicken c = new Chicken(); //new objects of class chicken
        // c.eat();
        // c.walk(); //to print

        //Animal a = new Animal() ; - not possible as abstract class can't have objects

        //Mustang myHorse = new Mustang();

        // Queen q = new Queen();
        // q.moves();

        Bear b = new Bear();
        b.eatsPlants();
        
    }
}
abstract class Animal{
    String color; 
    Animal(){ //constructor - work= bydefault sabko(every class that extends animal class) brown color deta hai
        // here constructor helps in initialising some objects for the child class
        //color = "brown";
        System.out.println("Animal constructor called...");

    }
    void eat(){ //non abstract method
        System.out.println("eats");
    }
    abstract void walk(); //abstract method - only gives idea not implementation
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called...");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs"); //implementation of above abstract method
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called...");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs"); //implementation of above abstract method
    }
}
//-------interface---------
interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, sideways, diagnol - (as many steps, as it wants)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("straight (horizontal or vertical) - (as many steps, as it wants)");
    }
}
//-------- multiple inheritance -----------
interface Herbivore{
    void eatsPlants();
}

interface Carnivore{
    void eatsFlesh();
}

class Bear implements Herbivore, Carnivore{
    public void eatsPlants(){
        System.out.println("bear eats Plants");
    }
    public void eatsFlesh(){
        System.out.println("bear eats Flesh");
    }
}