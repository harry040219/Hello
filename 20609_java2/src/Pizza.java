
public class Pizza {
	private int size;
	private String type;
	private static int cnt=0;
	Pizza(){
		cnt++;
	}
	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		Pizza.cnt = cnt;
	}
	Pizza(String type){
		this();
		this.type=type;
	}
	Pizza(int size, String type){
		this(type);
		this.size=size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	void toPrint() {
		System.out.println("종류:"+type+" 크기:"+size);
	}
	
}
