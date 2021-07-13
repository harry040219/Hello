
public class ShoppingMallMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingMall s1 = new ShoppingMall("Sugar");
		s1.addTotal(10);
		s1.subTotal(5);
		s1.printCode();
		
		ShoppingMall s2 = new ShoppingMall("Ramen");
		s2.addTotal(20);
		
		HomeShopping s3 = new HomeShopping("Bag");
		s3.setTime("10:30");
		System.out.println(s3.code + " 방송시간은 " + s3.getTime()+" 입니다.");
		

	}

}
