/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import dao.ClienteDao;
import dao.impl.ClienteDaoImpl;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Cliente;
import utils.AlertUtil;

/**
 *
 * @author dfbaes
 */
public class ClientesListarUI extends javax.swing.JInternalFrame {

    ClienteDao clienteDao;
    DefaultTableModel model;
    List<Cliente> clientes = null;
    
    public ClientesListarUI() {
        clienteDao = new ClienteDaoImpl();
        initComponents();
        initConfig();
        model = (DefaultTableModel)tblClientes.getModel();
        cargarClientes();
        
    }
    
    private void initConfig(){
        this.setClosable(true);
        this.setTitle("Listado de Clientes");
    }
    
    private String getTipoDocumentoView(String tipoDocumento){
        switch (tipoDocumento) {
            case "D":
                return "DNI";
            case "C":
                return "CE";
            case "R":
                return "RUC";
            default:
                return "-";
        }
    }
    
    private String getSexoView(String sexo){
        if(sexo == null) return "";
        switch (sexo) {
            case "M":
                return "Masculino";
            case "F":
                return "Femenino";
            default:
                return "";
        }
    }
    
    private void cargarClientes(){
        try {
            clientes = clienteDao.listarClientes();
            while(model.getRowCount() > 0) {
                model.removeRow(0);
            }
            for (Cliente cliente : clientes) {
                model.addRow(new Object[]{
                    cliente.getIdCliente(),
                    getTipoDocumentoView(cliente.getTipoDocumento()),
                    cliente.getNumeroDocumento(),
                    cliente.getApellidoPaterno(),
                    cliente.getApellidoMaterno(),
                    cliente.getNombres(),
                    cliente.getFechaNacimiento(),
                    getSexoView(cliente.getSexo())
                });
            }
            lblTotalRegistros.setText(model.getRowCount()+"");
        } catch (Exception e) {
            AlertUtil.showError(e.toString());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        lblTotalRegistros = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnRecargar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        jLabel8.setText("Total de registros:");

        lblTotalRegistros.setText("0");

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Cliente", "Tipo Doc", "Nro Doc", "Ap. Paterno", "Ap. Materno", "Nombres", "Fec. Nacimento", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        btnRecargar.setText("Recargar");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRecargar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblTotalRegistros)
                    .addComponent(btnRecargar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        cargarClientes();
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tblClientes.getSelectedRow();
        if(filaSeleccionada!=-1){
            try {
                if(AlertUtil.showQuestion("¿Deseas eliminar el cliente?")){
                    Cliente cliente = clientes.get(filaSeleccionada);
                    clienteDao.eliminarCliente(cliente.getIdCliente());
                    cargarClientes();
                    AlertUtil.showInfo("Cliente eliminado con exito!");
                }
            } catch (Exception e) {
                AlertUtil.showError(e.toString());
            }
            
        }else{
            AlertUtil.showWarning("Debe seleccionar una fila");
        }
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int filaSeleccionada = tblClientes.getSelectedRow();
        if(filaSeleccionada!=-1){
            Cliente cliente = clientes.get(filaSeleccionada);
            ClientesRegistroUI clientesRegistroUI = new ClientesRegistroUI(cliente);
            clientesRegistroUI.setVisible(true);
            clientesRegistroUI.setClosable(true);
            PrincipalUI.addToPanelDesktop(clientesRegistroUI);
        }else{
            AlertUtil.showWarning("Debe seleccionar una fila");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalRegistros;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}
