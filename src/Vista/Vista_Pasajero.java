package Vista;

import java.util.Scanner;

public class Vista_Pasajero {

    private Scanner scanner;

    public Vista_Pasajero() {
        this.scanner = new Scanner(System.in);
    }

    public String registrarCedulaPasajero() {
        System.out.print("Ingrese la cédula del pasajero: ");
        return this.scanner.nextLine();
    }

    public String registrarNombrePasajero() {
        System.out.print("Ingrese el nombre del pasajero: ");
        return this.scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}