import java.util.Scanner;

public class Day03_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("BirthY: ");
		int year=sc.nextInt();
		int age=2021-year+1;
		
		System.out.println("Gender: ");
		
		String MF=sc.next();

		if (MF.equals("M"))
			System.out.print("�����" + age + "�� �����Դϴ�.");
		 else if (MF.equals("F"))
			 System.out.print("�����" + age + "�� �����Դϴ�.");
		 else
			 System.out.print("�߸� �Է��ϼ̽��ϴ�.");

	}

}
