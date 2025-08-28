package clases;

public class AdivinaNumero {
    public static String compararNumeros(int intento, int secreto) {
        if (intento == secreto) {
            return "¡Has conseguido adivinar el número!";
        } else if (intento < secreto) {
            return "Intenta con un número más grande.";
        } else {
            return "Intenta con un número más pequeño.";
        }
    }
}
