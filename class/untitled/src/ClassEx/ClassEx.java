package ClassEx;

import java.util.Random;
import java.util.Scanner;

public class ClassEx {
    private static int MAX_X = 5;
    private static int MAX_Y = 5;
    private int Map[][];
    public void makeMap() {
        this.Map = new int[MAX_X][MAX_Y];

        for (int i = 0; i < this.Map.length; i++) {
            for (int j = 0; j < this.Map[i].length; j++) {
                Random rand = new Random();
                boolean flag = rand.nextBoolean();

                if(flag) {
                    this.Map[i][j] = 1;
                } else if(!flag) {
                    this.Map[i][j] = 0;
                } else {
                    System.out.println("[Error] Map value is not 0 or 1.");
                }
            }
        }
    }

    public void printMap() {
        if(this.Map == null) {
            System.out.println("[Error] Map is null.");
            return;
        }

        for (int i = 0; i < this.Map.length; i++) {
            for (int j = 0; j < this.Map[i].length; j++) {
                if(this.Map[i][j] == 0) {
                    System.out.print("⬜");
                } else if(this.Map[i][j] == 1) {
                    System.out.print("⬛");
                } else {
                    System.out.print("[Error] Map value is not 0 or 1.");
                }            }
            System.out.println();
        }
    }

    public void defaultMap() {
        if(this.Map == null) { System.out.println("[Error] Map is already null."); return; }
        this.Map = null;
    }

    public void changeMap() {
        if(this.Map == null) {
            System.out.println("[Error] Map is null.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter X: ");
        int x = scanner.nextInt() - 1;

        System.out.println("Enter Y: ");
        int y = scanner.nextInt() - 1;

        if(Map[y][x] == 0) {
            Map[y][x] = 1;
        } else if(Map[y][x] == 1) {
            Map[y][x] = 0;
        } else {
            System.out.println("[Error] Map value is not 0 or 1.");
        }
    }
}
