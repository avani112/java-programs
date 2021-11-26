import java.rmi.*;
public interface AdditionInterface extends Remote {
	public int addNum(int a, int b) throws RemoteException;
}

