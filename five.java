import java.util.*;
public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[j][i]=sc.nextInt();
            }
        }

        // 1 2 
        // 3 4
        int sum = 0;
        int a[];
        a = new int[c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                sum += arr[i][j];

                a[i] = sum;

            }
            sum = 0;
        }

        for(int i = 0; i<r; i++){
            System.out.println(a[i]);
        }
        

    
}
}