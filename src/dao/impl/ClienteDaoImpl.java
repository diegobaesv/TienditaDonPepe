package dao.impl;

import config.DatabaseAccess;
import dao.ClienteDao;
import java.util.List;
import models.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ClienteDaoImpl implements ClienteDao {

    @Override
    public void insertarCliente(Cliente cliente) throws Exception {
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
            throw new Exception(e.toString());
        } finally {
            try {
                if(cn != null ){
                    cn.close();
                }
            } catch (Exception e) {
                System.out.println(e);
                throw new Exception(e.toString());
            }
        }
    }

    @Override
    public List<Cliente> listarClientes() throws Exception {
        Connection cn = null;
        List<Cliente> lista = null;
        try{
            cn = DatabaseAccess.getConnection();
            String sql = "SELECT id_cliente, tipo_documento, numero_documento, fecha_nacimiento, sexo, apellido_paterno, apellido_materno, nombres FROM clientes";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs =  pstm.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {                
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("id_cliente"));
                cliente.setTipoDocumento(rs.getString("tipo_documento"));
                cliente.setNumeroDocumento(rs.getString("numero_documento"));
                cliente.setNombres(rs.getString("nombres"));
                cliente.setApellidoPaterno(rs.getString("apellido_paterno"));
                cliente.setApellidoMaterno(rs.getString("apellido_materno"));
                cliente.setSexo(rs.getString("sexo"));
                cliente.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                lista.add(cliente);
            }
            
        } catch(Exception e) {
            System.out.println(e);
            lista = null;
            throw new Exception(e.toString());
        } finally {
            try {
                if(cn != null ){
                    cn.close();
                }
            } catch (Exception e) {
                System.out.println(e);
                throw new Exception(e.toString());
            }
        }
        return lista;
    }

    @Override
    public Cliente obtenerCliente(Integer idCliente) throws Exception {
        Connection cn = null;
        try{
            
        } catch(Exception e) {
            System.out.println(e);
            throw new Exception(e.toString());
        } finally {
            try {
                if(cn != null ){
                    cn.close();
                }
            } catch (Exception e) {
                System.out.println(e);
                throw new Exception(e.toString());
            }
        }
        return null;
    }

    @Override
    public void actualizarCliente(Cliente cliente) throws Exception {
        Connection cn = null;
        try{
            cn = DatabaseAccess.getConnection();
            cn.setAutoCommit(false);
            
            String sql = "UPDATE clientes SET tipo_documento = ?, numero_documento = ?, fecha_nacimiento = ?, sexo = ?, apellido_paterno = ?, apellido_materno = ?, nombres = ? WHERE id_cliente = ?";
            
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, cliente.getTipoDocumento());
            pstm.setString(2, cliente.getNumeroDocumento());
            pstm.setDate(3, cliente.getFechaNacimiento());
            pstm.setString(4, cliente.getSexo());
            pstm.setString(5, cliente.getApellidoPaterno());
            pstm.setString(6, cliente.getApellidoMaterno());
            pstm.setString(7, cliente.getNombres());
            pstm.setInt(8, cliente.getIdCliente());
            
            pstm.executeUpdate();
            cn.commit();
            
            pstm.close();
        } catch(Exception e) {
            System.out.println(e);
            throw new Exception(e.toString());
        } finally {
            try {
                if(cn != null ){
                    cn.close();
                }
            } catch (Exception e) {
                System.out.println(e);
                throw new Exception(e.toString());
            }
        }
    }

    @Override
    public void eliminarCliente(Integer idCliente) throws Exception {
        Connection cn = null;
        try{
            cn = DatabaseAccess.getConnection();
            cn.setAutoCommit(false);
            
            String sql = "DELETE FROM clientes WHERE id_cliente = ?";
            
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setInt(1, idCliente);
            
            pstm.executeUpdate();
            cn.commit();
            
            pstm.close();
           
        } catch(Exception e) {
            System.out.println(e);
            throw new Exception(e.toString());
        } finally {
            try {
                if(cn != null ){
                    cn.close();
                }
            } catch (Exception e) {
                System.out.println(e);
                throw new Exception(e.toString());
            }
        }
    }

    
}
