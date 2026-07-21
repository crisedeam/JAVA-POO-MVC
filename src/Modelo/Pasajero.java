package Modelo;

public class Pasajero {
    public String num_cedula="";
    String nombre_pasajero="";

    public Pasajero(String dato_cedula, String dato_nombre){
        this.num_cedula = dato_cedula;
        this.nombre_pasajero = dato_nombre;
    }
    public String getNum_cedula(){return getNum_cedula();}

    public String getNombre_pasajero(){return getNombre_pasajero();}

    //setters

    public void setNum_cedula(){this.getNum_cedula();}

    public void setNombre_pasajero(){this.getNombre_pasajero();}
}
