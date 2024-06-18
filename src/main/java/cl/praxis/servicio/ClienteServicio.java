package cl.praxis.servicio;

import cl.praxis.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteServicio {
    List<Cliente> listaClientes;
    public ClienteServicio() {
        this.listaClientes = new ArrayList<>();
    }
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }


    public void retornolistarClientes(){

    }
    public void agregarCliente(Cliente cliente){
        this.listaClientes.add(cliente);
    }
    public void editarCliente(Cliente cliente){
        int position = -1;
        for (int i = 0; i < listaClientes.size(); i++) {
            if(listaClientes.get(i).equals(cliente)){
                position= i;
            }
        }
    }
}
