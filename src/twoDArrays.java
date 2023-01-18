import java.util.Scanner;

public class twoDArrays {

    public static boolean search(int[][] matrix, int n){
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j] == n){
                    System.out.println("(" + i+","+j+")");
                    return true;
                }                
            }
        }
        return false;
    }

    public static void spiralPrint(int[][] matrix){
        int startrow=0, startcol=0, endrow=matrix.length-1, endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j] + " ");
            }
            //right
            for(int i =startrow+1 ;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+ " ");
            }
            //bottom
            for(int j =endcol-1 ;j>=startcol;j--){
                if (startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+ " ");
            }
            //left
            for(int i =endrow-1 ; i>=startrow+1; i--){
                if (startcol==endcol){
                    break; 
                }
                System.out.print(matrix[i][startcol]+ " ");
            }

            startcol++; startrow++; endcol--; endrow--;
        }
    }

    public static int diagonalbrute(int[][] matrix){ 
        int sum=0;
//O(n^2) (brute force)
        // for (int i=0;i<matrix.length;i++){
        //     for(int j=0; j<matrix[0].length;j++){
        //         if(i==j){
        //             sum= sum +matrix[i][j];
        //         }
        //         else if(i+j==matrix.length-1){
        //             sum=sum+matrix[i][j];
        //         }
        //     }
        // }
//O(n) (optimized approach)
        for(int i =0;i<matrix.length;i++){
            //pd
            sum = sum + matrix[i][i];
            //sd
            if(i != matrix.length-1-i){
                sum=sum+matrix[i][matrix.length-i-1];
            }

        }
        return sum;
    }

    public static void searchInSortedArray(int[][] matrix, int key){
//O(n^2) (Brute form)
        for(int i=0;i<matrix.length;i++){
            for(int j = 0; j< matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println(i+","+j);
                }
            }
        }
    }

    public static boolean searchInSortedArray2(int[][] matrix, int key){
        int n=matrix.length, m=matrix[0].length; 
        int row = 0, col= m-1;

        while(row<n && col>=0){
            if(matrix[row][col] == key){
                System.out.println(row+","+col);
                return true;
            }
            else if(key<matrix[row][col]){
                col--; //move left
            }

            else{ //(key>matrix[row][col])
                row++; //move down
            }
        }

        System.out.println("key doesn't exist");
        return false;
    }
    public static void main(String[] args) {
        
        // int[][] matrix  = new int[3][3];
        // int n = matrix.length, m=matrix[0].length;
        // Scanner sc = new Scanner(System.in);

        // //input
        // for(int i = 0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         matrix[i][j]= sc.nextInt();
        //     }
        // }

        // //output
        // for(int i = 0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(matrix[i][j] + " ");                
        //     }
        //     System.out.println();
        // }
        // search(matrix, 1);

        int[][] matrix2 = { {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};

        int[][] matrix3 = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};

        int[][] matrix4 = {{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};

        //spiralPrint(matrix2);;
        //System.out.println(diagonalbrute(matrix2));
        //searchInSortedArray(matrix3, 4);
        searchInSortedArray2(matrix4, 33);
    }
}
