package chapter05;

public class task3 {
    public static void main(String args[]) {
        email("会社説明会", "suchangping@gmail.com", "お疲れ様です。李です。\n会社説明会を行います、参加しますか？");
        email("suchangping@gmail.com", "お疲れ様です。李です。\n会社説明会を行います、参加しますか？");

    }

    public static void email(String title, String address, String text) {
        System.out.println(address + "の宛先アドレスに以下のメールを送信しました。\n件名："
                + title + "\n本文:\n" + text);
    }

    public static void email(String address, String text) {
        System.out.println(address + "の宛先アドレスに以下のメールを送信しました。\n件名：無題"
                + "\n本文:\n" + text);
    }
}
