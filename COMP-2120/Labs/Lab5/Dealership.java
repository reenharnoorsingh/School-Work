
import java.util.ArrayList;

public class Dealership {
    private String name;
    private String location;
    ArrayList<String> managers = new ArrayList<>();
    ArrayList<String> employees = new ArrayList<>();
    ArrayList<Car> cars = new ArrayList<>();

    // Constructors

    public Dealership(){
        this.name="";
        this.location="";
    }
    public Dealership(String name, String location) {
        this.name = name;
        this.location = location;
    }

    //setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public void setManagers(ArrayList<String> managers)
    {
        this.managers = managers;
    }

    public void setEmployees(ArrayList<String> employees)
    {
        this.employees = employees;
    }

    public void setCars(ArrayList<Car> cars)
    {
        this.cars = cars;
    }

    //getters
    public String getName()
    {
        return name;
    }

    public String getLocation()
    {
        return location;
    }

    public ArrayList<String> getManagers()
    {
        return managers;
    }

    public ArrayList<String> getEmployees()
    {
        return employees;
    }

    public ArrayList<Car> getCars()
    {
        return cars;
    }

    //adding methods
    public void addCar(Car c)
    {
        this.cars.add(c);
    }

    public void addEmployee(String employee)
    {
        this.employees.add(employee);
    }

    public void addManager(String manager)
    {
        this.managers.add(manager);
    }

}
