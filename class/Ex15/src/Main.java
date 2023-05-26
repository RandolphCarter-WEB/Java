import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arg = new ArrayList<>();

        for(int i = 0; i < 10; i++) arg.add(i);

        System.out.println("List >> " + arg);
        System.out.println("List size >> " + arg.size());

        arg.add(10);
        System.out.println("List >> " + arg);
        System.out.println("List size >> " + arg.size());

        System.out.println();

        Collections.sort(arg);

    }
}