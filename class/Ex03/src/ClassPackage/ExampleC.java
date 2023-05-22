package ClassPackage;

public class ExampleC extends ExampleP {
    public int numC = 0;
    public String strC = "child";

    public ExampleC() {
        System.out.println("[SYSTEM] ExampleC is load.");
    }

    public void setCValue(int num, String str) {
        this.numC = num;
        this.strC = str;
    }

    public void printCValue() {
        System.out.println("[OUTPUT] num >> " + numC);
        System.out.println("[OUTPUT] str >> " + strC);
    }
}
