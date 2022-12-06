package Bimestre2.Semana1.Ejercicios_codificados;

import java.util.Scanner;

public class SegundoEjercicio {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int interrutpor = 1;
        while (interrutpor==1){
            System.out.println("Ingrese 1 para convertir un valor de mb a kb");
            System.out.println("Ingrese 2 para converitr un valor de kb a mb");
            System.out.println("Ingrese 3 para converitr un valor en mb a bits");
            System.out.println("Ingrese 4 para salir del programa");
            int opc = sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Ingrese un valor de mb");
                    int mb= sc.nextInt();
                    if (mb >0){
                        mb = mb * 1024;
                        System.out.println("La conversion mb a kb es: "+ mb +" kb");
                    }else{
                        System.out.println("Ingrese un valor valido");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese un valor de kb");
                    double kb = sc.nextDouble();
                    if (kb >0){
                        kb=kb/1000;
                        System.out.println("La conversion de kb a mb es: "+kb+" mb");
                    }else{
                        System.out.println("Ingrese un valor valido");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese un valor de mb");
                    int mb1= sc.nextInt();
                    if (mb1 >0){
                        mb1 = mb1*1000*1000*8;
                        System.out.println("La conversion de mb a bit es: "+mb1+" bits");
                    }else{
                        System.out.println("Ingrese un valor valido");
                    }
                    break;
                case 4:
                    System.out.println("Salida del programa");
                    interrutpor=0;
            }
        }
    }
}
