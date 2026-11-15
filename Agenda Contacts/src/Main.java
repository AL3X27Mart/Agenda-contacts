import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== AGENDA DE CONTACTOS =====");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Mostrar contactos");
        System.out.println("4. Eliminar contacto");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has elegido: Añadir contacto");
                break;
            case 2:
                System.out.println("Has elegido: Buscar contacto");
                break;
            case 3:
                System.out.println("Has elegido: Mostrar contactos");
                break;
            case 4:
                System.out.println("Has elegido: Eliminar contacto");
                break;
            case 5:
                System.out.println("Saliendo de la agenda. ¡Hasta pronto!");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}