package Chapter3;

public class EnumConstant {
    public static void main(String[] args) {
        enum Size{SMALL , MEDIUM ,LARGE ,EXTRA_LARGE};
        Size s = Size.MEDIUM;
        System.out.println(s);
    }
}
