import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
		    String str = sc.nextLine();
		    
		    String result = "";
		    for(int j=0;j<str.length();j++) {
		    	for(int k=0;k<a;k++) {
		    		result += str.charAt(j);
		    	}
		    }
		    result = result.replaceAll(" ", "");
		    System.out.println(result);
		}
		sc.close();
	}

}
