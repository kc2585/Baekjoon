import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int num = sc.nextInt();
		int []arr = new int[num];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int min = arr[0];
		int max = arr[num-1];
		
		System.out.println(min * max);
		
		sc.close();

	}

}
