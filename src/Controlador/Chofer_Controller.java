package Controlador;

import Modelo.Chofer_Modelo;
import Vista.Vista_Chofer;

public class Chofer_Controller {

    private Vista_Chofer vista;

    public Chofer_Controller() {
        this.vista = new Vista_Chofer();
    }

    public void gestionarChofer() {
        String datoNombre = this.vista.registrarNombreChofer();
        String datoCedula = this.vista.registrarCedulaChofer();
        String datoLicencia = this.vista.registrarLicenciaChofer();

        Chofer_Modelo chofer = new Chofer_Modelo(datoNombre, datoLicencia, datoCedula);

        if (chofer.NombreValidacion() && chofer.CedulaValidacion() && chofer.LicenciaValidacion()) {
            this.vista.mostrarMensaje("\n¡Chofer registrado y validado correctamente!");
            this.vista.mostrarMensaje("Nombre: " + chofer.getNombre_chofer());
            this.vista.mostrarMensaje("Cédula: " + chofer.getCedula_chofer());
            this.vista.mostrarMensaje("Licencia: " + chofer.getLicencia_chofer());
        } else {
            this.vista.mostrarMensaje("\nError: Datos inválidos o campos vacíos en el chofer.");
        }
    }
}