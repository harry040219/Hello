
public class Child extends Father{
	
	Child(String name){
		super(name);
		System.out.println("Child Loaded");
	}
	
	void goSchool() {
		System.out.println(name+" is going to school");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child me = new Child("Sam");
		me.setAge(10);
		
		System.out.println(me.name+" is "+me.getAge()+" years Old");
		me.goSchool();
	}

}
