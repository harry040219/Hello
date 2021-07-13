
public class ShoppingMall {
	
	ShoppingMall(String code){
		this.code=code;
	}
	
	ShoppingMall(){}
	
	String code;
	static int total=0;
	
	void addTotal(int count) {
		total+=count;
		System.out.println(total);
	}
	void subTotal(int count) {
		total-=count;
		System.out.println(total);
	}
	void printCode() {
		System.out.println(code);
	}
}
