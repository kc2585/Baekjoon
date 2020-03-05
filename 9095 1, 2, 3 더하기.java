import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int n;
        
        int[] output = new int[11]; 
        output[1] = 1; 
        output[2] = 2; 
        output[3] = 4; 
        
        for(int i=0; i<T; i++){
            n = sc.nextInt();
            
            for(int j=4; j<=n; j++){
                output[j] = output[j-1] + output[j-2] + output[j-3];
            }
            System.out.println(output[n]);
        }
        
 
    }
 
}
