package Vista;

import java.util.Scanner;


public class Vista_Chofer {

    private Scanner teclado = new Scanner(System.in);

    public String registrarNombreChofer(){

        System.out.println("Ingrese su nombre:");
        return teclado.nextLine();

    }

    public String registrarCedulaChofer(){

        System.out.println("Ingrese su cedula: ");
        return teclado.nextLine();

    }

    public String registrarLicenciaChofer(){

        System.out.println("Ingrese su licencia: ");
        return teclado.nextLine();

    }

}