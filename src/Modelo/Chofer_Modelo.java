package Modelo;

public class Chofer_Modelo {
    public String nombre_chofer = "";
    String licencia_chofer ="";
    String cedula_chofer ="";

    public  Chofer_Modelo(String dato_nombre, String dato_licencia, String dato_cedula){
    this.nombre_chofer = dato_nombre;
    this.licencia_chofer = dato_licencia;
    this.cedula_chofer = dato_cedula;
    }
    public String getNombre_chofer(){return getNombre_chofer();}

    public String getLicencia_chofer(){return getLicencia_chofer();}

    public String getCedula_chofer(){return getCedula_chofer();}

    //Setters

    public void setNombre_chofer(String nombre_chofer){this.getNombre_chofer();}
    public void setLicencia_chofer(String licencia_chofer){this.getLicencia_chofer();}
    public void setCedula_chofer(String cedula_chofer){this.getCedula_chofer();}
        }