import ClassEx.*;
import java.util.Scanner;

public class ClassEx01 {
    public static void main(String[] args) {
        ClassEx classMap = new ClassEx();

        while (true) {
            System.out.println("1. make Map");
            System.out.println("2. print Map");
            System.out.println("3. change Map");
            System.out.println("4. delete Map");
            System.out.println("5. exit");
            System.out.print("Enter your choice: ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    classMap.makeMap();
                    break;
                case 2:
                    classMap.printMap();
                    break;
                case 3:
                    classMap.changeMap();
                    break;
                case 4:
                    classMap.defaultMap();
                    break;
                case 5:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
