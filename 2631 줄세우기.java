import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int []student = new int [N+1];
		
		for(int i=0;i<N;i++) {
			student[i] = scanner.nextInt();
		}

	}

}
