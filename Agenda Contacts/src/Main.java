System.out.println("===== AGENDA DE CONTACTOS =====");
System.out.println("1. Añadir contacto");
System.out.println("2. Mostrar contactos");
System.out.println("3. Buscar contacto");
System.out.println("4. Salir");
System.out.print("Elige una opción: ");

int opcion = sc.nextInt();

switch (opcion) {
        case 1:
        System.out.println("Has seleccionado: Añadir contacto");
        break;
                case 2:
                System.out.println("Has seleccionado: Mostrar contactos");
        break;
                case 3:
                System.out.println("Has seleccionado: Buscar contacto");
        break;
                case 4:
                System.out.println("Has seleccionado: Salir");
        break;
default:
        System.out.println("Opción no válida");
}