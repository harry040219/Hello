import java.util.Scanner;

public class Day03_���� {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		String operand = input1.next();
		
		System.out.print("���� 2���� �Է��ϼ���: ");
		double num1=input1.nextDouble();
		double num2=input1.nextDouble();
		
		if(operand=="+") {
			System.out.println(num1+ "+" + num2+ "=" +(num1+num2));
		}
		else if(operand=="-") {
			System.out.println(num1+ "-" + num2+ "=" +(num1-num2));
		}
		else if(operand=="*") {
			System.out.println(num1+ "*" + num2+ "=" +(num1*num2));
		}
		else if(operand=="/") {
			if (num2==0) {
				System.out.println("0�� ���� ���� �����ϴ�");
			}
			else{
				System.out.println(num1+ "/" + num2+ "=" +(num1/num2));
			}
		}

	}

}
