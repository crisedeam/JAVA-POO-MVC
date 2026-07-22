package Controlador;

import Modelo.Carro_Modelo;
import Vista.Vista_Carro;

public class Carro_Controller {

    private Vista_Carro vista;

    public Carro_Controller() {
        this.vista = new Vista_Carro();
    }

    public void gestionarCarro() {
        String datoPlaca = this.vista.registrarPlacaCarro();
        String datoMarca = this.vista.registrarMarcaCarro();
        String datoColor = this.vista.registrarColorCarro();

        Carro_Modelo carro = new Carro_Modelo(datoPlaca, datoMarca, datoColor);

        if (carro.placaValidacion() && carro.marcaValidacion() && carro.colorValidacion()) {
            this.vista.mostrarMensaje("\n¡Carro registrado y validado correctamente!");
            this.vista.mostrarMensaje("Placa: " + carro.getPlaca_carro());
            this.vista.mostrarMensaje("Marca: " + carro.getMarca_carro());
            this.vista.mostrarMensaje("Color: " + carro.getColor_carro());
        } else {
            this.vista.mostrarMensaje("\nError: Datos inválidos o campos vacíos en el carro.");
        }
    }
}