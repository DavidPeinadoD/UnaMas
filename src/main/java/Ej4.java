public class Ej4 {
    public static boolean esPalindromoRecursivo(String cadena) {
        if (cadena.length() == 0 || cadena.length() == 1) {
            return true;
        }
        if (cadena.charAt(0) == cadena.charAt(cadena.length() - 1)) {
            return esPalindromoRecursivo(cadena.substring(1, cadena.length() - 1));
        }
        return false;
    }

    public static boolean esPalindromoIterativo(String cadena) {
        int inicio = 0;
        int fin = cadena.length() - 1;
        while (inicio < fin) {
            if (cadena.charAt(inicio) != cadena.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }
        return true;
    }

    public static void main(String[] args) {
        String cadena1 = "DABALEARROZALAZORRAELABAD";
        String cadena2 = "HOLAMUNDO";
        String cadena3 = "ANITALAVALATINA";

        System.out.println("Recursivo:");
        System.out.println(cadena1 + " es palindromo: " + esPalindromoRecursivo(cadena1));
        System.out.println(cadena2 + " es palindromo: " + esPalindromoRecursivo(cadena2));
        System.out.println(cadena3 + " es palindromo: " + esPalindromoRecursivo(cadena3));

        System.out.println("Iterativo:");
        System.out.println(cadena1 + " es palindromo: " + esPalindromoIterativo(cadena1));
        System.out.println(cadena2 + " es palindromo: " + esPalindromoIterativo(cadena2));
        System.out.println(cadena3 + " es palindromo: " + esPalindromoIterativo(cadena3));
    }
}
