import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [][]arr = new int [n+1][m+1];
		
		for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= m; j++) {
	                arr[i][j] = sc.nextInt();
	            }
	        }
		
		int[][] dp = new int[n + 1][m + 1];
		 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + arr[i][j];
            }
        }
 
        System.out.println(dp[n][m]);

        sc.close();
	}

}
