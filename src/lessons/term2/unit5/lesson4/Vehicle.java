package lessons.term2.unit5.lesson4;

public class Vehicle {
    private int location;

    public Vehicle() {
        this(0);
    }

    public Vehicle(int loc) {
        if (loc < -20 || loc > 20) {
            location = 0;
        } else {
            location = loc;
        }
    }

    public void forward() {
        if (location < 20) {
            location++;
        }
    }

    public void backward() {
        if (location > -20) {
            location--;
        }
    }

    public int getLocation() {
        return location;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < location + 20; i++) {
            s += " ";
        }
        return s + "@";
    }
}
