package structural;

public class Bridge {
	
	 public static void main(String[] args) {
	     
	      Shape circle = new Circle(10,10, 10, new RedCircle());
	     circle.draw();
	   }

}
