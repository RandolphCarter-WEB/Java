import ClassPackage.Example01;
import ClassPackage.Example02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Example01 ex = new Example01();
//        System.out.println(ex.numpublic);
//        System.out.println(ex.numprotected);
//        System.out.println(ex.numprivate);
//        System.out.println(ex.numstatic);

        Example02 ex2 = new Example02();
        ex2.setI(20);
        System.out.println(ex2.getI());
    }
}