package condicional_tarea;

import java.util.Scanner;

public class TercerEjercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("INGRESAR DOS NUMEROS PARA DETERMINAR SI SON DIVISORES");
        System.out.println("Ingresar primer numero");
        int n1 = sc.nextInt();
        System.out.println("Ingresar segundo numero");
        int n2 = sc.nextInt();
        if (n1>n2){
            if (n1%n2==0){
                System.out.println(n1 +" es divisible para "+ n2);
            }else{
                System.out.println(n1 + " no es divisible para "+ n2);
            }
        }else if(n2>n1){
            if (n2%n1==0){
                System.out.println(n2 +" es divisible para "+ n1);
            }else{
                System.out.println(n2 + " no es divisible para "+ n1);
            }
        }
    }
}
