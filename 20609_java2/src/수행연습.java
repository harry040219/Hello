import java.util.Scanner;

public class ���࿬�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float sum=0, i=0;

		while(i<5) {
			System.out.print("���� �Է�: ");
			sum+=sc.nextInt();
			i++;
		}
		System.out.println("�հ�: "+(int)sum);
		sum/=5.0;
		System.out.println("���: "+sum);
		
	}

}
