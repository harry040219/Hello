
public class Student {

		//»ý¼ºÀÚ
		Student(String name,int hakbun, int age){
			this.name=name;
			this.age=age;
			this.hakbun=hakbun;
		}
	
		//member var
		private String name;
		private int age, hakbun;
				
		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public int getAge() {
			return age;
		}



		public void setAge(int age) {
			this.age = age;
		}



		public int getHakbun() {
			return hakbun;
		}



		public void setHakbun(int hakbun) {
			this.hakbun = hakbun;
		}



		//method
		void toPrint() {
			System.out.println("Name:"+name+"Hakbun:"+hakbun+"Age:"+age);

		}
					
}
