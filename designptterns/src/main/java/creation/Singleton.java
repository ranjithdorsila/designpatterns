package creation;

public class Singleton {

	private static Singleton  obj=new Singleton();  
	 private Singleton(){}  
	   
	 public static Singleton getA(){  
	  return obj;  
	 }  
	  
	 public void method(){  
	 System.out.println("sample method"); 
	 }
	 
	 
	 
	 public static void main(String args[])
	 {
		 Singleton obj1=Singleton.getA();
	 	obj1.method();
	 }
}
