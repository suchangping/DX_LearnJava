package chapter06.comment;

public class Main {

    public static void main(String args[]) {
        Zenhan.doWarusa();
        Zenhan.doTogame();
        Kouhan.callDeae();
        try {
            Kouhan.showMondokoro();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
