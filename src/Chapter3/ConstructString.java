package Chapter3;

public class ConstructString {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        //调用append
        builder.append("ch");
        builder.append("str");
        String completedString = builder.toString();
        System.out.println(completedString);
    }
}
