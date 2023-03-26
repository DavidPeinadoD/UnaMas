import java.util.function.IntConsumer;


public class Ej2 {

    // Algoritmo iterativo
    public static void f_iterativo(int num, int div) {
        while (num > 1) {
            if (num % div == 0) {
                System.out.println(div);
                num /= div;
            } else {
                div++;
            }
        }
    }

    // Algoritmo usando expresiones lambda
    public static void f_lambda(int num, final int div) {
        IntConsumer f = new IntConsumer() {
            public void accept(int n) {
                if (n > 1) {
                    if (n % div == 0) {
                        System.out.println(div);
                        accept(n / div);
                    } else {
                        accept(n);
                    }
                }
            }
        };
        f.accept(num);
    }

    public static void main(String[] args) {
        int num = 60;
        int div = 2;

        // Ejecución del algoritmo iterativo
        System.out.println("Algoritmo iterativo:");
        f_iterativo(num, div);

        // Ejecución del algoritmo lambda
        System.out.println("\nAlgoritmo lambda:");
        f_lambda(num, div);
    }
}


