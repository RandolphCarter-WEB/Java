package Example01;

public class bean01 {
    private int num;
    private String str;
    public bean01() {
        this(-1, "-");
        System.out.println("[SYSTEM] bean Class make.");
    }
    public bean01(int num, String str) {
        super();
        this.num = num;
        this.str = str;
    }

    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public void method01() {
        System.out.println("[SYSTEM] bean Class method01.");
        this.method02();
    }
    public void method02() {
        System.out.println("[SYSTEM] bean Class method02.");
    }
}
