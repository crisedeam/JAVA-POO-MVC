package Controlador;

import Modelo.Pasajero_Modelo;
import Vista.Vista_Pasajero;

public class Pasajero_Controller {

    private Vista_Pasajero vista;

    public Pasajero_Controller() {
        this.vista = new Vista_Pasajero();
    }

    public void gestionarPasajero() {
        String datoCedula = this.vista.registrarCedulaPasajero();
        String datoNombre = this.vista.registrarNombrePasajero();

        Pasajero_Modelo pasajero = new Pasajero_Modelo(datoCedula, datoNombre);

        if (pasajero.numeroPasajeroValidacion() && pasajero.nombrePasajeroValidacion()) {
            this.vista.mostrarMensaje("\n¡Pasajero registrado y validado correctamente!");
            this.vista.mostrarMensaje("Cédula: " + pasajero.getNum_cedula());
            this.vista.mostrarMensaje("Nombre: " + pasajero.getNombre_pasajero());
        } else {
            this.vista.mostrarMensaje("\nError: Datos inválidos (la cédula debe contener solo números).");
        }
    }
}