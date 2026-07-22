package Vista;

import java.util.Scanner;

public class Vista_Chofer {

    private Scanner scanner;

    public Vista_Chofer() {
        this.scanner = new Scanner(System.in);
    }

    public String registrarNombreChofer() {
        System.out.print("Ingrese el nombre del chofer: ");
        return this.scanner.nextLine();
    }

    public String registrarCedulaChofer() {
        System.out.print("Ingrese la cédula del chofer (solo números): ");
        return this.scanner.nextLine();
    }

    public String registrarLicenciaChofer() {
        System.out.print("Ingrese la licencia del chofer: ");
        return this.scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}