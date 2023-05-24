package packageEx02;

public class Service {
    @printAnnotation
    public void method01() {
        System.out.println("[Method01] Run");
        System.out.println("[Method01] Logic");
        System.out.println("[Method01] Exit");
    }

    @printAnnotation("*")
    public void method02() {
        System.out.println("[Method02] Run");
        System.out.println("[Method02] Logic");
        System.out.println("[Method02] Exit");
    }

    @printAnnotation(value="#", number=10)
    public void method03() {
        System.out.println("[Method03] Run");
        System.out.println("[Method03] Logic");
        System.out.println("[Method03] Exit");
    }
}
