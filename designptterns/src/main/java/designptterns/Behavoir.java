package designptterns;
import java.util.Date;

public class Behavoir {
	   public static void Message(User user, String message){
		   System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	      
	   }


}
