package ejercicio.practico;

import java.util.*;

public class EjercicioPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenide");
        float temp, tempma, tempme;
        tempma = 0;
        tempme = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el numerto de temperaturas que desea introducir:\n");
        int n;
        n = entrada.nextInt();
        for (float i = 1; i <= n; i++) {

            System.out.print("Introduce una temperatura:\n");
            temp = entrada.nextFloat();
            
            if(i== 1){
                tempme=temp;
                tempma=temp;
            } 
            if(temp > 0) {
                System.out.println("Positivo");

            } else {
                System.out.println("Negativo");

            }
            if (temp > tempma) {

                tempma = temp;
            }
            if (temp < tempme) {
                tempme = temp;

            }

        }

        System.out.println("Mayor es igual    " + tempma + "  Menor es igual     " + tempme);

    }

}
