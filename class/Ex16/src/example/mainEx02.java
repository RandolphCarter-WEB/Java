package example;

import java.util.HashMap;
import java.util.Map;

public class mainEx02 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "aaa");
        map1.put(2, "bbb");
        map1.put(3, "ccc");

        System.out.println(map1);

        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1.entrySet());

        for(Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println(entry);
        }

        System.out.println(map1.get(2));
        System.out.println(map1.remove(1));
        System.out.println(map1);
    }
}
