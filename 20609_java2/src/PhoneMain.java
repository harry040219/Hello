
public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Phone a = new Phone(" S21 ",200,"Samsung");
			System.out.println(a.toPrint());
			Phone b = new Phone(" V50 ",85,"LG");
			System.out.println(b.toPrint());
			b.printTotal();
	}

}
