package Vista;

import java.util.Scanner;

public class MenuPrincipal {

    private Scanner scanner;

    public MenuPrincipal() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n============================");
        System.out.println("   SISTEMA TIENDA PARKING   ");
        System.out.println("============================");
        System.out.println("1. Gestionar Chofer");
        System.out.println("2. Gestionar Pasajero");
        System.out.println("3. Gestionar Motor");
        System.out.println("4. Gestionar Carro");
        System.out.println("5. Conectar y buscar en API");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");

        while (!this.scanner.hasNextInt()) {
            System.out.print("Por favor, ingrese un número válido: ");
            this.scanner.next();
        }

        int opcion = this.scanner.nextInt();
        this.scanner.nextLine(); // Limpiar el buffer
        return opcion;
    }
}