package com.ironhack.main;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        int[] listaNumeros = {1, 4, 71, 8, 9, 22, 7, 15, 43, 6, 9, 8};
        int[] result = getdif(listaNumeros);
        System.out.println("El numero mayor es " + result[0] + " el numero menor es " + result[1] + " y la diferencia es de " + result[2]);
        masPequeño(listaNumeros);
        System.out.println("El resultado de la operacion es: " + operacion(40, 15));

    }


    private static int[] getdif(int[] listaNumeros) {
        int numeroMayor = listaNumeros[0];
        int numeroMenor = listaNumeros[0];
        int posicionMayor = 0;
        int posicionMenor = 0;

        for (int x = 1; x < listaNumeros.length; x++) {
            if (listaNumeros[x] > numeroMayor) {
                numeroMayor = listaNumeros[x];
                posicionMayor = x;
            } else if (listaNumeros[x] < numeroMenor) {
                numeroMenor = listaNumeros[x];
                posicionMenor = x;
            }
        }

        int[] result = {numeroMayor, numeroMenor,(numeroMayor - numeroMenor)};

        return (result);

    }
    private static void masPequeño(int[] listaNumeros) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i<listaNumeros.length; i++) {
            if(listaNumeros[i] < smallest) {
                secondSmallest = smallest;
                smallest = listaNumeros[i];
            }else if(listaNumeros[i]< secondSmallest && listaNumeros[i] > smallest)  {
                secondSmallest = listaNumeros[i];
            }
        }
        System.out.println("El mas pequeño es " + smallest + " y el segundo mas pequeño es " + secondSmallest);
    }


    private static double operacion(double a, double b) {
        double resultado = Math.pow(a, 2) + Math.pow(4 * b/5 - a, 2);
        return resultado;
    }
}




