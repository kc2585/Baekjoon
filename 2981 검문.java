import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int []arr = new int[num];
		
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int []dif = new int[num-1];
		
		for(int i=0;i<num-1;i++) {
			dif[i] = arr[i+1] - arr[i];
		}
		
		int g = 0;
		if(num > 2) {
			g = gcd(dif[0],dif[1]);
			for(int i=2;i<num-1;i++) {
				g = gcd(g,dif[i]);
			}
		}
		else {
			g = dif[0];
		}
		
		for(int i=2;i<=g;i++) {
			if(g % i==0) {
				System.out.print(i + " ");
			}
		}	
		
		sc.close();
	}

	private static int gcd(int a, int b) {
		if(b == 0)
			return a;
		return gcd(b, a % b);
	}

}
