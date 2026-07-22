package Modelo;

public class Motor_modelo {
    public String numero_motor ="";
    String tipo_motor;
    String cilindraje_motor;
    //Contructor
    public Motor_modelo(String dato_numero, String dato_tipo, String dato_cilindraje){
        this.numero_motor=dato_numero;
        this.tipo_motor=dato_tipo;
        this.cilindraje_motor=dato_cilindraje;
    }
        //Getters
    public String getNumero_motor(){return getNumero_motor();}
    public String getTipo_motor(){return getTipo_motor();}
    public String getCilindraje_motor(){return getCilindraje_motor();}

        //Setters
    public void setNumero_motor(){this.getNumero_motor();}
    public void setTipo_motor(){this.getTipo_motor();}
    public void setCilindraje_motor(){this.getCilindraje_motor();}

    //Validacion
    private boolean MotorValidacion() {
        return !numero_motor.equals("");
    }
    private boolean TipoValidacion(){
        return !tipo_motor.equals("");
        }

    private boolean CilindrajeValidacion(){
        return cilindraje_motor.matches("\\d+") && !cilindraje_motor.equals("");
    }
}

