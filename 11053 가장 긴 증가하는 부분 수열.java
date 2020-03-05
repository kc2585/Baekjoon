import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int []A = new int [N+1];
		int []dp = new int [N+1];
		
		
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		
		dp[0] = A[0];
		int idx = 1;
		int tmp = 0;
		
		for (int i = 1; i < N; i++) {
			if (dp[idx - 1] < A[i])
				dp[idx++] = A[i];
			else if (dp[0] > A[i])
				dp[0] = A[i];
			else {
				tmp = Arrays.binarySearch(dp, 0, idx, A[i]);
				dp[tmp < 0 ? -tmp - 1 : tmp] = A[i];
			}
		}
		
		System.out.println(idx);
		
	}

}
