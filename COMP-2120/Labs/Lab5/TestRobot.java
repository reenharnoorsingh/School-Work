import java.awt.*;

public class TestRobot {
    public static void main(String[] args) {
        // Create a new Robot object with the initial position of (5,5) and
        // initial direction to the East (1).
        Robot r1 = new Robot(new Point(5, 5), 1);
        r1.move(); // 6, 5, 1
        r1.turnRight(); // 6, 5, 2
        r1.move(); // 6, 6, 2
        r1.move(); // 6, 7, 2
        r1.turnRight(); // 6, 7, 3
        r1.move(); // 5, 7, 3
        r1.move(); // 4, 7, 3
        r1.turnLeft(); // 4, 7, 2
        r1.move(); // 4, 8, 2
        Point location = r1.getLocation();
        System.out.println("Location: " + location.x + ", " + location.y);
        System.out.println("Expected: 4, 8");
        System.out.println("Direction: " + r1.getDirection());
        System.out.println("Expected: S");
        for (String i: r1.getMovements())
            System.out.println(i);
    }
}
