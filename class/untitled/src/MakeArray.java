import java.util.Scanner;

public class MakeArray {
    public static void printMap(int[][] Map) {
        for (int i = 0; i < Map.length; i++) {
            for (int j = 0; j < Map[i].length; j++) {
                if(Map[i][j] == 0) {
                    System.out.print("⬜");
                } else if(Map[i][j] == 1) {
                    System.out.print("⬛");
                } else {
                    System.out.print("[Error] Map value is not 0 or 1.");
                }
            }
            System.out.println();
        }
    }

    public static void changeMap(int[][] Map) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("if you want to change Map Input X Num >> ");
        int x = scanner.nextInt() - 1;

        System.out.print("if you want to change Map Input Y Num >> ");
        int y = scanner.nextInt() - 1;

        if(Map[y][x] == 1) {
            Map[y][x] = 0;
        } else if (Map[x][y] == 0) {
            Map[y][x] = 1;
        } else {
            System.out.println("[Error] Map value is not 0 or 1.");
        }

        printMap(Map);
    }

    public static void main(String[] args) {
//        int[] arr01 = new int[5];
//        for(int i = 0; i < arr01.length; i++) {
//            System.out.println((i+1) +" Value >> "+arr01[i]);
//        }
//
//        System.out.println("--------------------------------");
//
//        int arr02[] = {1,2,3,4,5};
//        for(int i = 0; i < arr02.length; i++) {
//            System.out.println((i+1) +" Value >> "+arr02[i]);
//        }
//
//        int arr03[][] = {{1,2}, {1,2}, {1,2}, {1,2}, {1,2}};
//        for(int i = 0; i < arr03.length; i++) {
//            System.out.print("[" + i + "] ");
//            for(int j = 0; j < arr03[i].length; j++) {
//                System.out.print((j+1) +" Value >> "+arr03[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        int Map[][] = {
                {1, 0, 0, 1, 0},
                {1, 1, 0, 1, 0},
                {0, 1, 0, 1, 0},
                {0, 1, 1, 0, 1},
                {1, 1, 0, 0, 0}
        };

        printMap(Map);
        changeMap(Map);
    }
}