package chapter02;

import javax.swing.text.Style;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);
       // System.out.println(age);
        int fortune = new java.util.Random().nextInt(3);
        //System.out.println(fortune);
        fortune++;
        String strfor = "";
        if (fortune == 1) {
            strfor = "大吉";
        } else if (fortune == 2) {
            strfor = "中吉";
        } else if (fortune == 3) {
            strfor = "吉";
        } else if (fortune == 4) {
            strfor = "悪";
        }
        System.out.println("占いの結果が出ました");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + strfor + "です");
    }

}
