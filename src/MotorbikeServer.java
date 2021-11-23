import java.rmi.Naming;

public class MotorbikeServer {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("Server has started.....");

        try {
            Motorbike bandit600 = new Motorbike("Suzuki", "Bandit", 600,  134, "A", "Street fighter");
            System.out.println("bandit created....");
            Motorbike vtx1300 = new Motorbike("Honda", "VTX", 1300,  125, "A", "Cruiser");
            System.out.println("vtx created...");

            MotorbikeList ml = new MotorbikeList();
            ml.addToList(bandit600);
            ml.addToList(vtx1300);


            Naming.rebind("listOfMotorbikes", ml);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
