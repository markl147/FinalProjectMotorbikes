package model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class MotorbikeList extends UnicastRemoteObject implements MotorbikeListInterface {

    private ArrayList<Motorbike> motorbikes;

    public MotorbikeList() throws RemoteException {
        motorbikes = new ArrayList();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void addToList(Motorbike m) throws RemoteException {
        motorbikes.add(m);
    }

    @Override
    public ArrayList<Motorbike> getList() throws RemoteException {
        // TODO Auto-generated method stub
        return motorbikes;
    }
}
