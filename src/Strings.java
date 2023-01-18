import java.util.*;

import javax.xml.transform.Source;
public class Strings {

//To print all the letters of a String 
    public static void printletters(String str){
        for(int i =0;i< str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }

// check for palindrome
    public static boolean palindrome(String str){
        for(int i=0; i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("Not a palindrome");
                return false;
            }
        }
        System.out.println("is a palindrome");
        return true;
    }

    public static double shortestpath (String path){
        int x1=0, y1=0, x2=0, y2=0 ;
        
        for(int i =0; i<path.length();i++){//O(n)
            char dir = path.charAt(i) ;
            //North
            if(dir == 'N'){
                y2 = y2+1;
            } 
            //South
            if(dir == 'S'){
                y2 = y2-1;
            } 
            //East
            if(dir == 'E'){
                x2 = x2+1;
            } 
            //West
            if(dir == 'W'){
                x2 = x2-1;
            }           
        }
        int X2=(x2-x1)*(x2-x1);
        int Y2 = (y2-y1)*(y2-y1);
        double SP = Math.sqrt(X2+Y2);

        return SP;
    }

    public static void substrings(String str, int si, int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr=substr+str.charAt(i);
        }
        System.out.println(substr);
    }

    public static String uppercase(String str){
        StringBuilder sb= new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String str){
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void oddeven(int n){
        int  bitmask=1; 
        if((n & bitmask) ==0){ //brackets are important
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static int getith(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
        return 1;
        }
    }

    public static int setith(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int clearith(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static void updatebit(int n,int i,int newbit){
        if(newbit==1){
            System.out.println(setith(n,i)); 
        }
        else{
            System.out.println(clearith(n, i)); 
        }
    }

    public static int countsetbits(int n){
        int count = 0;
        while(n>0){
            if((n & 1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // char[] arr = {'a','b','c','d'};
        //String str= "abcd";
        //String str2 = new String ("xyz@#123.");

        // //String name = sc.next(); // only takes first word (word before first space)
        // String name2 = sc.nextLine(); // takes whole line
        // System.out.println(name2);

        //String fullname = "Radhika Singhal";
        //System.out.println(fullname.length());

        //concatenation 
        //System.out.println(str + " " +str2);

        //At char
        //System.out.println(fullname.charAt(4));

        //printletters(fullname);;
        //palindrome("racecar");

       // String path = "WNEENESENNN";
       // System.out.println(shortestpath(path));

       //String str= "Hello World";
       //substrings(str, 0, 8);
       //System.out.println(str.substring(0,7));

    //    String[] str = {"apple", "mango", "banana"};
    //    String largest = str[0];
    //    for(int i = 0;i<str.length;i++){
    //     if(str[i].compareTo(largest)>0){
    //         largest=str[i];
    //     }
    //    }
    //    System.out.println(largest);

    // StringBuilder sb = new StringBuilder();

    // for(char ch='a'; ch<='z';ch++){ //O(26)
    //     sb.append(ch);//ch is the character that you want to add in your string sb
    // }
    // System.out.println(sb.toString());

    // String str= "hi, i am radhika";
    // System.out.println(uppercase(str));
    
    // String str ="aaabbbbbccd";
    // System.out.println(compress(str));

    //odd_even
    // oddeven(21);
    // oddeven(22);

    // System.out.println(getith(15, 2));
    // System.out.println(clearith(10, 1));
    
    // System.out.println(countsetbits(15));
    }
    
}
