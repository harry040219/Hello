
public class Car {
	Car(String color, String name, int velocity){
		this.color=color;
		this.name=name;
		this.velocity=velocity;
	}
	Car(){}

	String color;
	String name;
	int velocity;
	
	void speedUp() {
		System.out.println(name+"Speed Up");
	}
	void speedDown() {
		System.out.println(name+"Speed Down");
	}
	void print() {
		System.out.println("[Car]");
	}

}
