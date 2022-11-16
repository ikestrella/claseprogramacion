package condicional_tarea;

import java.util.Scanner;

public class SextoEjercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ALGORITMO PARA CALCULAR LOS MINUTOS EN DIAS, HORAS Y MINUTOS");
        int dias= 0;
        int horas=0;
        int minutos=0;
        System.out.println("Ingrese el tiempo en minutos (numeros enteros)");
        int t = sc.nextInt();
        while (t>0){
            if (t>=1440){
                dias= dias +1;
                t= t - 1440;
            }else if (t>=60) {
                    horas= horas+1;
                    t= t-60;
            }else{
                 minutos = minutos +1;
                 t=t-1;
            }
        }
        System.out.println(dias +" dias");
        System.out.println(horas+"horas");
        System.out.println(minutos+"minutos");
    }
}

