package dao.impl;

import config.DatabaseAccess;
import dao.ClienteDao;
import java.util.List;
import models.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import utils.AlertUtil;

public class ClienteDaoImpl implements ClienteDao {

    @Override
    public void insertarCliente(Cliente cliente) {
        Connection cn = null;
        try{
            cn = DatabaseAccess.getConnection();
            cn.setAutoCommit(false);
            
            String sql = "INSERT INTO clientes (tipo_documento, numero_documento, fecha_nacimiento, sexo, apellido_paterno, apellido_materno, nombres) VALUES (?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, cliente.getTipoDocumento());
            pstm.setString(2, cliente.getNumeroDocumento());
            pstm.setDate(3, cliente.getFechaNacimiento());
            pstm.setString(4, cliente.getSexo());
            pstm.setString(5, cliente.getApellidoPaterno());
            pstm.setString(6, cliente.getApellidoMaterno());
            pstm.setString(7, cliente.getNombres());
            
            pstm.executeUpdate();
            cn.commit();
            
            pstm.close();
                       
        } catch(Exception e) {
            System.out.println(e);
            AlertUtil.showError(e.getMessage());
        } finally {
            try {
                if(cn != null ){
                    cn.close();
                }
            } catch (Exception e) {
                System.out.println(e);
                AlertUtil.showError(e.getMessage());
            }
        }
    }

    @Override
    public List<Cliente> listarClientes() {
        Connection cn = null;
        try{
            
        } catch(Exception e) {
            System.out.println(e);
            AlertUtil.showError(e.getMessage());
        } finally {
            try {
                if(cn != null ){
                    cn.close();
                }
            } catch (Exception e) {
                System.out.println(e);
                AlertUtil.showError(e.getMessage());
            }
        }
        return null;
    }

    @Override
    public Cliente obtenerCliente(Integer idCliente) {
        Connection cn = null;
        try{
            
        } catch(Exception e) {
            System.out.println(e);
            AlertUtil.showError(e.getMessage());
        } finally {
            try {
                if(cn != null ){
                    cn.close();
                }
            } catch (Exception e) {
                System.out.println(e);
                AlertUtil.showError(e.getMessage());
            }
        }
        return null;
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        Connection cn = null;
        try{
            
        } catch(Exception e) {
            System.out.println(e);
            AlertUtil.showError(e.getMessage());
        } finally {
            try {
                if(cn != null ){
                    cn.close();
                }
            } catch (Exception e) {
                System.out.println(e);
                AlertUtil.showError(e.getMessage());
            }
        }
    }

    @Override
    public void eliminarCliente(Integer idCliente) {
        Connection cn = null;
        try{
            
        } catch(Exception e) {
            System.out.println(e);
            AlertUtil.showError(e.getMessage());
        } finally {
            try {
                if(cn != null ){
                    cn.close();
                }
            } catch (Exception e) {
                System.out.println(e);
                AlertUtil.showError(e.getMessage());
            }
        }
    }

    
}
