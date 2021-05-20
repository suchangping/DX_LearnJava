package chapter05;

public class Structure {
    public static void main(String args[]) {
        System.out.println("宿さん、こんにちは");
        hello();
        methodA();
    }

    public static void hello() {
        System.out.println("宿さん、こんにちは");
    }
    public static void methodB() {
        System.out.println("methodB");
    }
    public static void methodA() {
        System.out.println("methodA");
        methodB();
    }
}
