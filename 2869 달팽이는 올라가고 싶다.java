import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int V = scanner.nextInt();
		
		int day=0;
		int h=0;
		
		while(h<V) {
			day++;
			h+=A;
			if(h>=V) break;
			h-=B;
		}
		
		System.out.println(day);

	}

}
