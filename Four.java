import java.util.*;
public class Four {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            
    }    
}
                int[][] b = new int[m][n];
                    for(int i = 0; i < m; i++){
                        for(int j = 0; j < n; j++){
                            b[i][j] = a[j][i];

    }

}
                        for(int i=0;i<m;i++){
                            for(int j=0;j<n;j++){
                                System.out.print(b[i][j]+" ");
                        }
                        System.out.println();
    }
}
}