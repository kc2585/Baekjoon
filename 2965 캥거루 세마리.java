import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int kang1 = sc.nextInt();
		int kang2 = sc.nextInt();
		int kang3 = sc.nextInt();
		
		if((kang2-kang1)>(kang3-kang2))
			System.out.println((kang2-kang1)-1);
		else
			System.out.println((kang3-kang2)-1);
		
		sc.close();
	}

}
