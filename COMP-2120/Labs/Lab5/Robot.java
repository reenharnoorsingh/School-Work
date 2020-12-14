
import java.awt.*;
import java.util.ArrayList;

public class Robot {
    //instance variables
    private int direction;
    private Point location;
    private ArrayList<String> movementHistory;

    //constructor
    public Robot(Point location, int direction){
        this.location=location;
        if(direction>=0 && direction<=3)//validating direction
            this.direction=direction;
        movementHistory = new ArrayList<String>();
        movementHistory.add(String.format("(%d,%d), %s", location.x, location.y, getDirection()));//records initial history
    }

    //methods
    public void turnLeft(){ // supposed to change direction
        direction--;
        //wrapping around
        if(direction<0)
            direction=3;

        movementHistory.add(String.format("(%d,%d), %s", location.x, location.y, getDirection()));//records the change in direction
    }
    public void turnRight(){
        direction++;
        //wrapping around
        if(direction>3)
            direction=0;

        movementHistory.add(String.format("(%d,%d), %s", location.x, location.y, getDirection()));//records the change in direction
    }
    public void move(){
        switch (direction){
            case 0:
                location.y--;//north
                break;
            case 1:
                location.x++;//east
                break;
            case 2:
                location.y++;//south
                break;
            case 3:
                location.x--;//west
                break;
        }

        movementHistory.add(String.format("(%d,%d), %s", location.x, location.y, getDirection()));//records the direction
    }

    public Point getLocation() {
        return location;
    }

    public String getDirection() {
        switch (direction){
            case 0:
                return "N";
            case 1:
                return "E";
            case 2:
                return "S";
            default:
                return "W";
        }
    }
    //getter for movement
    public ArrayList<String> getMovements(){
        return movementHistory;
    }
}
