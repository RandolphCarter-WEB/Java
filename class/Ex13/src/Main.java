import ExClass.Example01;
import ExClass.product01;

public class Main {
    public static void main(String[] args) {
        Example01<Integer> ex01 = new Example01<Integer>();
        ex01.setI(10);
        System.out.println(ex01.getI());

        Example01<String> ex02 = new Example01<String>();
        ex02.setI("abc");
        System.out.println(ex02.getI());

        product01<String, Integer> pd1 = new product01<>();
        pd1.setT("abc");
        pd1.setM(10);

        System.out.println("Product T >> " + pd1.getT());
        System.out.println("Product M >> " + pd1.getM());
    }
}