import java.util.function.Function;

public class Ej3 {

    // Conversión a hexadecimal de forma iterativa
    public static String decimalToHexIterativo(int num) {
        if (num == 0) {
            return "0";
        }
        String hex = "";
        while (num > 0) {
            int rem = num % 16;
            if (rem < 10) {
                hex = rem + hex;
            } else {
                hex = (char) ('A' + rem - 10) + hex;
            }
            num /= 16;
        }
        return hex;
    }

    // Conversión a base B utilizando expresiones lambda
    public static Function<Integer, String> decimalToBaseB(int base) {
        return (num) -> {
            if (num == 0) {
                return "0";
            }
            String result = "";
            while (num > 0) {
                int rem = num % base;
                if (rem < 10) {
                    result = rem + result;
                } else {
                    result = (char) ('A' + rem - 10) + result;
                }
                num /= base;
            }
            return result;
        };
    }

    public static void main(String[] args) {
        int decimal = 12345;
        String hexadecimal = decimalToHexIterativo(decimal);
        System.out.println(decimal + " en hexadecimal: " + hexadecimal);

        int base = 8;
        Function<Integer, String> decimalToBase = decimalToBaseB(base);
        String octal = decimalToBase.apply(decimal);
        System.out.println(decimal + " en base " + base + ": " + octal);
    }
}
