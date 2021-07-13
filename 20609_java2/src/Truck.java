
public class Truck extends Car {
	Truck(String color, String name, int velocity){
		super(color,name,velocity);
	}
	int ton=3;
	void print() {
		System.out.println(name+" "+ton);
	}
}
