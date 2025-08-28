package clases;

import clases.AdivinaNumero;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secreto = (int)(Math.random() * 100) + 1;
        ArrayList<Integer> intentos = new ArrayList<>();
        int intento;

        System.out.println("Adivina el número entre 1 y 100.");

        while (true) {
            System.out.print("Por favor ingresa el número: ");
            intento = scanner.nextInt();
            intentos.add(intento);

            String resultado = AdivinaNumero.compararNumeros(intento, secreto);
            System.out.println(resultado);

            if (intento == secreto) {
                break;
            }
        }

        System.out.println("Te tomó " + intentos.size() + " intento(s) adivinar el número.");
        System.out.print("Intentos: ");
        for (int i : intentos) {
            System.out.print(i + " ");
        }
    }
}
