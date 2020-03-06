import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String [] color = new String[] {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
		int [] multiply = new int[] {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
		
		String [] input = new String[3];
		int [] result = new int[3];
		
		for(int i=0;i<3;i++) {
			input[i] = sc.nextLine();
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<10;j++) {
				if(input[i].equals(color[j])) 
					result[i] = j;
			}
		}
		
		long tmp = result[0] * 10 + result[1];
		
		System.out.println(tmp * multiply[result[2]]);
		
		sc.close();

	}

}
