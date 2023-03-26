import java.util.function.IntBinaryOperator;

public class Ej5 {

        public static int mcdRecursivo(int m, int n) {
            return n == 0 ? m : mcdRecursivo(n, m % n);
        }

        public static int mcdIterativo(int m, int n) {
            while (n != 0) {
                int temp = n;
                n = m % n;
                m = temp;
            }
            return m;
        }

        public static IntBinaryOperator mcdLambda = Ej5::mcdLambdaAux;

        private static int mcdLambdaAux(int m, int n) {
            return n == 0 ? m : mcdLambda.applyAsInt(n, m % n);
        }



        public static void main(String[] args) {
            int m = 30;
            int n = 243;

            // Implementación recursiva
            int mcdRecursivo = Ej5.mcdRecursivo(m, n);
            System.out.println("MCD de " + m + " y " + n + " (recursivo): " + mcdRecursivo);

            // Implementación iterativa
            int mcdIterativo = Ej5.mcdIterativo(m, n);
            System.out.println("MCD de " + m + " y " + n + " (iterativo): " + mcdIterativo);

            // Implementación con expresiones lambda
            int mcdLambda = Ej5.mcdLambda.applyAsInt(m, n);
            System.out.println("MCD de " + m + " y " + n + " (lambda): " + mcdLambda);
        }
    }


