package TrabajosSegundoBimestre;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cedula []=new int[10];
        System.out.println("Ingrese su numero de cedula: ");
        for (int indice = 0; indice < cedula.length; indice++) {
            int ced= sc.nextInt();
            cedula[indice]=ced;
        }
        for (int indice = 0; indice < 9; indice=indice+2) {
            cedula[indice]= cedula[indice]*2;
        }
        for (int indice = 0; indice < 9; indice++) {
            if (cedula[indice]>=10){
                cedula[indice]=cedula[indice]-9;
            }
        }
        int acumulador=0;
        for (int indice = 0; indice < 9; indice++) {
            acumulador = cedula[indice] + acumulador;
        }
        System.out.println(acumulador);
        int decena = 0;
        while (acumulador<99 || acumulador<1000){
            decena=acumulador/10;
            break;
        }
        decena=(decena*10)+10;
        int resultadoresta= 0;
        resultadoresta=decena-acumulador;
        if (resultadoresta==cedula[9]){
            System.out.println("El número de cédula es correcto");
        }else {
            System.out.println("Cédula incorrecta");
        }
    }
}
