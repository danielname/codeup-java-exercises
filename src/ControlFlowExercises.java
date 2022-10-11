public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i < 15){
//            i++;
//            System.out.println(i);
//        }
        int i = 0;
        do {
            i += 2;
            System.out.println(i);
        }while (i < 100);
        do {
            i -= 5;
            System.out.println(i);
        }while (i > -10);
        i += 12;
        System.out.println(i);
//        do {
//            i *= i;
//            System.out.println(i);
//        }while (i < 1000000);
    }
}
