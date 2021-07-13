public class Phone {
	
	Phone(String model, int price, String comp){
		total++;
		this.comp=comp;
		this.model = model;
		this.price=price;
	}
	
	String model;
	int price;
	static int total;
	String comp;
	
	String toPrint() {
		return comp+model+price+"¸¸¿ø";
	}
	
	void printTotal() {
		System.out.println(total+"°³");
	}

}
