package dao;

import java.util.List;
import models.Cliente;

public interface ClienteDao {
    void insertarCliente(Cliente cliente) throws Exception;
    List<Cliente> listarClientes() throws Exception;
    Cliente obtenerCliente(Integer idCliente) throws Exception;
    void actualizarCliente(Cliente cliente) throws Exception;
    void eliminarCliente(Integer idCliente) throws Exception;
}
