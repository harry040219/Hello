import java.util.Scanner;

public class Day03_나이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("BirthY: ");
		int year=sc.nextInt();
		int age=2021-year+1;
		
		System.out.println("Gender: ");
		
		String MF=sc.next();

		if (MF.equals("M"))
			System.out.print("당신은" + age + "세 남자입니다.");
		 else if (MF.equals("F"))
			 System.out.print("당신은" + age + "세 여자입니다.");
		 else
			 System.out.print("잘못 입력하셨습니다.");

	}

}
