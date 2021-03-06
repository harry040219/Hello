public class ItemMain {

	public static void main(String[] args) {
		
		System.out.println(Item.getCompany() + "에 오신것을 환영합니다!!!!!!" );
		System.out.println("우리회사 현재 상품 개수 :" + Item.getItemCnt());
		
		Item item1 = new Item();
		item1.setNo("100");
		item1.setName("연필");
		item1.setPrice(6000);
		item1.setCount(5);
		
		Item item2 = new Item("101", "노트");
		item2.setPrice(1000);
		item2.setCount(4);

		Item item3 = new Item("102", "지우개",500, 5);
		System.out.println("========"+  Item.getCompany()    +"==============");
		item1.toPrint();
		item2.toPrint();
		item3.toPrint();
		
		System.out.println("우리회사 현재 상품 개수 :" + Item.getItemCnt());
		System.out.println("======================");
		item1.inStore(10);			//item1은 연필 객체, 연필 10개 입고
		item2.inStore(20);
		item2.outStore(5);          //item2는 노트 객체, 노트 5개 출고 
		item3.inStore(20);           
		item3.outStore(30);
		System.out.println("======================");
		item1.toPrint();
		item2.toPrint();
		item3.toPrint();
		
	}

}