package pl.javastart.task;

public class Math {
    boolean isEven(int x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }

    boolean isOdd(int x) {
        if (x % 2 != 0) {
            return true;
        }
        return false;
    }

    double circleField(double r) {
        return 3.14 * r * r;
    }

    int power(int x) {
        return x * x;
    }
}
