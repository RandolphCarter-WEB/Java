import ClassPackage.ExampleC;
import ClassPackage.ExampleP;

public class Main {
    public static void main(String[] args) {
        ExampleP parent = new ExampleP();
        ExampleC child01 = new ExampleC();
        ExampleC child02 = new ExampleC();

        System.out.println("[default print]");
        child01.printPValue();
        child02.printPValue();

        System.out.println("[change child value]");
        child01.setPValue(100, "[child01] changed");
        child02.setPValue(200, "[child02] changed");

        System.out.println("[change to child print]");
        child01.printPValue();
        child02.printPValue();

        System.out.println("[change parent print]");
        parent.setPValue(10, "[parent] changed");

        System.out.println("[change to parent print]");
        child01.printPValue();
        child02.printPValue();

        System.out.println("[make new child]");
        ExampleC child03 = new ExampleC();

        System.out.println("[default print]");
        child03.printPValue();

        System.out.println("[make new child]");
        ExampleC child04 = new ExampleC();
    }
}