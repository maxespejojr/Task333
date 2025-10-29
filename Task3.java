public class Task3{
	
	   public static void main(String[] args) {
	
	    String a = new String("Wow");
	    String b = a;
	    String c = "Wow!";
	    String d = "Wow!";
	
	    boolean b1 = a == b;             // true 
        boolean b2 = d.equals(b + "!");  // true 
	    boolean b3 = !c.equals(a);       // true 
	
	    if (b1 && b2 && b3) {
	        System.out.println("Success");
	    }
	}
	      
	  }
    






