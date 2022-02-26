package week2;

public class TwoWheeler {
private String name;
    public int cadence;
    public int gear;
    public int speed;

    public TwoWheeler(String name){
        this.name=name;
        System.out.println(name);
    }

    public TwoWheeler(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public static void main(String args[]){
        TwoWheeler tw = new TwoWheeler("Tvs");
        TwoWheeler bajaj = new TwoWheeler("bajaj");
    }
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void setCompanyName(String newValue) {
        name = newValue;
    }

    public String getCompanyName() {
        if(!name.isEmpty()) {
            return name;
        }
        return "No company Name defined";
    }
}
