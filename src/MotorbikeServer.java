import java.io.*;
import java.rmi.Naming;
import java.util.ArrayList;

public class MotorbikeServer {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO Auto-generated method stub

        MotorbikeList ml = new MotorbikeList();
        System.out.println("Server has started.....");

        try {
            //Deserializing
            FileInputStream fileIn = new FileInputStream("allMotorbike.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            MotorbikeListInterface newMotorbike = (MotorbikeListInterface) objectIn.readObject();
         //   ArrayList<Motorbike> ml2 = newMotorbike.getList();
            //send newMotorbike.getList() over rmi

            objectIn.close();

            //System.out.println(.get(0).getMake() + " " + newMotorbike.getModel());

            Naming.rebind("listOfMotorbikes", newMotorbike);

        }catch (FileNotFoundException e){
            System.out.println("Sorry file is not available... will create one!");
            Motorbike m1 = new Motorbike("Suzuki", "Bandit", 600,  134, "A", "Street fighter");
            System.out.println("bandit created....");
            Motorbike m2 = new Motorbike("Honda", "VTX", 1300,  125, "A", "Cruiser");
            System.out.println("vtx created...");

            //Serializing
            ml.addToList(m1);
            ml.addToList(m2);
            FileOutputStream fileOut = new FileOutputStream("allMotorbike.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(ml);

            objectOut.close();
            Naming.rebind("listOfMotorbikes", ml);



            //e.printStackTrace();
        }
    }
}
