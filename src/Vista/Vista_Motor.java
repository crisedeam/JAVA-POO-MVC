package Vista;

import java.util.Scanner;

public class Vista_Motor {

    private Scanner scanner;

    public Vista_Motor() {
        this.scanner = new Scanner(System.in);
    }

    public String registrarNumeroMotor() {
        System.out.print("Ingrese el número del motor: ");
        return this.scanner.nextLine();
    }

    public String registrarTipoMotor() {
        System.out.print("Ingrese el tipo de motor: ");
        return this.scanner.nextLine();
    }

    public String registrarCilindrajeMotor() {
        System.out.print("Ingrese el cilindraje del motor (solo números): ");
        return this.scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}