
public class Day08_CatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat();
		cat1.name="may";
		cat1.age=2;
		cat1.print();
	
		Cat cat2=new Cat("Sam",4);
		cat2.print();
		cat2.printCount();
		
		cat2.print("Tammy");
	}

}
