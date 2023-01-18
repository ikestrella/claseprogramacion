package Bimestre2_semana6;
import java.util.Scanner;

public class Ejercicio3 {
    int cedula [][]=new int[5][10];
    public void ingresar() {
        Ejercicio3 asdd= new Ejercicio3();
        Scanner sc = new Scanner(System.in);
        for (int indice = 0; indice < cedula.length; indice++) {
            System.out.println("Ingrese el numero de cedula");
            for (int indice2 = 0; indice2 < cedula[0].length; indice2++) {
                int ced = sc.nextInt();
                cedula[indice][indice2] = ced;
            }
        }
        for (int indice = 0; indice < cedula.length; indice++) {
            for (int indice2 = 0; indice2 < cedula[0].length-1; indice2=indice2+2) {
                cedula[indice][indice2]=cedula[indice][indice2]*2;
            }
        }
        for (int indice = 0; indice < cedula.length; indice++) {
            for (int indice2 = 0; indice2 < 9; indice2++) {
                if (cedula[indice][indice2]>=10){
                    cedula[indice][indice2]=cedula[indice][indice2]-9;
                }
            }
        }
        int ac[][]=new int[5][10];
        int acum=0;
        for (int indice = 0; indice < cedula.length; indice++) {
            for (int indice2 = 0; indice2 < cedula[0].length-1; indice2++) {
                acum= cedula[indice][indice2]+acum;
            }
            ac[indice][0]=acum;
        }
        int decena[][]=new int[5][10];
        for (int indice = 0; indice < cedula.length; indice++) {
            while (ac[indice][0]<99 || ac[indice][0]<1000){
                decena[indice][0]=ac[indice][0]/10;
                break;
            }
        }
        for (int indice = 0; indice < cedula.length; indice++) {
            decena[indice][0]=(decena[indice][0]*10)+10;
        }
        for (int indice = 0; indice < cedula.length; indice++) {
            decena[indice][0]=decena[indice][0]-ac[indice][0];
        }
        System.out.println(decena[0][0]);
        for (int indice = 0; indice < cedula.length; indice++) {
            if (decena[indice][0]==cedula[indice][9]){
                System.out.println("El número de cédula es correcto");
            }else {
                System.out.println("Cédula incorrecta");
            }
        }
    }
    public static void main(String[] args) {
        Ejercicio3 asd= new Ejercicio3();
        asd.ingresar();
    }
}