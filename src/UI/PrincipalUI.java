/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
/**
 *
 * @author dfbaes
 */
public class PrincipalUI extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalUI
     */
    public PrincipalUI() {
        initComponents();
        initConfig();
    }
    
    private void initConfig(){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("PRINCIPAL - TIENDITA DE DON PEPE");
    }
    
    public static void addToPanelDesktop(JInternalFrame jInternalFrame){
        if(pnlDesktop != null){
            pnlDesktop.add(jInternalFrame);
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniClienteRegistro = new javax.swing.JMenuItem();
        mniClienteListar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mniProductoRegistro = new javax.swing.JMenuItem();
        mniProductoListar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mniVentaNueva = new javax.swing.JMenuItem();
        mniVentaHistorial = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mniReporteVenta = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mniAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnlDesktopLayout = new javax.swing.GroupLayout(pnlDesktop);
        pnlDesktop.setLayout(pnlDesktopLayout);
        pnlDesktopLayout.setHorizontalGroup(
            pnlDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 991, Short.MAX_VALUE)
        );
        pnlDesktopLayout.setVerticalGroup(
            pnlDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-archivo-24.png"))); // NOI18N
        jMenu1.setText("Archivo");

        mniSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-cerrar-ventana-24.png"))); // NOI18N
        mniSalir.setText("Salir");
        jMenu1.add(mniSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-clientes-24.png"))); // NOI18N
        jMenu2.setText("Clientes");

        mniClienteRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-registro-24.png"))); // NOI18N
        mniClienteRegistro.setText("Registro Cliente");
        mniClienteRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClienteRegistroActionPerformed(evt);
            }
        });
        jMenu2.add(mniClienteRegistro);

        mniClienteListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-lista-24.png"))); // NOI18N
        mniClienteListar.setText("Listar Clientes");
        mniClienteListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClienteListarActionPerformed(evt);
            }
        });
        jMenu2.add(mniClienteListar);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-productos-24.png"))); // NOI18N
        jMenu3.setText("Productos");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        mniProductoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-registro-24.png"))); // NOI18N
        mniProductoRegistro.setText("Registro Producto");
        mniProductoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniProductoRegistroActionPerformed(evt);
            }
        });
        jMenu3.add(mniProductoRegistro);

        mniProductoListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-lista-24.png"))); // NOI18N
        mniProductoListar.setText("Listar Productos");
        mniProductoListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniProductoListarActionPerformed(evt);
            }
        });
        jMenu3.add(mniProductoListar);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-ventas-24.png"))); // NOI18N
        jMenu4.setText("Ventas");

        mniVentaNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-ventas-24.png"))); // NOI18N
        mniVentaNueva.setText("Nueva Venta");
        mniVentaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniVentaNuevaActionPerformed(evt);
            }
        });
        jMenu4.add(mniVentaNueva);

        mniVentaHistorial.setText("Historial Ventas");
        mniVentaHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniVentaHistorialActionPerformed(evt);
            }
        });
        jMenu4.add(mniVentaHistorial);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-pdf-24.png"))); // NOI18N
        jMenu5.setText("Reportes");

        mniReporteVenta.setText("Reporte de Ventas");
        mniReporteVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniReporteVentaActionPerformed(evt);
            }
        });
        jMenu5.add(mniReporteVenta);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-ayuda-24.png"))); // NOI18N
        jMenu6.setText("Ayuda");

        mniAcercaDe.setText("Acerca de");
        mniAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAcercaDeActionPerformed(evt);
            }
        });
        jMenu6.add(mniAcercaDe);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDesktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDesktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniClienteRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClienteRegistroActionPerformed
        ClientesRegistroUI clientesRegistroUI = new ClientesRegistroUI();
        clientesRegistroUI.setVisible(true);
        clientesRegistroUI.setClosable(true);
        pnlDesktop.add(clientesRegistroUI);
    }//GEN-LAST:event_mniClienteRegistroActionPerformed

    private void mniClienteListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClienteListarActionPerformed
        ClientesListarUI clientesListarUI = new ClientesListarUI();
        clientesListarUI.setVisible(true);
        pnlDesktop.add(clientesListarUI);
    }//GEN-LAST:event_mniClienteListarActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void mniProductoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniProductoRegistroActionPerformed
        ProductosRegistroUI productosRegistroUI = new ProductosRegistroUI();
        productosRegistroUI.setVisible(true);
        pnlDesktop.add(productosRegistroUI);
    }//GEN-LAST:event_mniProductoRegistroActionPerformed

    private void mniProductoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniProductoListarActionPerformed
        ProductosListarUI productosListarUI = new ProductosListarUI();
        productosListarUI.setVisible(true);
        pnlDesktop.add(productosListarUI);
    }//GEN-LAST:event_mniProductoListarActionPerformed

    private void mniVentaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVentaNuevaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniVentaNuevaActionPerformed

    private void mniVentaHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVentaHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniVentaHistorialActionPerformed

    private void mniReporteVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniReporteVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniReporteVentaActionPerformed

    private void mniAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAcercaDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniAcercaDeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniAcercaDe;
    private javax.swing.JMenuItem mniClienteListar;
    private javax.swing.JMenuItem mniClienteRegistro;
    private javax.swing.JMenuItem mniProductoListar;
    private javax.swing.JMenuItem mniProductoRegistro;
    private javax.swing.JMenuItem mniReporteVenta;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenuItem mniVentaHistorial;
    private javax.swing.JMenuItem mniVentaNueva;
    private static javax.swing.JDesktopPane pnlDesktop;
    // End of variables declaration//GEN-END:variables
}
