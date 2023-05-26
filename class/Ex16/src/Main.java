import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,7,4,8,3);
        System.out.println(list);

        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6);
        System.out.println(list2);

        System.out.println("Equal >> " + list.retainAll(list2));
        System.out.println("Some Value >> " + list.subList(1, 4));

        list.set(4, 6);
        System.out.println("Some Value >> " + list);

        for(Integer in : list2) {
            System.out.print(in + " ");
        }
        System.out.println();

        for(int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
    }
}