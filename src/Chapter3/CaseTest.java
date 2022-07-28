package Chapter3;

public class CaseTest {

//    public enum score{good};
    public static void main(String[] args) {

//        int [] choice = new int[]{1,2,3};
        enum score {good,bad,medium};
        int choice = 1;
        switch (choice){
            case 1:
                System.out.println("good");
            case 2:
                System.out.println("nomal");
            case 3:
                System.out.println("bad");
            default:
                System.out.println("there is no match");
        }

        switch (score.bad){
            case good:
                System.out.println("this score is good");
        }

        read_data:
        for (int i = 0; i < 100; i++) {
                if(i == 3)
//                    break read_data;
                    continue read_data;


            System.out.println(i);

        }

        int i =0;
        label:

        if(i == 2) break label;


    }

}
