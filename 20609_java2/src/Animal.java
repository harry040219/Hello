//동물 클래스 -부모
public class Animal {
	
	String species; //종
	String name="동물"; 	//이름
	int age;		//나이
	int num;
	
	//기본형 생성자
	Animal(){}
	
	Animal(String name){
		System.out.println("Animal 기본생성자");
	}
	
	Animal(String name, int age){
		System.out.println("Animal 기본생성자");
	}
	
	void toPrint() {
		System.out.println(name);
	}

}
