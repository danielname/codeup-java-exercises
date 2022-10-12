public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int addition(int a, int b){
        return a + b;
    }
    public static int subtraction(int a, int b){
        return a - b;
    }
    public static int multiplication(int a, int b){
        return a * b;
    }
    public static double division(double a, double b){
        return a / b;
    }
    public static int modulus(int a, int b){
        return a % b;
    }
    public static int multiplicationBonus(int a, int b){
        int dnAValue = a;
        for (int i = 1; i < b; i++){
            dnAValue += a;
        }
        return dnAValue;
    }
    public static int factorial(int a){
        int x = a;
        for (int i = 1; i < a; i++){
            x *= i;
        }
        return x;
    }
}
