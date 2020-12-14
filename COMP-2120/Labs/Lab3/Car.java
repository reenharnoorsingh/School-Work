public class Car {
    private String make;
    private String model;
    private int year;
    private double price;
    private int speed;
    private int maxSpeed;
    private boolean isOn;
    private boolean isMoving;


    //Constructors
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.speed = 0;
        this.maxSpeed = 230;
        this.isOn = false;
        this.isMoving = false;

    }

    public Car(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.year = 2020;//current year
        this.price = price;
        this.speed = 0;
        this.maxSpeed = 230;
        this.isOn = false;
        this.isMoving = false;

    }

    //Accessor and Mutator methods
    public String getMake() { //returns the make(company)
        return make;
    }
    public void setMake(String make) { //sets the make
        this.make = make;
    }
    public String getModel() { //returns the model
        return model;
    }

    public void setModel(String model) { // sets model
        this.model = model;
    }

    public int getYear() { //returns the year of the car
        return year;
    }

    public void setYear(int year) { //sets the value for year
        this.year = year;
    }

    public double getPrice() { //returns the car price
        return price;
    }

    public void setPrice(double price) {// sets the car price
        this.price = price;
    }

    public int getSpeed() {//returns the current speed
        return speed;
    }

    public void setSpeed(int speed) {//sets the starting speed
        this.speed = speed;
    }

    public int getMaxSpeed() {//returns maximum speed of the car
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {//sets the maximum speed
        this.maxSpeed = maxSpeed;
    }

    public boolean isOn() {//returns a boolean value if the car is on or not
        return isOn;
    }

    public boolean isMoving() {//returns a boolean value if the car is moving or not
        return isMoving;
    }

    public void turnOn() {// isOn=true
        this.isOn = true;
    }

    public void turnOff() {//isOn =false
        this.isOn = false;
    }

    public void stop() {//isMoving = false and speed set to 0
        setSpeed(0);
        this.isMoving = false;
    }
    public void accelerate() {
        if (isOn) {
            isMoving = true;
            if (speed < maxSpeed) {
                System.out.println("Accelerating.....");
                speed += 5;//Increasing speed by 5
            }
        }
    }
    public void decelerate() {
        if (isOn && isMoving) {
            if (speed > 0) {
                System.out.println("Declerating.....");
                speed -= 5;//Decreasing speed by  5
            }
        }
    }

    // Gas Efficiency part
    private int gasEfficiency;
    private int gasLevel;

    public Car(int mileage) {
        this.gasEfficiency = mileage;
        this.gasLevel = 0;
    }
    public void addGas(int gas) {
        this.gasLevel += gas;
    }
    public void drive(int milesDrive) {
        while (milesDrive > 0 && gasLevel>0) {
            System.out.println("Gas level :"+gasLevel);
            milesDrive -= gasEfficiency;
            if (gasLevel > 0)
                this.gasLevel--;
        }
    }
    public int getGasInTank() {
        return gasLevel;
    }
    public int getMilesToGo() {
        int miles = 0;
        for (int i = 1; i <= gasLevel; i++) {
            miles += gasEfficiency;
        }
        return miles;
    }

}