package condicional_tarea;

import java.util.Scanner;

public class SeptimoEjercicio {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n1= sc.nextInt();
        System.out.println("Ingrese un segundo numero");
        int n2= sc.nextInt();
        if (n1>n2){
            System.out.println("El primer numero es mayor: "+n1);
        }else if (n2>n1){
            System.out.println("El segundo numero es mayor: "+n2);
        }else{
            System.out.println("Los numeros son iguales");
        }
    }
}
