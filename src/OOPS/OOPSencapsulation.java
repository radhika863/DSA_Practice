package OOPS;
import java.net.PasswordAuthentication;

public class OOPSencapsulation {
    public static void main(String[] args) {
        // String color = "red";
        // int tip = 3;

        // Pen p1= new Pen(); // constructor - yaha asli pen p1 bna hai
        // p1.setcolor("purple");
        // p1.settip(5);
        // System.out.println(p1.color);
        // System.out.println(p1.tip);

        // p1.setcolor("red");
        // p1.settip(6);
        // System.out.println(p1.color);
        // System.out.println(p1.tip);

        // BankAccount myacc = new BankAccount();
        // myacc.username = "nujijiko";
        // myacc.setpassword("htrdrtdhrf");

        // System.out.println(myacc.username);

        // Person myobj = new Person();
        // //myobj.setName("Radhika Singhal");
        // System.out.println(myobj.getName());
        // myobj.setName("Radhika");
        // System.out.println(myobj.getName());

        Student s1 = new Student();
        // Student s2 = new Student("Radhika");
        // Student s3 = new Student(123);
        // System.out.println(s2.getName() + " " + s3.getRoll());        

        s1.name = "Radhika";
        s1.roll = 17;
        s1.password = "abc";
        s1.marks[0] = 100; s1.marks[1]=90; s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        for(int i=0;i<3; i++){
            System.out.println(s1.marks[i]);
        }
        s1.marks[2] =89;
        for(int i=0;i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setpassword (String pwd){password = pwd;}
}

class Pen{
    String color;
    int tip;
    void setcolor(String newcolor){color = newcolor;}
    void settip(int newtip){tip = newtip;}
}

class Person {
    private String name = "John";
    public String getName(){ return name; }
    public void setName(String newName){this.name = newName;}
}

class Student {
    String name, password; int roll ; int[] marks; 
    //non-paramaterized
    Student(){
        marks =new int[3];
        //System.out.println("constructor is called...");
    }
    //paramaterized
    Student(String name){this.name = name;}
    Student(int roll){this.roll = roll;}
    public String getName(){return name;}
    public int getRoll(){return roll;}
    // shallow copy constructor
    // Student(Student s1){ 
    //     this.name = s1.name; 
    //     this.roll = s1.roll; 
    //     this.marks = s1.marks;
    // } to use deep copy constructor me must comment out shallow one

    // deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name; 
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

}
