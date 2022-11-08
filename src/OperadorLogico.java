public class OperadorLogico {
    public static void main(String[] args) {
        System.out.println("PRUEBAS DE OPERADORES LOGICOS O BOOLEANOS");
        boolean valor = (5 == 5); //operador de relacion,
        boolean valor_logico = ( (5 == 5) || (4 >= 3) );// "||" = or (v or v = v)
        boolean valor_logico_and = ( (5 == 5) & (4 >= 3) ); //  "&" = and (v and v = v)
        System.out.println("valor: " + valor );
        System.out.println("valor_logico: " + valor_logico);
        System.out.println("valor_logico_and: "+ valor_logico_and);
        System.out.println("negacion de valor_logico: "+ !valor_logico);
    }
}
