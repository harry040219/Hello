
public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.r=5.0;
		double v1 = c1.calVol();
		System.out.println("������"+c1.r+"���Ǹ���"+v1);
		double v2 = c1.calRnd();
		System.out.println("������"+c1.r+"���ǵѷ�"+v2);
		
		Circle c2 = new Circle(8.0);
		v1=c2.calVol();
		System.out.println("������"+c2.r+"���Ǹ���"+v1);
		v2=c2.calRnd();
		System.out.println("������"+c2.r+"���Ǹ���"+v2);
	}

}
