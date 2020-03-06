import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int []arr = new int[num+1];
		
		
		for(int i=1;i<=num;i++) {
			arr[i] = sc.nextInt();
		}
		
		int []dp = new int[num+1];
		dp[1] = arr[1];
		
		if(num > 1)
			dp[2] = dp[1] + arr[2];
		
		for(int i=3;i<=num;i++) {
			dp[i] = Math.max(dp[i-2]+arr[i],dp[i-3]+arr[i-1]+arr[i]);
		}

		System.out.println(dp[num]);
		
		sc.close();

	}

}
