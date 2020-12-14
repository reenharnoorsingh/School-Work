
public class Pair<T, S> {
    private T first;
    private S second;

    // constructors
    public Pair() {
    }

    public Pair(T first, S second) {
        setFirst(first);
        setSecond(second);
    }

    // getter and setter methods
    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    // override toString() method
    public String toString() {
        String s = this.first.toString() + " => " + this.second.toString();
        return s;
    }

    // override equals() method
    public boolean equals(Pair p) {
        if (this == p) {
            return true;
        } else return this.first.equals(p.first) && this.second.equals(p.second);
    }
}
