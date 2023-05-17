import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("quiz01");
        for(int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("quiz02");
        for(int i = 0; i <= 5; i++) {
            System.out.print(i);
        }
        System.out.println();

        System.out.println("quiz03");
        for(int i = 1; i <= 3; i++) {
            System.out.print(i);
        }
        System.out.println();

        System.out.println("quiz04");
        for(int i = 5; i <= 7; i++) {
            System.out.print(i);
        }
        System.out.println();

        System.out.println("quiz05");
        for(int i = 3; i > 0; i--) {
            System.out.print(i);
        }
        System.out.println();

        System.out.println("quiz06");
        for(int i = 1; i <= 5; i+=2) {
            System.out.print(i);
        }
        System.out.println();

        System.out.println("quiz07");
        for(int i = 1; i <= 9; i*=2) {
            System.out.print(i);
        }
        System.out.println();

        System.out.println("quiz08");
        System.out.println("ERROR");
        System.out.println();

        System.out.println("quiz09");
        for(int i = 1, j = 1; i <= 5 && j <= 5; i++, j++) {
            System.out.print(i + "" + j);
        }
        System.out.println();

        System.out.println("quiz10");
        for(int i = 5; i != 1; i=(int)Math.floor((Math.random()*4)+1)) {
            System.out.print(i);
        }
        System.out.println();

        System.out.println("quiz11");
        for(int i = 1; i <= 5; i++) {
            System.out.print(i + ") ");
        }
        System.out.println();

        System.out.println("quiz12");
        for(int i = 1; i <= 5; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.println("quiz13");
        for(int i = 1; i <= 5; i++) {
            System.out.print("("+i + ") ");
        }
        System.out.println();

        System.out.println("quiz14");
        for(int i = 1; i <= 5; i++) {
            System.out.print(i);
            if((i+1) != 6) { System.out.print(", "); }
        }
        System.out.println();

        System.out.println("quiz15");
        for(int i = 1; i <= 5; i++) {
            System.out.print(i);
            if((i+1) != 6) { System.out.print("|"); }
        }
        System.out.println();

        System.out.println("quiz16");
        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) { System.out.print("(" + i + ") "); }
        }
        System.out.println();

        System.out.println("quiz17");
        for(int i = 1; i <= 10; i++) {
            if(i % 2 != 0) {
                System.out.print("(" + i);
            } else {
                System.out.print(i +") ");
            }
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("quiz18");
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Between " + a + " and " + b + " is");
        for(int i = a; i <= b; i++) {
            if(i != a && i != b) {
                System.out.print(i);
                if((i+1) != b) { System.out.print(", "); }
            }
        }
        System.out.println();

        System.out.println("quiz19");
        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        System.out.println("Divisor of " + num + " is");
        for(int i = 1; i <= num/2; i++) {
            if(num % i == 0) {
                System.out.print(" (" + i + ") ");
            }
        }
        System.out.println();

        System.out.println("quiz20");
        System.out.print("Enter multiplication table number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter Last number: ");
        int num3 = scanner.nextInt();

        System.out.println("Multiplication table of " + num2 + " (1 ~ " + num3 + ")" +" is");
        for(int i = 1; i <= num3; i++) {
            System.out.println(num2 + " x " + i + " = " + i*num2);
        }
        System.out.println();

        System.out.println("quiz31");
        int n1 = 5;
        for (int i = 0; i < n1; i++) {
            for(int j = 0; j < n1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz32");
        int n2 = 5;
        for (int i = 0; i < n2; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz33");
        int n3 = 5;
        for(int i = n3; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz34");
        int n4 = 5;
        for(int i = n4; i > 0; i--) {
            for(int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            for(int k = i; k <= n4; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz35");
        int n5 = 5;
        for(int i = 0; i < n5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = i; k < n5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz36");
        int n6 = 5;
        for(int i = 0; i < n6; i++) {
            for(int j = 1; j < n6-i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz37");
        int n7 = 5;
        for (int i = 0; i < n2; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n7-1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz38");
        int n8 = 5;
        for(int i = n8; i > 0; i--) {
            for(int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            for(int k = i; k <= n8; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < n8; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for(int k = i; k < n8-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz39");
        int n9 = 5;
        int space = n9 - 1;
        for(int j = 0; j < n9; j++) {
            for(int i = space; i >= 0; i--) {
                System.out.print(" ");
            }
            space--;
            for(int i = 0; i <= j * 2; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        space = 1;
        for(int j = n9 - 1; j > 0; j--) {
            for(int i = 0; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for(int i = j * 2 - 1; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz40");
        int n10 = 5;
        for(int i = 1 ; i <= n10; i++) {
            for(int j = n10 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz41");
        int n11 = 5;
        for(int i = 1; i <= n11; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = n11; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz42");
        int n12 = 5;
        for(int i = 1; i <= n12; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = n12; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1 ; i <= n12; i++) {
            for(int j = n12 - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz43");
        int n13 = 5;
        for(int i = 1; i <= n13; i++) {
            for(int j = n13 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j < i * 2; j++) {
                if(i == 5 || j == 1 || j == (i * 2) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz44");
        int n14 = 5;
        for (int i = 1; i <= n14; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = n14 * 2 - 1; j >= (i * 2) - 1; j--) {
                if (i == 1 || j == n14 * 2 - 1 || j == (i * 2) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("quiz45");
        int n15 = 5;
        for(int i = 1; i <= n15; i++) {
            for(int j = n15 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j < i * 2; j++) {
                if(j == 1 || j == (i * 2) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        n15 -= 1;
        for (int i = 1; i <= n15; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n15 * 2 - 1; j >= (i * 2) - 1; j--) {
                if (j == n15 * 2 - 1 || j == (i * 2) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz46");
        int n16 = 5;
        for(int i = 0; i < n16; i++) {
            int num01 = 1;
            for(int j = 0; j <= i; j++) {
                System.out.print(num01 + " ");
                num01++;
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz47");
        int n17 = 5;
        int num01 = 1;
        for(int i = 0; i < n16; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(num01 + " ");
                num01++;
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz48");
        int n18 = 5;
        for(int i = 1; i <= n18; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz49");
        int n19 = 5;
        for(int i = n19; i > 0; i--) {
            for(int j = n19; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz50");
        int n20 = 5;
        for(int i = 1; i <= n20; i++) {
            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("quiz50");
        int n21 = 5;
        for(int i = 1; i <= n21; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j = i; j <= n21; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(int i = n21; i > 1; i--) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = i - 1; j <= n21; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}