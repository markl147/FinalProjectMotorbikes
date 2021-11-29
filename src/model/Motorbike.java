package model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Motorbike extends UnicastRemoteObject implements MotorbikeInterface {

    private String make;
    private String model;
    private int cc;
    private int topSpeed;
    private String licenseCategory;
    private String type;

    public Motorbike(String make, String model, int cc, int topSpeed, String licenseCategory, String type) throws RemoteException {
        this.make = make;
        this.model = model;
        this.cc = cc;
        this.topSpeed = topSpeed;
        this.licenseCategory = licenseCategory;
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getLicenseCategory() {
        return licenseCategory;
    }

    public void setLicenseCategory(String licenseCategory) {
        this.licenseCategory = licenseCategory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
