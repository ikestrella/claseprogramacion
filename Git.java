public class Git {
    public static void main(String[] args) {
        System.out.println("git init: Con este comando de git se crea un nuevo repositorio o solo para iniciar un repositorio vacio");
        System.out.println("git add: Mediante este comando se pasan archivos cambiados, o cualquier tipo de archivo");
        System.out.println("git commit -m \"first commit\": Con este comando se confirma de manera instantenea los archivos que queremos pasar al repositorio");
        System.out.println("git branch -M main: Se crea una linea de desarrollo principal, y adicionalmente se pueden añadir ramas para asi poder trabajar en otra funcion ");
        System.out.println("git push -u origin main: se usa este comando para cargar los archivos al repositorio");
        System.out.println("git config --global user.email: sirve para asociar una cuenta de email con git ");
        System.out.println("git user.name ikestrella: sirve para crear un usuario, con estos comandos sera posible enviar los archivos a git");
        System.out.println("git remote add origin: se lo utiliza despues de haber asociado la cuenta de email, y asi poder añadir archivos al repositorio de git ");
    }
}
