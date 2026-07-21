package Controlador;

import Modelo.Chofer_Modelo;
import Vista.Vista_Chofer;

public class General_Controller {

    public Vista_Chofer obj_vista;

    public General_Controller(Vista_Chofer obj_vista) {
        this.obj_vista = obj_vista;
    }

    public void procesar_datos() {
        // Usamos los nombres exactos definidos en Vista_Chofer
        String dato_nombre = this.obj_vista.registrarNombreChofer();
        String dato_cedula = this.obj_vista.registrarCedulaChofer();
        String dato_licencia = this.obj_vista.registrarLicenciaChofer();

        Chofer_Modelo obj_chofer = new Chofer_Modelo(
                dato_nombre,
                dato_licencia,
                dato_cedula);
    }
}