package Vista;

import java.util.Scanner;

public class Vista_Carro {

    private Scanner scanner;

    public Vista_Carro() {
        this.scanner = new Scanner(System.in);
    }

    public String registrarPlacaCarro() {
        System.out.print("Ingrese la placa del carro: ");
        return this.scanner.nextLine();
    }

    public String registrarMarcaCarro() {
        System.out.print("Ingrese la marca del carro: ");
        return this.scanner.nextLine();
    }

    public String registrarColorCarro() {
        System.out.print("Ingrese el color del carro: ");
        return this.scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}