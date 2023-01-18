import java.util.Arrays;

public class ArraysCC{ 

    public static int linearSearch(int[] arr, int key){
        for (int i = 0; i <= arr.length; i++) {
            if(arr[i]==key){
                return i;
            }

        }
        return -1;
    }

    public static int getLargest(int[] arr){
        int lar = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (lar<arr[i]){
                lar = arr[i];
            }
            
        }
        return lar;
    }

    public static int binarySearch (int[] arr, int key){
        int start, end, mid;

        start = 0;
        int n = arr.length;
        end = n-1;
        

        while (start<=end){
            mid = (start+end)/2;

            if (arr[mid] == key){
                return mid;
            }

            else if(key<arr[mid]){
                end = n/2 - 1;
            }

            else if(key>arr[mid]){
                start = n/2 + 1;
            }

        }

        return -1;
    }

    // public static void swap(int a, int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;

    // }

    public static void reverseArray(int[] arr){
        int first = 0, last = arr.length - 1;
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;                  
            first++; last--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void pairs(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for (int j = i; j < arr.length; j++) {
                System.out.print(arr[i]+","+arr[j]+" | ");
            }
            System.out.println();
        }
    }

    public static void subArrays(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for (int j = i; j < arr.length; j++) {
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+","+" ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public static int bruteForce(int[] arr){
        int curr = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            for (int j = i; j < arr.length; j++) {
                curr = 0;                   // update curr
                for(int k=i; k<=j; k++){
                    curr = arr[k] + curr;
                }
                //System.out.println(curr);   //to get sum of all the arrays
                if(curr>max){               // update max
                    max = curr; 
                }
            }
        }
        return max;
    }

    public static int prefixArray (int[] arr){
        int curr = 0, max = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        // To calculate prefix array
        for(int i = 1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i = 0; i<arr.length; i++){
            for (int j = i; j < arr.length; j++) {
                curr = i ==0 ? prefix[j] : prefix[j] - prefix[i-1]; // here i = start; j = end
                
                if(curr>max){               // update max
                    max = curr; 
                }
            }
        }
        return max;
    }

    public static int kadanes (int[] arr){
        int curr= 0, max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            curr = curr + arr[i];
            if(curr<0){
                curr = 0;
            }
            max = Math.max(curr, max);
        }
        return max;
    }

    // public static int trappedRainwater (int[] height ){
    //     //calculate left max boundary - array
    //     int[] leftMax = new int[height.length];
    //     leftMax[0] = height[0];
    //     for (int i = 1; i < leftMax.length; i++) {
    //         leftMax[i] = Math.max(height[i], leftMax[i-1]);
    //     }

    //     //calculate right max boundary - array
    //     int[] rightMax = new int[height.length];
    //     rightMax[height.length-1] = height[height.length-1];
    //     for (int i = leftMax.length-2; i >= 0; i--) {
    //         rightMax[i] = Math.max(height[i], rightMax[i+1]);
    //     }
        
    //     int trappedwater = 0, waterLevel = 0, totaltrappedwater=0;
    //     for (int i = 0; i < rightMax.length; i++) {
    //         waterLevel = Math.min(rightMax[i], leftMax[i]);
    //         trappedwater = (waterLevel - height[i])*1;

    //         totaltrappedwater = trappedwater +totaltrappedwater;
    //     }
        
    //     //loop
    //     //waterlevel = min(lestmax, rightmax)
    //     //trappedwater= (waterlevel - height) * width
        
    //     // System.out.println(Arrays.toString(leftMax));
    //     // System.out.println(Arrays.toString(rightMax));
        
    //     return totaltrappedwater;
    // }

    public static int maxprofit(int[] prices){
        int maxprofit = 0, profit = 0; 
        int[] bp = new int[prices.length-1];
        bp[0]=prices[0];
        for(int i = 1; i<prices.length-1; i++){
            bp[i] = Math.min(bp[i-1], prices[i]);
            //System.out.print(bp[i]+"|");
            profit = prices[i] - bp[i];
            maxprofit = Math.max(maxprofit, profit);            
        }
        if (maxprofit<=0){
            return 0;
        }
        return maxprofit;
    }

    // HOMEWORK

    public static boolean twiceinarray (int[] arr){
        int ele = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(ele==arr[i]){
                return false;
            }
        }        
        return true;
    }

    public static void main(String[] args) {
        
        //int[] arr = {4,2,0,6,3,2,5}; //(trapped rainwater)
        int[] arr2 = {7,1,5,3,6,4}; // (stocks - max profit)

        int[] arr3 = {1,2,33,33,4};

        // System.out.println(arr.length);
        // System.out.println(arr[1] + 3);
        // arr[4] = 5;
        // System.out.println(arr[4]);

        // System.out.println(linearSearch(arr, 6));

        // System.out.println(getLargest(arr));
        // System.out.println(binarySearch(arr, 2));

        //reverseArray(arr);

        //pairs(arr);
        //subArrays(arr);

        //System.out.println(bruteForce(arr));
        //System.out.println(prefixArray(arr)); 
        //System.out.println(kadanes(arr));

        //System.out.println(trappedRainwater(arr));
        //System.out.println(maxprofit(arr2));
        System.out.println(twiceinarray(arr3));
                                    

        
    }
}