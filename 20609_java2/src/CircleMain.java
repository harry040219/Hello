
public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.r=5.0;
		double v1 = c1.calVol();
		System.out.println("반지름"+c1.r+"원의면적"+v1);
		double v2 = c1.calRnd();
		System.out.println("반지름"+c1.r+"원의둘레"+v2);
		
		Circle c2 = new Circle(8.0);
		v1=c2.calVol();
		System.out.println("반지름"+c2.r+"원의면적"+v1);
		v2=c2.calRnd();
		System.out.println("반지름"+c2.r+"원의면적"+v2);
	}

}
