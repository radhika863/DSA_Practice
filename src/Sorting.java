import java.util.*;
public class Sorting {
    public static void bubblesort(int[] arr){
        for (int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++ ){
                if(arr[j+1]<arr[j]){
                    //swap
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                }
            }
        }
    }

    public static void selectionsort(int[] arr){
        for(int turn=0;turn<arr.length-1;turn++){
            int minPos=turn; 
            for(int i = turn+1; i< arr.length; i++){
                if(arr[i]<arr[minPos]){
                    minPos=i;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos]= arr[turn];
            arr[turn] = temp;
        }
    }

    public static void insertionsort(int[]arr){
        for(int i =1;i<arr.length;i++){
            int curr= arr[i];
            int prev = i-1;
            //finding out pos to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }

    public static void countingsort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }

        int[] count = new int[largest+1];
        for(int i =0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i =0; i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
            j++;
            count[i]--;
            }
            
        }
    }


    public static void print(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1,3,9,6,2,5,5,1,6};

        //bubble sort
         //bubblesort(arr); // first change the array
        // print(arr);      // then print the changed array

        // selection sort
        // selectionsort(arr);
        // print(arr);

        // insertion sort
        // insertionsort(arr);
        // print(arr);

        //Arrays.sort(arr);
        //Arrays.sort(arr,Collections.reverseOrder());

        // Arrays.sort(arr,1,6);
        // print(arr);

        countingsort(arr);
        print(arr);



    }
}
