
public class TaxiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi t1 = new Taxi();
		t1.name="kakao taxi";
		t1.color="red";
		t1.velocity=50;
		
		t1.speedUp();
		t1.payUp();
		t1.payUp();
		t1.print();
		
		Truck t2 = new Truck("Blue", "Potter", 90);
		t2.print();
	}

}
