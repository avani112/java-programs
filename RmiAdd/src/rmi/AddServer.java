package rmi;
import java.net.*;
import java.rmi.*;

public class AddServer {

	public static void main(String[] args) {
		try {
			System.setProperty("java.rmi.server.hostname", "192.168.0.7");
			AddRmiRun add = new AddRmiRun();
			Naming.rebind("AddServer",add);
			System.out.println("object registered");
		}
		catch(RemoteException re) {
			re.printStackTrace();
			System.out.println(re);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
