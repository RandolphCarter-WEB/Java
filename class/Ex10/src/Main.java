import packageEx01.Product;
import packageEx01.ProductImpl01;
import packageEx01.ProductImpl02;

import java.util.Random;

public class Main {
    private Product $pd;

    public Main() {
        Random rand = new Random();
        setPd(rand.nextBoolean()? new ProductImpl01() : new ProductImpl02());

        $pd.method01();
        $pd.method02();
    }

    public void setPd(Product pd) {
        this.$pd = pd;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        new Main();
    }
}