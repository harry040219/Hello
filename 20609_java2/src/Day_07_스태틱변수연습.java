
public class Day_07_스태틱변수연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student();
		a.name="Sammy";
		a.age=10;
		a.print();
		
		Student b = new Student();
		b.name="Hobkins";
		b.age=12;
		b.print();
		
		Student c = new Student("Ken",13);
		c.print();
		
		//a.school=" Seoul HIGH ";
		
		a.print();
		b.print();
		b.print(10);
		b.print("Robert");
		c.setPhone("010-1234-1234");
		System.out.println(c.getPhone());
		
		System.out.println(a.getAge());
		System.out.println(b.getAge());
		System.out.println(c.getAge());
	}

}
