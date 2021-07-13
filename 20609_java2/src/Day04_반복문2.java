import java.util.Scanner;

public class Day04_¹Ýº¹¹®2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("N:");
		n=sc.nextInt();
		for(int i=1; i<n+1; i++) {
			if(i%2==1) {
				System.out.println("+"+i);
				sum+=i;
			}
			else {
				System.out.println("-"+i);
				sum-=i;
			}
		}
		System.out.println("="+sum);
		
	}

}
