package model;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MotorbikeInterface extends Remote {

    public String getMake() throws RemoteException;

    public String getModel() throws RemoteException;

    public int getCc() throws RemoteException;

    public int getTopSpeed() throws RemoteException;

    public String getLicenseCategory() throws RemoteException;

    public String getType() throws RemoteException;
}
