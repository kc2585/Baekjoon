import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int avg = sc.nextInt();
		
		int song = (num * (avg-1)) + 1;
		
		System.out.println(song);
		
		sc.close();

	}

}
