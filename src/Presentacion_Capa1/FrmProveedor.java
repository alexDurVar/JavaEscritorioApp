package Presentacion_Capa1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Telyman
 */

import Entidades.Cliente;
import Entidades.Proveedor;
import LogicaNegocio_Capa2.LNCliente;
import LogicaNegocio_Capa2.LNProovedor;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmProveedor
     */
    
       private Proveedor GenerarEntidad(){
        //PONER AQUI SI FALTAN DATOSSSSSSSS
        
        Proveedor proveedor = new Proveedor();
        if(!TxtNumP.getText().equals("")){
            proveedor.setExiste(true);
            proveedor.setNum_proveedor(Integer.parseInt(TxtNumP.getText()));
        }
        proveedor.setNum_proveedor(Integer.parseInt(TxtNumP.getText()));
        proveedor.setNombre_org(TxtNombreOrg.getText());
        proveedor.setCorreo(TxtCorreoP.getText());
        proveedor.setDireccion(TxtDireccionP.getText());
        proveedor.setTelefono(TxtContactoP.getText());
        
        return proveedor;
    }
       
    //VARIABLE GLOBAL
    DefaultTableModel modelo;
    private void LimpiarTabla() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        TblProveedor.setModel(modelo);
        modelo.addColumn("Proveedor N°");
        modelo.addColumn("Nombre Organización");
        modelo.addColumn("Correo");
        modelo.addColumn("Dirección");
        modelo.addColumn("Teléfono");
   
    }
     //Metodo para cargar los CLIENTES EN LA TABLA
    private void CargarDatos(String condicion) throws  Exception{
        try {
            LNProovedor logica = new LNProovedor();
            List<Proveedor> lista;
            LimpiarTabla();
            Object[] fila = new Object[5];
            lista = logica.ListarRegistros(condicion);
            for(Proveedor proveedor:lista){
                fila[0] = proveedor.getNum_proveedor();
                fila[1] = proveedor.getNombre_org();
                fila[2] = proveedor.getCorreo();
                fila[3] = proveedor.getDireccion();
                fila[4] = proveedor.getTelefono();
                modelo.addRow(fila);
            }
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    private void Limpiar(){
        TxtNumP.setText("");
        TxtNombreOrg.setText("");
        TxtCorreoP.setText("");
        TxtDireccionP.setText("");
        TxtContactoP.setText("");
    }
    
    
    public FrmProveedor() {
        initComponents();
        
          try {
            CargarDatos("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TxtNumP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtNombreOrg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtCorreoP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtDireccionP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtContactoP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblProveedor = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        BtnIngresar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnBusc = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("N° Proveedor");

        TxtNumP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNumPKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombre Organización");

        jLabel3.setText("Correo");

        jLabel4.setText("Dirección");

        jLabel5.setText("Teléfono");

        TxtContactoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtContactoPKeyTyped(evt);
            }
        });

        TblProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TblProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblProveedor);

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        BtnIngresar.setText("Ingresar");
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnBusc.setText("Buscar");
        BtnBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Mantenimiento de Proveedores");

        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtDireccionP, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(TxtContactoP, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNumP, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombreOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TxtCorreoP, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnBusc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEliminar)
                        .addGap(28, 28, 28)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(268, 268, 268))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jButton2)
                    .addContainerGap(788, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNumP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNombreOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCorreoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtDireccionP, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxtContactoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnIngresar)
                    .addComponent(BtnModificar)
                    .addComponent(BtnBusc)
                    .addComponent(jButton3))
                .addGap(65, 65, 65))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(567, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addGap(66, 66, 66)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
        // TODO add your handling code here:
        if (TxtNumP.getText().equals("") || TxtNombreOrg.getText().equals("") || TxtCorreoP.getText().equals("") || TxtContactoP.getText().equals("") || TxtDireccionP.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe insertar datos");
        } else {
            LNProovedor logica = new LNProovedor();
            Proveedor proveedor = GenerarEntidad();
            try {
                if((logica.VeriricarInsercion(proveedor))==1){
                     
                    JOptionPane.showMessageDialog(this, logica.getMensaje());
                }
                else{
                    logica.Insertar(proveedor);
                     JOptionPane.showMessageDialog(this, logica.getMensaje());
                }
               
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

            try {
                CargarDatos("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

        }

        
        
    }//GEN-LAST:event_BtnIngresarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TblProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblProveedorMouseClicked
        // TODO add your handling code here:
         try {
            LNProovedor logica = new LNProovedor();
           Proveedor proveedor;
            String condicion;
            
            if(evt.getClickCount() == 2){
                int fila = TblProveedor.rowAtPoint(evt.getPoint());
                TxtNumP.setText(TblProveedor.getValueAt(fila, 0).toString());
                condicion = String.format("num_proveedor = %s", TxtNumP.getText());
                proveedor = logica.ObtenerRegistro(condicion);
                
                TxtNumP.setText(String.valueOf(proveedor.getNum_proveedor()));
                TxtNombreOrg.setText(proveedor.getNombre_org());
                TxtCorreoP.setText(proveedor.getCorreo());
                TxtDireccionP.setText(proveedor.getDireccion());
                TxtContactoP.setText(proveedor.getTelefono());
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_TblProveedorMouseClicked

    private void TxtNumPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumPKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c > '9') evt.consume();
    }//GEN-LAST:event_TxtNumPKeyTyped

    private void TxtContactoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtContactoPKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c > '9') evt.consume();
    }//GEN-LAST:event_TxtContactoPKeyTyped

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        if (TxtNumP.getText().equals("") || TxtNombreOrg.getText().equals("") || TxtCorreoP.getText().equals("") || TxtContactoP.getText().equals("") || TxtDireccionP.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un proveedor para modificarlo");
        } else {
            LNProovedor logica = new LNProovedor();
            Proveedor proveedor = GenerarEntidad();
            try {
                if((logica.VeriricarMod(proveedor))==1 || (logica.VeriricarExiste(proveedor))==1){
                    JOptionPane.showMessageDialog(this, logica.getMensaje());
                }else{
                     logica.Modificar(proveedor);
                JOptionPane.showMessageDialog(this, logica.getMensaje());
                }
               
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

            try {
                CargarDatos("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        if (TxtNumP.getText().equals("") || TxtNombreOrg.getText().equals("") || TxtCorreoP.getText().equals("") || TxtContactoP.getText().equals("") || TxtDireccionP.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un proveedor para eliminarlo");
        } else {
            LNProovedor logica = new LNProovedor();
            Proveedor proveedor = GenerarEntidad();
            try {
                if((logica.VeriricarEliminar(proveedor))==1 || (logica.VeriricarExiste(proveedor))==1){
                    JOptionPane.showMessageDialog(this, logica.getMensaje());
                }else{
                    logica.Eliminar(proveedor);
                JOptionPane.showMessageDialog(this, logica.getMensaje());
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

            try {
                CargarDatos("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscActionPerformed
        // TODO add your handling code here:
        FrmBuscarProveedor buscar = new FrmBuscarProveedor(null, true);
        buscar.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    int id = buscar.ObtenerId();
                    String condicion = "";
                    LNProovedor logica = new LNProovedor();
                    Proveedor proveedor;
                    if (id > -1) {
                        condicion = String.format("num_proveedor = %s", id);
                        proveedor = logica.ObtenerRegistro(condicion);
                        TxtNumP.setText(String.valueOf(proveedor.getNum_proveedor()));
                        TxtNombreOrg.setText(proveedor.getNombre_org());
                        TxtCorreoP.setText(proveedor.getCorreo());
                        TxtDireccionP.setText(proveedor.getDireccion());
                        TxtContactoP.setText(proveedor.getTelefono());
                    } else {
                        Limpiar();
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
       buscar.setVisible(true);
    }//GEN-LAST:event_BtnBuscActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProveedor().setVisible(true);
            }
        });
    }
    
    public void SoloLetras(KeyEvent evt){
        char s;
        s= evt.getKeyChar();
        if(!Character.isLetter(s) && s != KeyEvent.VK_SPACE ){
            evt.consume();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBusc;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JTable TblProveedor;
    private javax.swing.JTextField TxtContactoP;
    private javax.swing.JTextField TxtCorreoP;
    private javax.swing.JTextField TxtDireccionP;
    private javax.swing.JTextField TxtNombreOrg;
    private javax.swing.JTextField TxtNumP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}