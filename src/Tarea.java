import java.util.Scanner;

public class Tarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un angulo");
        int angulo= sc.nextInt();
        if (angulo==90){
            System.out.println("El angulo es un angulo recto");
        }else{
            System.out.println("El angulo no es un angulo recto");
        }

        System.out.println("TEMPERATURA");
        System.out.println("Ingrese la temperatura");
        int temp= sc.nextInt();
        if (temp > 100){
            System.out.println("Arriba del punto de ebullicion del agua");
        }else{
            System.out.println("Abajo del punto de ebullicion del agua");
        }


        System.out.println("Ingrese un numero");
        int num= sc.nextInt();

        int sumpos=1;
        int sumneg=-1;
        if (num>0){
            sumpos = sumpos + num;
            System.out.println("resultado " + sumpos);
        }
        else if (num < 0){
            sumneg = sumneg + num;
            System.out.println("resultado: " + sumneg);
        }



        System.out.println("pendientes");
        System.out.println("Ingrese una pendiente");
        double pend = sc.nextDouble();
        if (pend < 0.5){
            System.out.println("La variable flag es 0");

        }else if (pend >= 0.5 ){
            System.out.println("La variable flag es 1");
        }


        System.out.println("Ingrese su edad");
        int edad= sc.nextInt();
        if (edad>18){
            System.out.println("La persona es mayor de edad");
        } else{
            System.out.println("La persona es menor de edad");
        }


        System.out.println("Ingrese F si es mujer");
        String var = sc.next();
        if (var==var){
            System.out.println("Es una mujer");
        }else{
            System.out.println("Es un hombre");
        }
        System.out.println("VOLTIOS");
        System.out.println("Ingrese valor voltio 1");
        double vol1 = sc.nextDouble();
        System.out.println("Ingrese valor voltio 2");
        double vol2 = sc.nextDouble();
        if (vol1-vol2<0.001){
            System.out.println("La variable aprox es = 0");
        }else{
            double aprox=(vol1-vol2)/2.0;
            System.out.println("La variable aprox es = "+aprox);
        }


        System.out.println("FRECUENCIA");
        System.out.println("Ingrese una frecuencia");
        int frecu = sc.nextInt();
        if (frecu>60){
            System.out.println("La Frecuencia es demasiado alta");
        }else{
            System.out.println("La Frecuencia es normal o muy baja");
        }

        System.out.println("Ingrese un numero(temp1)");
        double temp1= sc.nextDouble();
        System.out.println("Ingrese un numero(temp2)");
        double temp2= sc.nextDouble();
        double diff= (temp1 - temp2);
        if (diff>2.4){
            double error= (temp1 - temp2)*0.01;
            System.out.println("Eror= "+error);
        }else{
            System.out.println("La diferencia es = "+diff);
        }

        System.out.println("DIFERENCIA");
        System.out.println("Ingrese teorico");
        double teo= sc.nextDouble();
        System.out.println("Ingrese experimental");
        double exp= sc.nextDouble();
        double dif = teo- exp;
        if (dif>5){
            double errr = (teo- exp)*100/teo;
            System.out.println("el resultado es= "+ errr);
        }else{
            System.out.println("el resultado es= "+ dif);
        }

        System.out.println("X, Y, Z, P");
        System.out.println("Ingrese un numero (x)");
        int x1 = sc.nextInt();
        System.out.println("Ingrese un numero (y)");
        int y1 = sc.nextInt();
        System.out.println("Ingrese un numero (z)");
        int z1 =sc.nextInt();
        if (x1>y1 && z1 < 20){
            System.out.println("Ingrese un numero (p)");
            int p1= sc.nextInt();
        }


        System.out.println("Ingrese un numero (distancia)");
        int dist= sc.nextInt();
        if (dist>20 && dist<35){
            System.out.println("Ingrese tiempo");
            int tiempo= sc.nextInt();
        }
        System.out.println("FIN EJERCICIO 1");
    }


}
