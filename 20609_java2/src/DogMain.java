
public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog a = new Dog("Çªµé",2,"ÆÄ¶û");
		Dog b = new Dog("ºÒµ¶",5,"°ËÁ¤");
		a.barking();
		a.sleeping();
		b.hungry();
		b.sleeping();
		
		String str=b.toPrint();
		System.out.println(str);
		System.out.println(a.toPrint());
	}
}
