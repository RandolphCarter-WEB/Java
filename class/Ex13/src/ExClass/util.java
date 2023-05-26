package ExClass;

public class util {
    public <T> Example01<T> getEx(T t) {
        Example01<T> ex01 = new Example01<>();
        ex01.setI(t);
        return ex01;
    }
}
