import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n!=0){
	           for(int i=0;i<n;i++) {
	               String[] arr=sc.next().split("");
	               System.out.println(Integer.parseInt(arr[arr.length-1])%2==0?"even":"odd");
	       }
	   
		}
		
		sc.close();
		
	}
}
