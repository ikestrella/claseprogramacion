package condicional_tarea;

import java.util.Scanner;

public class OctavoEjercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la tolerancia de componente critico");
        double tl= sc.nextDouble();
        if (tl<0.1){
            System.out.println("Exploracion espacial");
        } else if (tl>=0.1 && tl<1) {
            System.out.println("Grado Militar");
        }else if (tl>=1 && tl<10){
            System.out.println("Grado comercial");
        } else if (tl>=10) {
            System.out.println("Grado juguete");
        }
    }
} //><