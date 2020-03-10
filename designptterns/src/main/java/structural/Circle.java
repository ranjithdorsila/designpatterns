package structural;

public class Circle extends Shape {
	   private int x, y, r;

	  


	   public Circle(int x, int y, int r, Draw draw) {
		      super(draw);
		      this.x = x;  
		      this.y = y;  
		      this.r = r;
		   }


	public void draw() {
	      draw.drawCircle(r,x,y);
	   }

}