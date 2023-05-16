//import java.util.Scanner;

public class IfWhileFor {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a number: ");
//        int a = scanner.nextInt();
//
//        if(a > 90) {
//            System.out.println("Your Score >> A");
//        } else if (a > 80) {
//            System.out.println("Your Score >> B");
//        } else if (a > 70) {
//            System.out.println("Your Score >> C");
//        } else if (a > 60) {
//            System.out.println("Your Score >> D");
//        } else { System.out.println("Your Score >> F"); }

//        int b = 3;
//        switch (b) {
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//            case 4:
//                System.out.println("4");
//                break;
//            case 5:
//                System.out.println("5");
//                break;
//            default:
//                System.out.println("default");
//                break;
//        }

        int i1 = 0;
        do {
            System.out.println("num >> " + (i1++));
        } while (i1 < 3);

        for (int i = 0; i < 5; i++) {
            System.out.println("num >> " +i);
        }
    }
}