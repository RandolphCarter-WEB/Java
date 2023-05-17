import class01.classEx01;

public class Main {
    public static void main(String[] args) {
        classEx01 Ex01 = new classEx01();

        Ex01.printValue();
        Ex01.printValueStatic(Ex01.num, Ex01.str);
        System.out.println(Ex01.numStatic);
        System.out.println(Ex01.strStatic);

        Ex01.strStatic = "Change";
        System.out.println(Ex01.strStatic);
    }
}