package cl.praxis.vista;

import cl.praxis.servicio.ArchivoServicio;
import cl.praxis.servicio.ClienteServicio;
import cl.praxis.servicio.ExportadorCSV;
import cl.praxis.servicio.ExportadorTXT;
import cl.praxis.utilidades.Utilidad;

import java.util.Scanner;

public class Menu {
    ClienteServicio clienteServicio = new ClienteServicio();
    ArchivoServicio archivoServicio = new ArchivoServicio();
    ExportadorTXT exportadorTXT = new ExportadorTXT();
    ExportadorCSV exportadorCSV = new ExportadorCSV();
    String fileName = "Clientes";
    String fileName1 = "DBClientes.csv";
    Scanner sc = new Scanner(System.in);
    Utilidad utilidad = new Utilidad();
    public void menuPrincipal(){
        System.out.println("1. Listar Clientes");
        System.out.println("2. Agregar Cliente");
        System.out.println("3. Editar Cliente");
        System.out.println("4. Cargar Datos");
        System.out.println("5. Exportar Datos");
        System.out.println("6. Salir");
    }

    public void menuEditarCliente(){
        System.out.println("Seleccione qué desea hacer:");
        System.out.println("1.-Cambiar el estado del Cliente");
        System.out.println("2.-Editar los datos ingresados del Cliente");
        System.out.println("3.-Salir");
    }
    public void iniciarMenu(){
        boolean salirPPAL = false;

        int op =0;
        do {
            menuPrincipal();
            op = accion();
            if(op==1){
                clienteServicio.getListaClientes().forEach(System.out::println);
            } else if (op==2) {
                clienteServicio.agregarCliente(utilidad.crearCliente());
            }else if (op==3) {

            }else if (op==4) {
                archivoServicio.exportar(fileName1,clienteServicio.getListaClientes());
            }else if (op==5) {

            }else if (op==6) {
                salirPPAL = true;
            }

        }while (!salirPPAL);
    }
    public int accion(){
        utilidad.mostrarMensaje("Ingrese la opción numérica: ");
        return sc.nextInt();
    }
}
