
public class Day08_메소드오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc obj = new calc();
		System.out.println(obj.sum(5, 8));
		System.out.println(obj.sum("robot","high"));
	}

}

class calc{
	int sum(int a,int b) {
		return a+b;
	}
	
	String sum(String a, String b) {
		return a+b;
	}
}