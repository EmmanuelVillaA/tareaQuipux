public class Actividad2Punto2 {
    public static void main(String[] args) {
        int[] numeros = {37, 81, 47, 52, 2, 99, 19, 58, 41, 73, 56, 29, 13, 90, 67, 103, 31, 23, 17, 59, 64, 83};

        System.out.println("Lista de los numero primos: ");
        for (int numero : numeros) {
            if (esPrimo(numero)) {
                System.out.println("Números primos: " + numero);
            }

        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}


