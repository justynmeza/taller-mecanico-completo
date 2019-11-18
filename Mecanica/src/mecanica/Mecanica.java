/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mecanica;

/**
 *
 * @author Ryzen 5
 */
public class Mecanica {

    private static Ventana formulario;
    private static Vehiculo vehiculoo[];
    private static int contador;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        formulario = new Ventana();
        vehiculoo = new Vehiculo[100];
        //arreglo para almacenar 0 - 99 vehiculos

        for (int i = 0; i < 100; i++) {
            vehiculoo[i] = new Vehiculo();
        }
        contador = 0;
        
        formulario.setVisible(true);
    }

    
    public static void Wardar(String p, String tv, String m, int am, String a, String pro, String u, String cr) {
        //creamos las variablesxd
        vehiculoo[contador].setPlaca(p);
        vehiculoo[contador].setTipoVehiculo(tv);
        vehiculoo[contador].setModelo(m);
        vehiculoo[contador].setAñoModelo(am);
        vehiculoo[contador].setAnomalia(a);
        vehiculoo[contador].setPropietario(pro);
        vehiculoo[contador].setUltimaAnomalia(u);
        vehiculoo[contador].setCiudadRegistro(cr);

        contador++;
    }

    public static void buscar(String bus) {
        //bus= varibale buscador

        for (int j = 0; j < vehiculoo.length; j++) {
            if (vehiculoo[j].getPlaca().equals(bus)) {
                formulario.cargardatos(vehiculoo[j]);
            }

        }

    }
}
