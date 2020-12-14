
public class Oval extends Shape {
    private double hRadius; // Declare the instance variables
    private double vradius;

    /**
     * @param hRadius
     * @param vradius
     */
    public Oval(double hRadius, double vradius) {
        this.setName("Oval");
        this.hRadius = hRadius;
        this.vradius = vradius;
    }

    /**
     * @return the hRadius
     */
    public double gethRadius() {
        return hRadius;
    }

    /**
     * @param hRadius the hRadius to set
     */
    public void sethRadius(double hRadius) {
        this.hRadius = hRadius;
    }

    /**
     * @return the vradius
     */
    public double getVradius() {
        return vradius;
    }

    /**
     * @param vradius the vradius to set
     */
    public void setVradius(double vradius) {
        this.vradius = vradius;
    }

    @Override
    public double area() {
        return (Math.PI * (hRadius * vradius)) / 4;
    }
}
