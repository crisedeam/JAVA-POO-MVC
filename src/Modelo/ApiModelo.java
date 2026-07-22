package Modelo;

public class ApiModelo {

    private String clave = "";
    private String root = "";
    private String url = "";

    public ApiModelo(String url, String usuario, String clave) {
        this.url = url;
        this.root = usuario;
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean validarConexion() {
        return this.clave != null && this.clave.equals("1234");
    }

    public void desconexion() {
        System.out.println("Desconexión realizada...");
    }

    public void buscarChofer(String datoNombre) {
        System.out.println("Buscando chofer: " + datoNombre + ".....");
    }
}