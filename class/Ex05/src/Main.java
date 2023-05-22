import ClassPackage.LinearDriver;
import ClassPackage.crossDriver;
import ClassPackage.driver;

public class Main {
    public static void main(String[] args) {
        crossDriver cd = new crossDriver();
        cd.grepDriver();
        cd.screwDriver();

        LinearDriver ld = new LinearDriver();
        ld.grepDriver();
        ld.screwDriver();

        driver ld01 = new LinearDriver();
        driver cd01 = new crossDriver();

        ld01.grepDriver();
        cd01.grepDriver();

        ld01.screwDriver();
        cd01.screwDriver();
    }
}