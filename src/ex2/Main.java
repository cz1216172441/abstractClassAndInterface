package ex2;

public class Main {

    public static void main(String[] args) {
        Transportation[] ways = {
                new Car(500, "car"),
                new Bus(300, "bus"),
                new Train(400, "train"),
                new Plane(1000, "plane")
        };
        int budget = 500;
        String output = "Xiaoming can choose：%s.\n";
        for (Transportation transportation : ways) {
            if (transportation.canRide(budget)) {
                System.out.printf(output, transportation.getName());
            }
        }
    }

}
