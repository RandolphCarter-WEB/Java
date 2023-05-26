package ExClass;

public class sender {
    public sender() {
        sender sd = new sender();
        Example01 ex = sd.sendBox();
        System.out.println(ex);
    }
    public Example01 sendBox() {
        Example01 ex01 = new Example01();
        ex01.setI(11);

        return ex01;
    }
}
