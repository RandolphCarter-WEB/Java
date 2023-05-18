import Example01.bean01;

 class Main {
    public static void main(String[] args) {
        bean01 bean01 = new bean01();
        System.out.println("[BEAN_OUTPUT] >> " + bean01.getStr());
        System.out.println("[BEAN_OUTPUT] >> " + bean01.getNum());
        
        bean01 bean02 = new bean01(0, "default");
        System.out.println("[BEAN_OUTPUT] >> " + bean02.getStr());
        System.out.println("[BEAN_OUTPUT] >> " + bean02.getNum());

        bean02.setStr("hello");
        bean02.setNum(1);
        System.out.println("[BEAN_OUTPUT] >> " + bean02.getStr());
        System.out.println("[BEAN_OUTPUT] >> " + bean02.getNum());

        bean02.method01();
    }
}