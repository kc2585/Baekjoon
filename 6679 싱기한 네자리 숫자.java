
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ten; 
		int twe; 
		int hex;
		
		for(int i=1000;i<=9999;i++) {
			ten=0; twe=0; hex=0;
			
			for(int n=i;n>0;n/=10) {
				ten += n % 10;
			}
			
			for(int n=i;n>0;n/=12) {
				twe += n % 12;
			}
			
			for(int n=i;n>0;n/=16) {
				hex += n % 16;
			}
			
			if(ten == twe && twe == hex)
				System.out.println(i);
		}
		
	}

}
