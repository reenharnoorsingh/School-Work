

public class TestDealer {
    public static void main(String[] args) {
        Car c1 = new Car("Honda","Civic",2020,5,230,"Sedan","Automatic");
        Car c2 = new Car();
        c2.setMake("Honda");
        c2.setModel("Accord");
        c2.setMaxSpeed(300);
        c2.setSeats(5);
        c2.setYear(2020);
        c2.setTransmission("Automatic");
        c2.setType("Sedan");

        Dealership d1 = new Dealership("Honda", "Windsor");
        //adding managers
        d1.addManager("Messi");
        d1.addManager("Virat");
        //adding employees
        d1.addEmployee("Jerry");
        d1.addEmployee("Tom");
        d1.addEmployee("Rick");
        d1.addEmployee("Morty");
        // adding Car to dealership object using addCar() method
        d1.addCar(c1);
        d1.addCar(c2);


        System.out.println("Dealership Information");
        System.out.println("Name: "+d1.getName());
        System.out.println("Location: "+d1.getLocation());
        System.out.println("Managers: "+d1.getManagers());
        System.out.println("Employees: "+d1.getEmployees());
        System.out.println("Cars Available: "+d1.getCars());

    }
}
