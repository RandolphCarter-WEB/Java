package class01;
public class classEx01 {
    public int num = 10;
    public String str = "hello";

    public int numStatic = 10;
    public String strStatic = "hello";

    public void printValue() {
        System.out.println(num);
        System.out.println(str);
    }

    public void printValueStatic(int numInput,String strInput) {
        System.out.println(numInput);
        System.out.println(strInput);
    }
}
