package example02;

import java.util.Scanner;

public class example02 {
    public static void main(String[] args) {
        System.out.println("hello Java World");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input >> " + scanner.nextInt());

        System.out.println("Input >> " + scanner.nextDouble());

        System.out.println("Input >> " + scanner.nextFloat());

        System.out.println("Input >> " + scanner.nextBoolean());

        System.out.println("Input >> " + scanner.next());

        scanner.nextLine();
        System.out.println("Input >> " + scanner.nextLine());

        scanner.close();
    }
}
