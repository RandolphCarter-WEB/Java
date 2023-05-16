public class valueInt {
    public static void main(String[] args) {
        byte b1 = 3;
        byte b2 = 4;
        byte b3 = (byte)(b1 + b2);

        int c = 3;

        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b1);

        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

        System.out.println(--c);
        System.out.println(c--);
        System.out.println(c);

        int d = 4;
        d += 2;
        System.out.println(d);

        int e = 3;
        int f = 4;

        System.out.println(e > f);
        System.out.println(e >= f);
        System.out.println(e < f);
        System.out.println(e <= f);
        System.out.println(e == f);
        System.out.println(e != f);

        long g = 3;
        System.out.println(f == g);

        int h = 3;
        String result = h > 4 ? "h is bigger then 4" : "h is smaller then 4";
        System.out.println(result);
    }
}