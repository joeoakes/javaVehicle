package vehicles;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.setName("Sedan");
        car.setDrivetrain(Drivetrain.AUTOMATIC);
        car.setWheeldrive(Wheeldrive.FWD);
        car.setBuiltDate(new Date());
        car.move();

        Vehicle jeep = new Jeep();
        jeep.setName("Wrangler");
        jeep.setDrivetrain(Drivetrain.MANUAL);
        jeep.setWheeldrive(Wheeldrive.FOUR_WD);
        jeep.move();

        Vehicle truck = new Truck();
        truck.setName("Pickup");
        truck.setDrivetrain(Drivetrain.AUTOMATIC);
        truck.setWheeldrive(Wheeldrive.RWD);
        truck.move();
    }
}
