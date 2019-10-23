
package arreglos;

import java.util.Scanner;

public class Ejercicio003 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = (int) (Math.random() * 500);
        }
        for (int i = 0; i < 100; i++) {
            System.out.print("|" + numeros[i]);
            if ((i+1)%20 == 0) {
                System.out.print("|");
                System.out.println("");
            }
        }
        System.out.println("Ingrese una opcion:");
        System.out.println("1.  valor maximo");
        System.out.println("2.  valor minimo");
        Scanner Enter = new Scanner(System.in);
        int mayor = 0,menor = 500;
        int option = Enter.nextInt();
        if(option == 1){
            for (int i = 0; i < 100; i++) {
                if(mayor < numeros[i]){
                    mayor = numeros[i];
                }
            }
            String Mayor = Integer.toString(mayor);
            String[] listanumeroString = new String[100];
            for (int i = 0; i < 100; i++) {
                String numString = Integer.toString(numeros[i]);
                listanumeroString[i] = numString;
                if (numeros[i] == mayor) {
                    listanumeroString[i] = "**" + Mayor + "**";
                }
            }
            //IMPRESION
            for (int i = 0; i < 100; i++) {
                System.out.print("|" + listanumeroString[i]);
                if ((i+1)%20 == 0) {
                    
                    System.out.print("|");
                    System.out.println("");
                }
            }
        }
        if(option == 2){
            for (int i = 0; i < 100; i++) {
                if(menor > numeros[i]){
                    menor = numeros[i];
                }
            }
            String Menor = Integer.toString(menor);
            String[] listanumeroString = new String[100];
            for (int i = 0; i < 100; i++) {
                String numString = Integer.toString(numeros[i]);
                listanumeroString[i] = numString;
                if (numeros[i] == menor) {
                    listanumeroString[i] = "**" + Menor + "**";
                }
            }
            //IMPRESION
            for (int i = 0; i < 100; i++) {
                System.out.print("|" + listanumeroString[i]);
                if ((i+1)%20 == 0) {
                    System.out.print("|");
                    System.out.println("");
                }
            }
        }
    }
}
