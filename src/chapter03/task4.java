package chapter03;

import java.awt.desktop.SystemEventListener;

public class task4 {

    public static void main(String[] args) {
        System.out.println("1:検索 2:登録 3:削除　4：変更");
        int key = new java.util.Scanner(System.in).nextInt();
        switch (key) {
            case 1:
                System.out.println("検索");
                break;
            case 2:
                System.out.println("登録");
                break;
            case 3:
                System.out.println("削除");
                break;
            case 4:
                System.out.println("変更");
                break;
            default:
                System.out.println("");
                break;

        }
    }
}
