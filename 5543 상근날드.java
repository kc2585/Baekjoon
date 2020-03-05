import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int []burger = new int[3];
		
		for(int i=0;i<3;i++) {
			burger[i] = sc.nextInt();
		}
		
		Arrays.sort(burger);
		int min1 = burger[0];
		
		int []drink = new int[2];
		
		for(int i=0;i<2;i++) {
			drink[i] = sc.nextInt();
		}
		
		Arrays.sort(drink);
		int min2 = drink[0];
		
		System.out.println(min1+min2-50);
	}

}
