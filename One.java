import java.util.*;
public class One {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int prv = 0;
    int nxt = 1;

    for(int i=0;i<=a;i++){  
            if(i==0){
                System.out.println(0);

            }
            if(i==1){

            System.out.println(1);
            }
            if(i>1){
        int cur = prv + nxt;
        prv = nxt;
        nxt=cur;
        if(a<=cur){
            break;
        }
        
        System.out.println(cur);
            }
    }
}    
}
