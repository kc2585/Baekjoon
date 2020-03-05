import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		while(T-->0) {
			
			int N = scanner.nextInt();
			
			int gradeSum=0;
			float scoreSum=0;
			
			for(int i=0;i<N;i++) {
				int C = scanner.nextInt();
				double G = scanner.nextDouble();
				gradeSum += C;
				scoreSum += C * G;
			}
			
			System.out.println(gradeSum +" "+Math.round(scoreSum*10/gradeSum)/10.0);
		}
		
	}

}
