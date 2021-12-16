package ejercicio.practico;

import java.util.*;

public class EjercicioPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenide");
        float tempma, tempme;
        //Float.MIN_VALUE representa el menor valor posible de Float y MAX_VALUE es el valor maximo que puede alcanzar los Float.
        tempma = Float.MIN_VALUE;
        tempme = Float.MAX_VALUE;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el numero de temperaturas que desea introducir:\n");
        int n, i = 0;
        n = entrada.nextInt();
        float temp[] = new float[n];
        for (i = 0; i < temp.length; i++) {

            System.out.print("Introduce una temperatura:\n");
            temp[i] = entrada.nextFloat();
        }
        for (i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
        for (i = 0; i < temp.length; i++) {
            if (i == 1) {
                tempme = temp[i];
                tempma = temp[i];
            }

            if (temp[i] >= 0) {
                System.out.println("Temperatura positiva");

            } else {
                System.out.println("Temperatura negativa");

            }
            if (temp[i] > tempma) {

                tempma = temp[i];
            }
            if (temp[i] < tempme) {
                tempme = temp[i];

            }

        }

        System.out.println("La temperatura mayor es " + tempma + "  y la temperatura menor es " + tempme);

    }

}
