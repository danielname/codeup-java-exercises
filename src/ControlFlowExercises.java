public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i < 15){
//            i++;
//            System.out.println(i);
//        }
//        int i = 0;
//        do {
//            i += 2;
//            System.out.println(i);
//        }while (i < 100);
//        do {
//            i -= 5;
//            System.out.println(i);
//        }while (i > -10);
//        i += 12;
//        System.out.println(i);
//        do {
//            i = i * i;
//            System.out.println(i);
//        }while (i < 50000);
        for (int i = 5; i <= 15; i++){
            System.out.println(i);
        }
        for (int i = 0; i < 100; i += 2){
            System.out.println(i);
        }
        for (int i = 100; i > -15; i -= 5){
            System.out.println(i);
        }
        for (int i = 2; i < 50000; i = i * i){
            System.out.println(i);
        }
    }
}
