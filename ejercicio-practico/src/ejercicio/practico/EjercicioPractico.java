package ejercicio.practico;

import java.util.*;

public class EjercicioPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenide");
        float temp, tempma, tempme;
        
        tempma = Float.MIN_VALUE;
        tempme = Float.MAX_VALUE;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el numero de temperaturas que desea introducir:\n");
        int n;
        n = entrada.nextInt();
        for (int i = 1; i <= n; i++) {

            System.out.print("Introduce una temperatura:\n");
            temp = entrada.nextFloat();
            
            if(i== 1){
                tempme=temp;
                tempma=temp;
            } 
            if(temp >= 0) {
                System.out.println("Temperatura positiva");

            } else {
                System.out.println("Temperatura negativa");

            }
            if (temp > tempma) {

                tempma = temp;
            }
            if (temp < tempme) {
                tempme = temp;

            }

        }

        System.out.println("La temperatura mayor es " + tempma + "  y la temperatura menor es " + tempme);

    }

}
