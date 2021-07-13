import java.util.Scanner;

public class 수행연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float sum=0, i=0;

		while(i<5) {
			System.out.print("성적 입력: ");
			sum+=sc.nextInt();
			i++;
		}
		System.out.println("합계: "+(int)sum);
		sum/=5.0;
		System.out.println("평균: "+sum);
		
	}

}
