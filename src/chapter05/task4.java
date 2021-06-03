package chapter05;

public class task4 {
    public static void main(String args[]) {
        System.out.println("三角型の面積：" + calcTriangleArea(10,5));
        System.out.println("円の面積：" + calcCircleArea(5));
    }
    public static double calcTriangleArea(double bottom, double height) {
        return (bottom * height)/2;
    }

    public static double calcCircleArea(double radius) {
        return 3.14 * radius * radius;
    }
}
