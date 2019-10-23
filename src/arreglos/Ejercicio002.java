package arreglos;

import java.util.Scanner;

public class Ejercicio002 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] listanumeros = new int[10];

        Scanner entrada = new Scanner(System.in);
        System.out.print("digite los numero: ");
        for (int i = 0; i < 10; i++) {
            int numero;
            numero = entrada.nextInt();
            numeros[i] = numero;
        }
        //IMPRESION DE LA LISTA
        System.out.print("indice: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+i);
        }
        System.out.println("");
        System.out.print("lista:  ");
        for (int i = 0; i < 10; i++) {
            System.out.print("|" + numeros[i]);
        }
        int a =0;        
        for (int i = 0; i < 10; i++) {
            int cont = 0;
            for (int j = 1; j <= numeros[i]; j++) {
                if (numeros[i] % j == 0) {
                    cont++;
                }                
            }
            if(cont == 2){
                    listanumeros[a]=numeros[i];
                    a++;                
                }            
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            int cont = 0;
            for (int j = 1; j <= numeros[i]; j++) {
                if (numeros[i] % j == 0) {
                    cont++;
                }               
            }
            if(cont != 2){
                    listanumeros[a]=numeros[i];
                    a++;               
                }            
        }
        //IMPRESION DE LA LISTA ORDENADA
        System.out.print("indice: ");
        for (int j = 0; j < 10; j++) {
                System.out.print(" " + j);
            }
        System.out.println("");
        System.out.print("lista:  ");
         for (int j = 0; j < 10; j++) {
                System.out.print("|" + listanumeros[j]);
            }
    }
}
