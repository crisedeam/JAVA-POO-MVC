package Controlador;

import Modelo.ApiModelo;
import Vista.Vista_Api;

public class Api_Controller {

    private Vista_Api vista;

    public Api_Controller() {
        this.vista = new Vista_Api();
    }

    public void gestionarApi() {
        String url = this.vista.solicitarUrl();
        String usuario = this.vista.solicitarUsuario();
        String clave = this.vista.solicitarClave();

        ApiModelo api = new ApiModelo(url, usuario, clave);

        if (api.validarConexion()) {
            this.vista.mostrarMensaje("\n¡Conexión establecida con éxito!");
            String nombreBusqueda = this.vista.solicitarNombreBusqueda();
            api.buscarChofer(nombreBusqueda);
            api.desconexion();
        } else {
            this.vista.mostrarMensaje("\nError de autenticación: Clave incorrecta.");
        }
    }
}