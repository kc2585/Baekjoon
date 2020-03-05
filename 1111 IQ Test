import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int a=0;
		int b=0;
		int []arr = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		
		int arrSize = arr.length;
		
		if(arrSize == 1) {
			System.out.println("A");
		}
		
		else if(arrSize == 2) {
			if(arr[0] == arr[1]) {
				System.out.println(arr[0]);
			}
			else
				System.out.println("A");
		}
		
		else if(arrSize > 2) {
			boolean equal = true;
			
			for(int i=0;i<(arrSize-1);i++) {
				if(i == 0) {
					int current = arr[i];
					int next = arr[i+1];
					int after_next = arr[i+2];
					
					if(next - current == 0) {
						a = 1;
						b = next - (current * a);
					}
					else {
						a = (after_next - next) / (next - current);
						b = next - (current * a);
					}
				}
				
				int data = arr[i] * a + b;
				int dataNext = arr[i+1];
				
				if(!(data == dataNext)) {
					equal = false;
				}
			}
			
			if(equal) 
				System.out.println(arr[arr.length-1] * a + b);
			else if(!equal)
				System.out.println("B");
		}
	}
}
