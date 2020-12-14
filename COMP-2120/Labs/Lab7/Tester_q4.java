
public class Tester_q4 {
    public static void main(String[] args) {
        //creating the shapes
        Circle c = new Circle(2.0);
        Oval o = new Oval(2.0, 2.0);
        Square s = new Square(4.0);
        Triangle t = new Triangle(2.0, 2.0);
        //printing the areas of all shapes for reference
        System.out.println("Area of Circle: " + String.valueOf(c.area()));
        System.out.println("Area of Oval: " + String.valueOf(o.area()));
        System.out.println("Area of Square: " + String.valueOf(s.area()));
        System.out.println("Area of Triangle: " + String.valueOf(t.area()));

        //testing code
        //assertion will be thrown when any values are not matched
        assert c.compareTo(o) == 1 : "Incorrect comparision! Circle is larger than oval!";
        assert o.compareTo(c) == -1 : "Incorrect comparision! Circle is larger than oval!";
        assert c.compareTo(c) == 0 : "Incorrect comparision! Circles are equal in area!";
        assert o.compareTo(s) == -1 : "Incorrect comparision! Square is larger than oval!";
        assert c.compareTo(s) == -1 : "Incorrect comparision! Square is larger than circle!";
        assert s.compareTo(t) == 1 : "Incorrect comparision! Square is larger than triangle!";
        assert o.compareTo(t) == 1 : "Incorrect comparision! oval is larger than Triangle!";
        System.out.println("All Assertions Complete!");
    }
}
