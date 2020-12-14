
public class Car {
    private String make;
    private String model;
    private int year;
    private int seats;
    private int maxSpeed;
    private int wheels;
    private String type;
    private String transmission;

    //constructors

    //default constructor
    public Car(){
        this.make="";
        this.model="";
        this.year=0;
        this.seats = 0;
        this.maxSpeed=0;
        this.wheels=4;
        this.type="";
        this.transmission="";
    }
    //overload constructor
    public Car(String make, String model,int year, int seats, int maxSpeed,String type,String transmission){
        this();
        this.make=make;
        this.model=model;
        this.year=year;
        this.seats=seats;
        this.maxSpeed=maxSpeed;
        this.type=type;
        this.transmission=transmission;
    }
    //setters

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    //getters


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getYear() {
        return year;
    }

    public int getSeats() {
        return seats;
    }

    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    public String getTransmission() {
        return transmission;
    }

    //prints the car information in the getCars() in TestDealer
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", seats=" + seats +
                ", maxSpeed=" + maxSpeed +
                ", wheels=" + wheels +
                ", type='" + type + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
