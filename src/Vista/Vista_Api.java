package Vista;

import java.util.Scanner;

public class Vista_Api {

    private Scanner scanner;

    public Vista_Api() {
        this.scanner = new Scanner(System.in);
    }

    public String solicitarUrl() {
        System.out.print("Ingrese la URL de la API: ");
        return this.scanner.nextLine();
    }

    public String solicitarUsuario() {
        System.out.print("Ingrese el usuario: ");
        return this.scanner.nextLine();
    }

    public String solicitarClave() {
        System.out.print("Ingrese la clave: ");
        return this.scanner.nextLine();
    }

    public String solicitarNombreBusqueda() {
        System.out.print("Ingrese el nombre del chofer a buscar en la API: ");
        return this.scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}