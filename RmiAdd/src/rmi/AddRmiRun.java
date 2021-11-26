package rmi;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class AddRmiRun extends UnicastRemoteObject implements  AddRmi{
	private static final long serialVersionUID = 1L;
	public AddRmiRun() throws RemoteException{}
	public int addNum(int a, int b) {
		return(a+b);
	}
}
