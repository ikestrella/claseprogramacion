package condicional_tarea;

import java.util.Scanner;

public class QuintoEjercicio {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ALGORITMO PARA RECIBIR LAS MEDIDAS DE UN TRIANGULO RECTANGULO");
        System.out.println("INGRESE TRES NUMEROS");
        System.out.println("Ingrese el primer numero");
        int a= sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b= sc.nextInt();
        System.out.println("Ingrese el tercer numero");
        int c=sc.nextInt();
        if (c>a && c>b){
            System.out.println("Los lados si pueden ser usados en un triangulo rectangulo");
        }else if(a>c && a>b){
            System.out.println("Los lados si pueden ser usados en un triangulo rectangulo");
        }else if(b>c && b>a){
            System.out.println("Los lados si pueden ser usados en un triangulo rectangulo");
        }else{
            System.out.println("Los lados no pueden ser usados en un triangulo rectangulo");
        }
    }
}
