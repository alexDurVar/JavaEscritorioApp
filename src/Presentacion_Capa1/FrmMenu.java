/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion_Capa1;

import java.awt.Dimension;

/**
 *
 * @author Telyman
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        this.setExtendedState(FrmMenu.MAXIMIZED_BOTH); //PARA QUE SE VEA EN TODA LA PANTALLA
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 728, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jMenu1.setText("Mantenimiento");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Proveedor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Productos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Trabajador");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator1);

        jMenuItem8.setText("Encabezado Factura");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("Detalle Factura");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Orden de compra");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Crear orden de compra");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Devoluciones de Ventas");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setText("Crear Devolución de Ventas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Facturar");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setText("Crear Factura");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ventas por Vendedor");

        jMenuItem10.setText("Consultar las ventas por vendedor");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        //dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        FrmCliente frm = new FrmCliente();
        Escritorio.add(frm);
        
        Dimension siseCont = Escritorio.getSize();
        
        Dimension sizeFrmCliente = frm.getSize();
        
        frm.setLocation(((int) siseCont.getWidth()-(int)sizeFrmCliente.getWidth())/2, (int) siseCont.getHeight() - ((int) sizeFrmCliente.getHeight())/2 );
        
        frm.toFront();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
//         FrmClientes frm = new FrmClientes();
//        Escritorio.add(frm);
//        
//        Dimension siseCont = Escritorio.getSize();
//        
//        Dimension sizeFrmCliente = frm.getSize();
//        
//        frm.setLocation(((int) siseCont.getWidth()-(int)sizeFrmCliente.getWidth())/2, (int) siseCont.getHeight() - ((int) sizeFrmCliente.getHeight())/2 );
//        
//        frm.toFront();
//        frm.setVisible(true);
//        
        
        
        
        FrmCliente formularioInterno = new FrmCliente();
        
        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);
        
        //el tamaño de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
        getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);
        

        
        formularioInterno.show();
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
         FrmProveedor formularioInterno = new FrmProveedor();
        
        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);
        
        //el tamaño de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
        getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);
        

        
        formularioInterno.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
          FrmProducto formularioInterno = new FrmProducto();
        
        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);
        
        //el tamaño de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
        getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);
        

        
        formularioInterno.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        FrmTrabajador formularioInterno = new FrmTrabajador();
        
        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);
        
        //el tamaño de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
        getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);
        

        
        formularioInterno.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
          FrmOrdenesCompra formularioInterno = new FrmOrdenesCompra();
        
        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);
        
        //el tamaño de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
        getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);
        

        
        formularioInterno.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
           FrmDevolucionesVentas formularioInterno = new FrmDevolucionesVentas();
        
        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);
        
        //el tamaño de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
        getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);
        

        
        formularioInterno.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        FrmFactura formularioInterno = new FrmFactura();
        
        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);
        
        //el tamaño de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
        getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);
        

        
        formularioInterno.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
         FrmEncabezadoFactura formularioInterno = new FrmEncabezadoFactura();
        
        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);
        
        //el tamaño de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
        getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);
        

        
        formularioInterno.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
         FrmDetalleFactura formularioInterno = new FrmDetalleFactura();
        
        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);
        
        //el tamaño de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
        getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);
        

        
        formularioInterno.show();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        Vendedores_X_Mes formularioInterno = new Vendedores_X_Mes();
        
        //add la instancia al desktop pane
        Escritorio.add(formularioInterno);
        
        //el tamaño de la vetana contenedor
        Dimension size = Escritorio.getSize();

        Dimension sizeForm = formularioInterno.getSize();
        formularioInterno.setLocation(((int) size.getWidth() - (int) sizeForm.
        getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2);
        

        
        formularioInterno.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
