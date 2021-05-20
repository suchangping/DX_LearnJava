package chapter03;

public class task1 {

    public static void main(String[] args) {
        int isHungry = 0;
        String food = "バナナ";
        System.out.println("こんにちは");
        switch (isHungry) {
            case 1:
                System.out.println("お腹がいっぱいです。");
                break;
            default:
                System.out.println("はらぺこです。\n" + food + "をいただきます");
        }
        System.out.println("ごちそうさまでした");
    }
}
