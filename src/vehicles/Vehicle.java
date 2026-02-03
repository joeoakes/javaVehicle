package vehicles;

import java.util.Date;

public abstract class Vehicle {

    // Class Variables
    private String vin;
    private String name;
    private Date built;
    private Drivetrain trans;
    private Wheeldrive wheeldrive;

    // Getters / Setters
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBuiltDate() {
        return built;
    }

    public void setBuiltDate(Date built) {
        this.built = built;
    }

    public Drivetrain getDrivetrain() {
        return trans;
    }

    public void setDrivetrain(Drivetrain trans) {
        this.trans = trans;
    }

    public Wheeldrive getWheeldrive() {
        return wheeldrive;
    }

    public void setWheeldrive(Wheeldrive wheeldrive) {
        this.wheeldrive = wheeldrive;
    }

    // Abstract behavior
    public abstract void move();
}

