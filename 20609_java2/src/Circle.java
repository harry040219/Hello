
public class Circle {
	Circle(){}
	Circle(double d){
		this.r=d;
	}
	
	double r;
	
	double calVol(double r) {
		return r*r*3.14;
	}
	
	double calRnd(double r) {
		return 2*r*3.14;
	}
}
