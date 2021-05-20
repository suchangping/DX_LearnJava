package chapter04;

public class Structure {

    public static void main(String[] args) {
        int[] scores;
        scores = new int[5];
        int num = scores.length;
        System.out.println("elementの数:" + num);
        scores[0] = 10;
        int[] scores1 = new int[] {1,2,3,4,5};
        int[] scores2 = {10,20,30,40,50};
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i<scores.length; i++) {
            System.out.println("scroes[" + i + "]:" + scores[i]);
            sum += scores[i];
        }

        for (int i = 0; i<scores1.length; i++) {
            System.out.println("scores1[" + i + "]:" + scores1[i]);
            sum1 += scores1[i];
        }

        for (int i = 0; i<scores2.length; i++) {
            System.out.println("scores2[" + i + "]:" + scores2[i]);
            sum2 += scores2[i];
        }

    }
}
