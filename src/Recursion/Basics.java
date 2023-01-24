package Recursion;
public class Basics {

    public static void decnum(int n){
        if (n==1){ // defining base case
            System.out.print(n);
            return;
        }
        System.out.print(n+" "); //kaam
        decnum(n-1); //inner func call
    }

    public static void main(String[] args) {
        int n=10;
        decnum(n);
    }
}
