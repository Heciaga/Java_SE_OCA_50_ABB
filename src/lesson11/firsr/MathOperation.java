package lesson11.firsr;
@FunctionalInterface
public interface MathOperation {
    int operate(int a, int b);

    public static void calculate(int a, int b, MathOperation operation){
        System.out.println(operation.operate(a,b));
    };
}
