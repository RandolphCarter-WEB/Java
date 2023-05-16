import java.util.Random;

public class RandomValue {
    public static void main(String[] args) {
        double d1 = Math.floor((Math.random() * 5) + 1);
        System.out.println(d1);

        Random rand = new Random();
        System.out.println(rand.nextInt(100));
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextInt(5));
        System.out.println(rand.nextBoolean());
    }
}
