 import java.util.*;
 public class Three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int arr[][] = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int arr1[][] = new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int matrix[][] = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                int z=0;
                for (int k=0;k<r2;k++){
                    z += arr[i][k] * arr1[k][j];  
                    
                } 
                matrix[i][j] = z; 

            }
        }
        for(int i=0;i<r1;i++){
            for (int j=0;j<c2;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println(); 
        }
    }
}
