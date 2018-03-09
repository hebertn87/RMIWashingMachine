package remoteInterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface WashingMachineRemote extends Remote {
	String sayHello() throws RemoteException;
}
