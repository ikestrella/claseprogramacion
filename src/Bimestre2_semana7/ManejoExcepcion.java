package Bimestre2_semana7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * PROGRAMA PARA REALIZAR LA DIVISION ENTRE DOS NUMEROS
 */
public class ManejoExcepcion {
    //creacion de variables globales
    double n1;
    double n2;


    public static void main(String[] args) {
        ManejoExcepcion mivariable = new ManejoExcepcion();
        mivariable.ejecutar();
    }
    public void ejecutar(){
        ingresar_datos();
        System.out.println("Resultado = " + dividir() );
    }


    //InputMismatchException funciona solo para entrada de datos
    //ArithmeticException manejo excepcion tipo aritmetico
    //Exception sirve para todas la excepciones
    public void ingresar_datos(){
        //este codigo tiene la posibilidad de presentar una excepcion
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el numerados: ");
            n1= sc.nextDouble();
            System.out.println("Ingrese denominador: ");
            n2= sc.nextDouble();
        }catch (ArithmeticException error_de_teclado ){
            System.out.println("Manejo de la excepcion con catch");
            System.out.println(error_de_teclado.getMessage());
        }catch (Exception error){
            System.out.println("Manejo de la excepcion de entrada de datos");
            System.out.println(error.getMessage());
        }
    }

    public double dividir(){
        double resultado=0;
        try{
            //codigo en el que posiblemente ocurra una excepcion
            resultado= n1/n2;
            return resultado;
        }catch (Exception err){
            //este codigo se ejecuta solo si ocurre una excepcion
            System.out.println(err.getMessage());
        }finally {
            //este codigo se ejecuta ocurra o no la excepcion
            System.out.println("Ingreso a Finally");
        }
        return resultado;
    }
}
