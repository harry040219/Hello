
public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog a = new Dog("Ǫ��",2,"�Ķ�");
		Dog b = new Dog("�ҵ�",5,"����");
		a.barking();
		a.sleeping();
		b.hungry();
		b.sleeping();
		
		String str=b.toPrint();
		System.out.println(str);
		System.out.println(a.toPrint());
	}
}
