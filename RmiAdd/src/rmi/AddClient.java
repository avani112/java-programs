package rmi;
import java.rmi.*;
public class AddClient {
	public static void main(String args[]) {
		try {
			String addServer="rmi://localhost/AddServer";
			AddRmi addclient = (AddRmi)Naming.lookup(addServer);
			System.out.println("sum :"+addclient.addNum(2,8));
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
