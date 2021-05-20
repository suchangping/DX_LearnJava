package chapter02;

public class Structure {
    public static void main(String[] args) {
        /*int a;
        int b;
        a = 20;
        b = a + 5;
        System.out.println(a);
        System.out.println(b);
        System.out.println("私の好きな記号は二重引用符(\")です。");
        //a++;
        System.out.println(a);
        System.out.println(++a + 50);
        System.out.println(b++ + 50);
        System.out.println(b);

        float f = 3F;
        double d = f;
        System.out.println(d);
        f = (float) d;
        System.out.println(f);

        int age = (int)3.2;
        System.out.println(age);

        String name = "すがわら";
        String message;
        message = name + "さん、こんにちは";
        System.out.println(message);

        int a = 5;
        int b = 3;
        int m = Math.max(a, b);
        int n = Math.min(a, b);
        System.out.println(m + "\n" + b);

        int num = Integer.parseInt("3");
        System.out.println(num);

        int r = new java.util.Random().nextInt(100);
        System.out.println(r);*/

        String name = new java.util.Scanner(System.in).nextLine();
        int age = new java.util.Scanner(System.in).nextInt();
        System.out.println("ようこそ" + age + "歳の" + name + "さん");

    }
}
