package Controlador;

import Modelo.Motor_modelo;
import Vista.Vista_Motor;

public class Motor_Controller {

    private Vista_Motor vista;

    public Motor_Controller() {
        this.vista = new Vista_Motor();
    }

    public void gestionarMotor() {
        String datoNumero = this.vista.registrarNumeroMotor();
        String datoTipo = this.vista.registrarTipoMotor();
        String datoCilindraje = this.vista.registrarCilindrajeMotor();

        Motor_modelo motor = new Motor_modelo(datoNumero, datoTipo, datoCilindraje);

        if (motor.motorValidacion() && motor.tipoValidacion() && motor.cilindrajeValidacion()) {
            this.vista.mostrarMensaje("\n¡Motor registrado y validado correctamente!");
            this.vista.mostrarMensaje("Número: " + motor.getNumero_motor());
            this.vista.mostrarMensaje("Tipo: " + motor.getTipo_motor());
            this.vista.mostrarMensaje("Cilindraje: " + motor.getCilindraje_motor());
        } else {
            this.vista.mostrarMensaje("\nError: Datos inválidos (el cilindraje debe contener solo números).");
        }
    }
}