package example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class mainEx01 {
    public static void main(String[] args) {
        Member mm1 = new Member("1", "defaultName", 30);
        System.out.println(mm1.hashCode());

        System.out.println();

        Set<String> set1 = new HashSet<>();
        set1.add("가");
        set1.add("나");
        set1.add("다");
        set1.add("라");
        set1.add("마");
        set1.add("바");
        set1.add("사");

        System.out.println(set1);
        System.out.println(set1.contains("가"));

        set1.forEach(System.out::print);
        System.out.println();

        for (String s : set1) {
            System.out.print(" " + s);
        }
    }
}
