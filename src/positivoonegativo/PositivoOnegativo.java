/*
• Ejercicio 2: Leer un número e
indicar si es positivo o negativo.
EI proceso se repetirá hasta que
se introduzca un 0.
 */
package positivoonegativo;

import java.util.Scanner; 

public class PositivoOnegativo {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num;
        System.out.println("Ingrese un digito para saber si es \n"
                + "positivo o negativo");
        num = entrada.nextFloat();
        
        while (num != 0){
        if (num>1){
            System.out.println("El digito ingresado es positivo ");
        }
        else {
            System.out.println("El digito ingresado es negativo ");
        }
        System.out.println("Ingrese un digito para saber si es \n"
                + "positivo o negativo");
        num = entrada.nextFloat();
        }
        
    }
    
}
