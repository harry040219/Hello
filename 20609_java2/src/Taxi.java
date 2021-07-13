
public class Taxi extends Car {
	int pay=3000;
	
	void payUp() {
		pay+=100;
		System.out.println("current price : "+pay);
		}
		void print() {
			System.out.println(name+" "+color);
		}
	}
