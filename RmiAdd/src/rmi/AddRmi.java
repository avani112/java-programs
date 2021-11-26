package rmi;
import java.rmi.*;
public interface AddRmi extends Remote {
	public int addNum(int a, int b) throws RemoteException;
}
