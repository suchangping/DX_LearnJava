package chapter03;

public class Structure {
    public static void main(String[] args) {
       /* boolean tenki = true;
        if (tenki == true) {
            System.out.println("洗濯をします");
            System.out.println("散歩に行きます");
        } else {
            System.out.println("DVDをみえます");
        }

        boolean doorClos = true;
        while(doorClos == true) {
            System.out.println("ノックする");
            System.out.println("1分待つ");
            break;
        }
        int fortune = new java.util.Random().nextInt(4)+1;
        String strfor = "";
        if (fortune == 1) {
            strfor = "大吉";
        } else if (fortune == 2) {
            strfor = "中吉";
        } else if (fortune == 3) {
            strfor = "吉";
        } else {
            strfor = "悪";
        }
        System.out.println(strfor);
        switch (fortune){
            case 1:
                System.out.println("大吉");
                break;
            case 2:
                System.out.println("中吉");
                break;
            case 3:
                System.out.println("吉");
                break;
            default:
                System.out.println("悪");
                break;

        }*/
        for (int i = 1; i < 10; i++) {
            if (i == 6) continue;
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }

    }
}
