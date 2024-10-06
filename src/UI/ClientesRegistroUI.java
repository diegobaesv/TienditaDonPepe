/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import dao.ClienteDao;
import dao.impl.ClienteDaoImpl;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import models.Cliente;
import utils.AlertUtil;
import utils.Util;

/**
 *
 * @author Alumno
 */
public class ClientesRegistroUI extends javax.swing.JInternalFrame {
    
    private ClienteDao clienteDao;
    private Cliente cliente;
    
    public ClientesRegistroUI(){
        this(null);
    }
    
    public ClientesRegistroUI(Cliente cliente) {
        initComponents();
        this.cliente = cliente;
        clienteDao = new ClienteDaoImpl();
        initConfig();
        initData();
    }
    
    private void initConfig(){
        this.setClosable(true);
        this.setTitle(this.cliente == null ? "Registro de Clientes" : "Actualizacion de Cliente");
    }
    
    private void initData(){
        if(cliente != null){
            txtNombres.setText(cliente.getNombres());
            txtApellidoPaterno.setText(cliente.getApellidoPaterno());
            txtApellidoMaterno.setText(cliente.getApellidoMaterno());
            txtNumeroDocumento.setText(cliente.getNumeroDocumento());
            txtFechaNacimiento.setText(cliente.getFechaNacimiento()==null ? "":(cliente.getFechaNacimiento()+""));
            cbTipoDocumento.setSelectedIndex(getIndexTipoDocumento(cliente.getTipoDocumento()));
            if("F".equals(cliente.getSexo())){
                rbgSexo.setSelected(rbSexoFemenino.getModel(), true);
            } else if("M".equals(cliente.getSexo())){
                rbgSexo.setSelected(rbSexoMasculino.getModel(), true);
            }
            
        }
    }
    
    private int getIndexTipoDocumento(String tipoDocumento){
        switch (tipoDocumento) {
            case "D":
                return 0;
            case "C":
                return 1;
            case "R":
                return 2;
            default:
                return 0;
        }
    }
    
    private String getTipoDocumentoDB(){
        return cbTipoDocumento.getSelectedItem().toString().charAt(0)+"";
    }
    
    private String getSexoDB() {
        System.out.println("Voy a leer todos los botones de rbg");
        for (Enumeration<AbstractButton> buttons = rbgSexo.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            System.out.println(button.getText()+" es seleccionado???");
            if (button.isSelected()) {
                System.out.println("SIIIII");
                return button.getText().charAt(0)+"";
            }else{
                System.out.println("NOOOO");
            }
        }
        return null;
    }
    
    private boolean validarRegistro(){
        int cantidadErrores = 0;
        String nroDoc = txtNumeroDocumento.getText();
        switch (getTipoDocumentoDB()) {
            case "D":
                if(nroDoc.length() != 8){
                    cantidadErrores++;
                }
                break;
            case "C":
                if(nroDoc.length() < 9 || nroDoc.length() > 12) {
                    cantidadErrores++;
                }
                break;
            case "R":
                if(nroDoc.length() != 11) {
                    cantidadErrores++;
                }
                break;
        }
        
        if(txtApellidoPaterno.getText().length()<2 || !Util.isOnlyLetters(txtApellidoPaterno.getText())){
            cantidadErrores++;
        }
        
        if(txtNombres.getText().length()<2 || !Util.isOnlyLetters(txtNombres.getText())){
            cantidadErrores++;
        }
        
        if(!txtApellidoMaterno.getText().isEmpty() &&  !Util.isOnlyLetters(txtApellidoMaterno.getText())){
            cantidadErrores++;
        }
        
        if(!txtFechaNacimiento.getText().isEmpty() && !Util.isValidDate(txtFechaNacimiento.getText())){
            cantidadErrores++;
        }
        
        return cantidadErrores == 0;
    }
    
    private void limpiarFormulario(){
        txtNumeroDocumento.setText("");
        txtApellidoPaterno.setText("");
        txtApellidoMaterno.setText("");
        txtNombres.setText("");
        txtFechaNacimiento.setText("");
        rbgSexo.clearSelection();
        cbTipoDocumento.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbTipoDocumento = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroDocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        rbSexoMasculino = new javax.swing.JRadioButton();
        rbSexoFemenino = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));

        jLabel1.setText("*Tipo documento");

        cbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "CE", "RUC" }));

        jLabel2.setText("*Número documento");

        jLabel3.setText("*Apellido Paterno");

        jLabel4.setText("Apellido Materno");

        jLabel5.setText("*Nombres");

        jLabel6.setText("Fecha Nacimiento [yyyy-MM-dd]");

        jLabel7.setText("Sexo");

        rbgSexo.add(rbSexoMasculino);
        rbSexoMasculino.setText("Masculino");
        rbSexoMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSexoMasculinoActionPerformed(evt);
            }
        });

        rbgSexo.add(rbSexoFemenino);
        rbSexoFemenino.setText("Femenino");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbTipoDocumento, javax.swing.GroupLayout.Alignment.LEADING, 0, 130, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtFechaNacimiento)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 24, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbSexoMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbSexoFemenino))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbSexoMasculino)
                            .addComponent(rbSexoFemenino))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       limpiarFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if(validarRegistro()){
                if(this.cliente == null){
                    Cliente newCliente = new Cliente();
                    newCliente.setTipoDocumento(getTipoDocumentoDB());
                    newCliente.setNumeroDocumento(txtNumeroDocumento.getText());
                    newCliente.setSexo(getSexoDB());
                    newCliente.setFechaNacimiento(txtFechaNacimiento.getText().isEmpty() ? null : Date.valueOf(txtFechaNacimiento.getText()));
                    newCliente.setApellidoPaterno(txtApellidoPaterno.getText());
                    newCliente.setApellidoMaterno(txtApellidoMaterno.getText().isEmpty() ? null : txtApellidoMaterno.getText());
                    newCliente.setNombres(txtNombres.getText());
                    clienteDao.insertarCliente(newCliente);
                    AlertUtil.showInfo("Se ha registrado correctamente!");
                    limpiarFormulario();
                }else{
                    cliente.setTipoDocumento(getTipoDocumentoDB());
                    cliente.setNumeroDocumento(txtNumeroDocumento.getText());
                    cliente.setSexo(getSexoDB());
                    cliente.setFechaNacimiento(txtFechaNacimiento.getText().isEmpty() ? null : Date.valueOf(txtFechaNacimiento.getText()));
                    cliente.setApellidoPaterno(txtApellidoPaterno.getText());
                    cliente.setApellidoMaterno(txtApellidoMaterno.getText().isEmpty() ? null : txtApellidoMaterno.getText());
                    cliente.setNombres(txtNombres.getText());
                    clienteDao.actualizarCliente(cliente);
                    AlertUtil.showInfo("Se ha actualizado correctamente!");
                }
            } else {
                AlertUtil.showWarning("Debe ingresar correctamente los campos");
            }
            
        } catch (Exception e) {
            System.out.println(e);
            AlertUtil.showError(e.toString());
        }
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void rbSexoMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSexoMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSexoMasculinoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbSexoFemenino;
    private javax.swing.JRadioButton rbSexoMasculino;
    private javax.swing.ButtonGroup rbgSexo;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JFormattedTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumeroDocumento;
    // End of variables declaration//GEN-END:variables
}
