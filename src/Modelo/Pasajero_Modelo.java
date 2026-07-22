package Modelo;

public class Pasajero_Modelo {
    private String num_cedula = "";
    private String nombre_pasajero = "";

    public Pasajero_Modelo(String dato_cedula, String dato_nombre) {
        this.num_cedula = dato_cedula;
        this.nombre_pasajero = dato_nombre;
    }

    // Getters
    public String getNum_cedula() {
        return num_cedula;
    }

    public String getNombre_pasajero() {
        return nombre_pasajero;
    }

    // Setters
    public void setNum_cedula(String num_cedula) {
        this.num_cedula = num_cedula;
    }

    public void setNombre_pasajero(String nombre_pasajero) {
        this.nombre_pasajero = nombre_pasajero;
    }

    // Validaciones
    public boolean numeroPasajeroValidacion() {
        return num_cedula != null && num_cedula.matches("\\d+");
    }

    public boolean nombrePasajeroValidacion() {
        return nombre_pasajero != null && !nombre_pasajero.trim().isEmpty();
    }
}