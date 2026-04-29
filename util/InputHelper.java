package util;

import java.util.Scanner;

public class InputHelper {
    public static Scanner sc = new Scanner(System.in);

    public static String getString(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    public static int getInt(String msg) {
        System.out.print(msg);
        int value = sc.nextInt();
        sc.nextLine(); // clear buffer
        return value;
    }
}
