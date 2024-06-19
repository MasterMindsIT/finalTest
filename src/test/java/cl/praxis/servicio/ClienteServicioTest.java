package cl.praxis.servicio;

import cl.praxis.modelo.CategoriaEnum;
import cl.praxis.modelo.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteServicioTest {
ClienteServicio clienteServicio = new ClienteServicio();
    @Test
    void agregarClienteTest() {
        Cliente cliente = new Cliente("23", "aa", "bb", "7", CategoriaEnum.Inactivo);
        assertTrue(clienteServicio.getListaClientes().isEmpty());
        clienteServicio.agregarCliente(cliente);
        assertTrue(clienteServicio.getListaClientes().size()>0);
    }
    @Test
    void agregarClienteNullTest() {
        Cliente cliente = null;
        clienteServicio.agregarCliente(cliente);
        assertTrue(clienteServicio.getListaClientes().size()>0);
    }
}