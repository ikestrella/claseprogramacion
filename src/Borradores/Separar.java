package Borradores;

import java.util.LinkedList;
import java.util.Scanner;

public class Separar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num[]=new int[5];
        int numeros;
        System.out.println("Ingresar numeros");
        numeros= sc.nextInt();
        for (int indice = 0; indice < num.length; indice++) {
            num[indice]=numeros%10;
            numeros=numeros/10;
        }
        for (int indice = 4; indice >= 0; indice--) {
            System.out.println(num[indice]);
        }
    }
}
