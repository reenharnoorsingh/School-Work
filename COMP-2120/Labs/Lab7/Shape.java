
public abstract class Shape implements Comparable<Shape> {

    private String name;

    public Shape() {
        this.name = "General Shape";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double area();

    @Override
    public int compareTo(Shape o) {
        if (this.area() < o.area())
            return -1;
        if (this.area() > o.area())
            return 1;
        return 0;

    }

}


