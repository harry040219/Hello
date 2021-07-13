
public class Item {
	
	private int price,count;
	private String name,no;
	private static final String COMPANY="놀러와 회사";
	private static int itemCnt=0;
	
	Item(){
		itemCnt++;
	}
	Item(String no , String name){
		this();
		this.no =no ;
		this.name = name;
	}
	Item(String no , String name, int price, int count){
		this(no,name);
		this.price = price;
		this.count = count;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getItemCnt() {
		return itemCnt;
	}
	public static void setItemCnt(int itemCnt) {
		Item.itemCnt = itemCnt;
	}
	public static String getCompany() {
		return COMPANY;
	}
	
	void inStore(int num){
		System.out.println(name+num);
		count+=num;
	}
	void outStore(int count) {
		if( count > this.count) {
			System.out.println( count + "출고실패 :" + name + "의 현재재고" + this.count);
		}else {
			System.out.println("출고: " + this.name + "," + count + "개");
			this.count -= count;
		}
	}
	
	void toPrint() {
		System.out.println("상품코드:" + no + " 상품명:" + name + " 가격:" + price + " 재고:" + count);
	}
	
}
