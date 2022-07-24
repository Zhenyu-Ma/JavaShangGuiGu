package Test;

public class ArrayTeat001 {
    public static void main(String[] args) {
        int score[] = new int [9];  //长度为9.从0 到 8
        System.out.println(score.length);
        for (int i = 0; i < score.length; i++) {
            score[i] = i;
            System.out.println(score[i]);
        }
    }
}
