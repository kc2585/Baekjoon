import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int kim = sc.nextInt();
		int lim = sc.nextInt();
		
		int cnt = 0;
		
		while(kim!=lim) {
			kim = kim % 2 + kim / 2;
			lim = lim % 2 + lim / 2;
			cnt ++;
		}
		
		System.out.println(cnt);

	}

}
