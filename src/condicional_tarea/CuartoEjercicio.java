package condicional_tarea;

import java.util.Scanner;

public class CuartoEjercicio {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el tiempo en segundos");
        double t = sc.nextDouble();
        if (t<=35.0){
            double psi = 0.46*t;
            System.out.println("La presion es: " + psi +"psi");
        }else if (t>35){
            double psi = 0.19*t+9.45;
            System.out.println("La presion es: "+psi+"psi");
        }
    }
}
