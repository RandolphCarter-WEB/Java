package Example;

import java.util.Objects;

public class Util {
    public static <K, V> boolean compare1(Pair<K, V> p1, Pair<K,V> p2) {
//        boolean keyResult = p1.getKey().equals(p2.getKey());
//        boolean valueResult = p1.getValue().equals(p2.getValue());
//        return keyResult && valueResult;

        return (p1.getKey()).equals(p2.getKey()) && (p1.getValue()).equals(p2.getValue());
    }

    public static <K extends Number,V> boolean compare2(Pair<K, V> p1, Pair<K, V> p2) {
        return (Objects.equals(p1.getKey(), p2.getKey()) && (p1.getValue()).equals(p2.getValue()));
    }
}
