package dao;

import java.util.List;
import models.Cliente;

public interface ClienteDao {
    void insertarCliente(Cliente cliente);
    List<Cliente> listarClientes();
    Cliente obtenerCliente(Integer idCliente);
    void actualizarCliente(Cliente cliente);
    void eliminarCliente(Integer idCliente);
}
