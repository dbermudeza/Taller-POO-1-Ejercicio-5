

package com.mycompany.pootaller1ej5;
import java.util.Scanner;
public class POOtaller1ej5 {
//Este codigo calcula el área y el perímetro de un círculo en base a su radio, el cual es ingresado por el usuario.
    public static void main(String[] args) {
        float r;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo en m: ");
        r= entrada.nextFloat();
        System.out.println("El área del círculo es: " + (Math.PI*Math.pow(r, 2)) + "m²");
        System.out.println("La longitud de la circunferencia del círculo es: " + ((2*Math.PI)*r) + "m");
    }
}
