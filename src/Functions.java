import java.util.*;

public class Functions {

    public static int sum(int a , int b){   // here a&b are parameters or formal parameters
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        int c=a+b;
        return c;
    }

    static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;

        System.out.println(a);
        System.out.println(b);
    }

    public static int product (int a, int b){
        int product = a*b;
        return product;
    }

    public static int factorial(int n ){
        if (n==0){
            return 1;
        } int fac =1;
        for (int i = 1; i <=n; i++) {
            fac = fac*i ; 
        }
        return fac;
    }

    public static float BinCoeff (int n , int r){
        int num = factorial(n);
        int den = factorial(r) * factorial(n-r);

        float BC = num/den;
        return BC;
    }

    public static boolean isPrime (int n ){
        if (n==2){
            return true;
        }
        for (int i = 2; i<= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
    return true;
    }

    public static void isPrimeR (int n){
        
        for (int i = 2; i<=n; i++){
            if (isPrime(i)){
                System.out.print(i + ", ");
            }
        }
    }    

    public static  int binToDec(int BinNo){
        int dec=0, pow = 0;

        while(BinNo>0){
        int LD = BinNo %10;
        dec = dec + (LD * (int)Math.pow(2, pow));
        pow++;
        BinNo = BinNo/10;
        }
        return dec;
    }

    public static int decToBin(int n){
        int rem=0;
        int pow = 0;
        int bin = 0;
        while(n>0){
            rem = n%2;
            bin = bin + rem* (int)Math.pow(10, pow);
            pow++;
            n=n/2;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int a=0,b=0,c=0;
        //System.out.println("Sum: " + sum(a,b)); // here a&b are arguments or actual parameters

        //int x=4, y=7;
        //swap(x,y);

        //System.out.println(product(4, 6));

        //Binomial Coefficient
        //System.out.println(BinCoeff(5, 2));

        //Is prime or not (Optimised)
        //System.out.println(isPrime(12));

        //prime in a range
        //isPrimeR(12);

        //System.out.println(binToDec(1000001));

        //System.out.println(decToBin(64));










    }
    
}
