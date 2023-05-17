public class Main {
    public int a = 4;
    public int getA() {
        return a;
    }

    public void method01() {
        System.out.println("[OUTPUT] method01 Called.");
    }

    public int method02(int num) {
        System.out.println("[OUTPUT] method02 Called.");
        System.out.println("[OUTPUT] num >> " + num);
        return num;
    }

    public void add(int num, String str) {
        System.out.println("[OUTPUT] num >> " + num + " str >> " + str);
    }

    public void add(String str, int num) {
        System.out.println("[OUTPUT] num >> " + num + " str >> " + str);
    }

    public static void main(String[] args) {
        Main $this = new Main();
        System.out.println("[OUTPUT] num >> " + $this.getA());

        $this.method01();
        int result = $this.method02(4);
        System.out.println("[OUTPUT] result >> " + result);
    }
}