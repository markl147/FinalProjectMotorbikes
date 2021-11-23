import java.rmi.Naming;
import java.util.ArrayList;

public class MotorbikeCient {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String url = "rmi:///"; //no IP address, this is local.

        try {

            MotorbikeListInterface motorbikeList = (MotorbikeListInterface) Naming.lookup("listOfMotorbikes");

            ArrayList<Motorbike> actualMotorbikeList = motorbikeList.getList();

            for (MotorbikeInterface m : actualMotorbikeList) {
                System.out.println(m.getType());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
