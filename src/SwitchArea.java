import java.util.Scanner;

import static java.lang.Math.PI;

public class SwitchArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAMA PARA ENCONTRAR EL AREA");
        System.out.println("Ingrese un numero del 1 al 3");
        int opc= sc.nextInt();
        switch (opc){
            case 1:
                System.out.println("Encontrar el area del triangulo");
                System.out.println("Ingrese base");
                double base = sc.nextDouble();
                System.out.println("Ingrese altura");
                double altura =sc.nextDouble();
                double area= (base*altura)/2;
                System.out.println("El area del triangulo es: " + area);
                break;
            case 2:
                System.out.println("Encontrar el area de un cuadrado");
                System.out.println("Ingrese el valor del lado");
                double lado= sc.nextDouble();
                double areacuadrado =(lado*lado);
                System.out.println("El area del cuadrado es: "+ areacuadrado);
                break;
            case 3:
                System.out.println("Encontrar el area de la circunferencia");
                System.out.println("Ingrese el radio de la circunferencia");
                double radiocircun = sc.nextDouble();
                double areacircunferencia = (Math.PI) * (radiocircun * radiocircun);
                System.out.println("El area de la circunferencia es: "+ areacircunferencia);
                break;
        }
    }
}
