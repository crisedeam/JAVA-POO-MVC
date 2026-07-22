package Modelo;

public class Carro_Modelo {
    // 1. Atributos privados para un correcto encapsulamiento
    private String placa_carro;
    private String marca_carro;
    private String color_carro;

    // Constructor
    public Carro_Modelo(String dato_placa, String dato_marca, String dato_color) {
        this.placa_carro = dato_placa;
        this.marca_carro = dato_marca;
        this.color_carro = dato_color;
    }

    // Getters
    public String getPlaca_carro() {
        return placa_carro;
    }

    public String getMarca_carro() {
        return marca_carro;
    }

    public String getColor_carro() {
        return color_carro;
    }

    // Setters
    public void setPlaca_carro(String placa_carro) {
        this.placa_carro = placa_carro;
    }

    public void setMarca_carro(String marca_carro) {
        this.marca_carro = marca_carro;
    }

    public void setColor_carro(String color_carro) {
        this.color_carro = color_carro;
    }

    // Validaciones
    public boolean placaValidacion() {
        return placa_carro != null && !placa_carro.trim().isEmpty();
    }

    public boolean marcaValidacion() {
        return marca_carro != null && !marca_carro.trim().isEmpty();
    }

    public boolean colorValidacion() {
        return color_carro != null && !color_carro.trim().isEmpty();
    }
}