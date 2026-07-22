
package Modelo;

public class Carro_Modelo {
    public String placa_carro = "";
    String marca_carro = "";
    String color_carro = "";

    public Carro_Modelo(String dato_placa, String dato_marca, String dato_color) {
        this.placa_carro = dato_placa;
        this.marca_carro = dato_marca;
        this.color_carro = dato_color;
    }
   //getters
    public String getPlaca_carro() {
        return getPlaca_carro();
    }

    public String getMarca_carro() {
        return getMarca_carro();
    }

    public String getColor_carro() {
        return getColor_carro();
    }
    //Setters
    public void setPlaca_carro(String placa_carro) {
        this.getPlaca_carro();
    }

    public void setMarca_carro(String marca_carro) {
        this.getMarca_carro();
    }

    public void setColor_carro(String color_carro) {
        this.getColor_carro();
    }


    //validacion


    private boolean PlacaValidacion(){
        return !placa_carro.equals("");
    }

    private boolean MarcaValidacion(){
        return !marca_carro.equals("");
    }

    private boolean ColorValidacion(){
        return !color_carro.equals("");
    }
}