
public class Day04_스트링 {

   public static void main(String[] args) {
      
      String a= "robot";
       String b= "rboot";
       
       if(a==b)
          System.out.println("주소가 같다");
       else
          System.out.println("주소가 다르다");
       if(a.equals(b))
          System.out.println("값이 같다.");
       else
          System.out.println("값이 다르다");
       
       
       
       
       System.out.println("===================");
       String c = new String("robot");
       if(a==c)
      System.out.println("주소가 같다");
       else
          System.out.println("주소가 다르다");
       if(a.equals(c))
          System.out.println("값이 같다.");
       else
          System.out.println("값이 다르다");
      

   }

}