package Bimestre2.Semana1.Ejercicios_codificados;

import java.util.Scanner;

public class PrimerEjercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num= sc.nextInt();
        int contador=1;
        int suma_divisores=0;
        while (contador < num){
            if (num%contador==0){
                suma_divisores=suma_divisores+contador;
            }
            contador=contador+1;
        }
        if (suma_divisores>num){
            System.out.println("El numero es abundante");
        }else{
            System.out.println("El numero no es abundante");
        }
    }
}
