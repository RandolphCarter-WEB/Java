package Example;

public interface InterClass02 {
    public void Method01();

    default void Method02() {
        System.out.println("This is default method");
    }
}
