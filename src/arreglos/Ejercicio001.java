package arreglos;

import java.util.Scanner;

public class Ejercicio001 {

    public static void main(String[] args) {

        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = (int) (Math.random() * 20);
        }
        for (int i = 0; i < 100; i++) {
            System.out.print("|" + numeros[i]);
            if (i == 99) {
                System.out.print("|");
            }
        }
        System.out.println("");
        Scanner Enter = new Scanner(System.in);
        System.out.print("INGRESE NUMERO A REEMPLAZAR: ");
        int NUM1 = Enter.nextInt();
        System.out.print("INGRESE NUMERO DE REEMPLAZO: ");
        int NUM2 = Enter.nextInt();
        String num2 = Integer.toString(NUM2);
        String[] numeroString = new String[100];
        for (int i = 0; i < 100; i++) {
            String numString = Integer.toString(numeros[i]);
            numeroString[i] = numString;
            if (numeros[i] == NUM1) {
                numeroString[i] = "*" + num2 + "*";
            }
        }
        for (int i = 0; i < 100; i++) {
            System.out.print("|" + numeroString[i]);
            if (i == 99) {
                System.out.print("|");
            }
        }
    }

}
