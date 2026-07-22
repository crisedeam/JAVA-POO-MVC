package Modelo;

public class Chofer_Modelo {
    public String nombre_chofer = "";
    String licencia_chofer = "";
    String cedula_chofer = "";

    public Chofer_Modelo(String dato_nombre, String dato_licencia, String dato_cedula) {
        this.nombre_chofer = dato_nombre;
        this.licencia_chofer = dato_licencia;
        this.cedula_chofer = dato_cedula;
    }

    public String getNombre_chofer() {
        return nombre_chofer;
    }

    public String getLicencia_chofer() {
        return licencia_chofer;
    }

    public String getCedula_chofer() {
        return cedula_chofer;
    }

    //Setters

    public void setNombre_chofer(String nombre_chofer) {
        this.nombre_chofer = nombre_chofer;
    }

    public void setLicencia_chofer(String licencia_chofer) {
        this.licencia_chofer = licencia_chofer;
    }

    public void setCedula_chofer(String cedula_chofer) {
        this.cedula_chofer = cedula_chofer;
    }

    //validacion

    public boolean NombreValidacion() {
        return nombre_chofer !=null && !nombre_chofer.trim().isEmpty();
    }

    public boolean LicenciaValidacion() {
        return licencia_chofer !=null && !licencia_chofer.trim().isEmpty();
    }


    public boolean CedulaValidacion() {
        return cedula_chofer !=null && !cedula_chofer.trim().isEmpty();
    }
}