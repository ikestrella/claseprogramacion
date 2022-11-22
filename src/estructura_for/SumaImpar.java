package estructura_for;

import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero limite: ");
        Scanner sc = new Scanner(System.in);
        int limite = sc.nextInt();
        int suma_impar = 0;
        for(int contador = 1; contador <= limite; contador+=2){//contador=contador+2 o contador++
            //if (contador%2==1)
                //suma_impar = suma_impar+ contador;
            suma_impar = suma_impar + contador;
        }
        System.out.println("La suma de numeros impares = " + suma_impar);
    }
}
