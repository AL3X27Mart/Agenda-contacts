import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== AGENDA DE CONTACTOS =====");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Mostrar contactos");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");

        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("Has seleccionado: Añadir contacto");
        } else if (opcion == 2) {
            System.out.println("Has seleccionado: Mostrar contactos");
        } else if (opcion == 3) {
            System.out.println("Has seleccionado: Buscar contacto");
        } else if (opcion == 4) {
            System.out.println("Has seleccionado: Salir");
        } else {
            System.out.println("Opción no válida");
        }
    }
}




