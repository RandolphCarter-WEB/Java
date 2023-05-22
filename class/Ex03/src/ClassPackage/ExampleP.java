package ClassPackage;

public class ExampleP extends ExampleGP {
    public int numP = 1;
    public String strP = "parent";

    public ExampleP() {
         System.out.println("[SYSTEM] ExampleP is load.");
    }

    public final void setPValue(int num, String str) {
        this.numP = num;
        this.strP = str;
    }

    public void printPValue() {
        System.out.println("[OUTPUT] num >> " + numP);
        System.out.println("[OUTPUT] str >> " + strP);
    }
}
