package TiendaParking;

import Controlador.Chofer_Controller;
import Controlador.Pasajero_Controller;
import Controlador.Motor_Controller;
import Controlador.Carro_Controller;
import Controlador.Api_Controller;
import Vista.MenuPrincipal;

public class TiendaParking {

    public static void main(String[] args) {
        MenuPrincipal menu = new MenuPrincipal();

        // Instanciamos cada controlador por separado
        Chofer_Controller controlChofer = new Chofer_Controller();
        Pasajero_Controller controlPasajero = new Pasajero_Controller();
        Motor_Controller controlMotor = new Motor_Controller();
        Carro_Controller controlCarro = new Carro_Controller();
        Api_Controller controlApi = new Api_Controller();

        int opcion;

        do {
            opcion = menu.mostrarMenu();

            switch (opcion) {
                case 1:
                    controlChofer.gestionarChofer();
                    break;
                case 2:
                    controlPasajero.gestionarPasajero();
                    break;
                case 3:
                    controlMotor.gestionarMotor();
                    break;
                case 4:
                    controlCarro.gestionarCarro();
                    break;
                case 5:
                    controlApi.gestionarApi();
                    break;
                case 6:
                    System.out.println("\nSaliendo del sistema... ¡Hasta luego!");
                    break;
                default:
                    System.out.println("\nOpción inválida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }
}