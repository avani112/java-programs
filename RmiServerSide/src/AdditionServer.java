import java.rmi.*;   
public class AdditionServer {
    	   public static void main (String args[]) {
    		   try {
    			   Addition Hello = new Addition();			   		   
    			   Naming.rebind("rmi://localhost/ABC", Hello);
    			   System.out.println("hello avani..");
    			   System.out.println("Addition Server is ready.");
    			   }catch (Exception e) {
    				   System.out.println("Addition Server failed: " + e);
    				}
    		   }
    }