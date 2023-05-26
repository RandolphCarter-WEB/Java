import Example.Pair;
import Example.Util;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "apple");
        Pair<Integer, String> pair2 = new Pair<>(2, "%OH");

//        boolean result1 = Util.<Integer, String>compare(pair1, pair2);
        if(Util.compare1(pair1, pair2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        Pair<Double, String> p1 = new Pair<>(1.3, "apple");
        Pair<Double, String> p2 = new Pair<>(1.8, "apple");

        if(Util.compare1(p1, p2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}