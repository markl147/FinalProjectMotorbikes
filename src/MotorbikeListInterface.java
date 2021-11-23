import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface MotorbikeListInterface extends Remote {

    public void addToList(Motorbike m) throws RemoteException;

    public ArrayList<Motorbike> getList() throws RemoteException;
}
