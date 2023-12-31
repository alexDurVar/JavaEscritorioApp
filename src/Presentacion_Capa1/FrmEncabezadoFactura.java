/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Presentacion_Capa1;

import Entidades.Cliente;
import Entidades.EncabezadoFactura;
import Entidades.Proveedor;
import Entidades.Trabajador;
import LogicaNegocio_Capa2.LNCliente;
import LogicaNegocio_Capa2.LNEncabezadoFactura;
import LogicaNegocio_Capa2.LNProovedor;
import LogicaNegocio_Capa2.LNTrabajador;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Telyman
 */
public class FrmEncabezadoFactura extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmEncabezadoFactura
     */
     private EncabezadoFactura GenerarEntidad(){
        //PONER AQUI SI FALTAN DATOSSSSSSSS
        
        EncabezadoFactura factura = new EncabezadoFactura();
        
        Date fecha = new Date();
        fecha = DCFecha.getDate();
        java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
        
       
        factura.setNumero_factura(Integer.parseInt(TxtNumF.getText()));
        factura.setId_trabajador(Integer.parseInt(TxtIdT.getText()));
        factura.setFecha(sqlDate);
        factura.setImpuesto(Float.parseFloat(TxtIm.getText()));
        factura.setMonto_a_pagar(Float.parseFloat(TxtMontoT.getText()));
        factura.setId_cliente(Integer.parseInt(TxtIdCliente.getText()));
        
        
        return factura;
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
        TblEncabezado.setModel(modelo);
        modelo.addColumn("Factura N°");
        modelo.addColumn("ID Trabajador");
        modelo.addColumn("Fecha");
        modelo.addColumn("Impuesto");
        modelo.addColumn("Monto Total");
        modelo.addColumn("ID Cliente");
   
    }
        private void CargarDatos(String condicion) throws  Exception{
        try {
            LNEncabezadoFactura logica = new LNEncabezadoFactura();
            List<EncabezadoFactura> lista;
            LimpiarTabla();
            Object[] fila = new Object[6];
            lista = logica.ListarRegistros(condicion);
            for(EncabezadoFactura encabezado:lista){
                fila[0] = encabezado.getNumero_factura();
                fila[1] = encabezado.getId_trabajador();
                fila[2] = encabezado.getFecha();
                fila[3] = encabezado.getImpuesto();
                fila[4] = encabezado.getMonto_a_pagar();
                fila[5] = encabezado.getId_cliente();
                modelo.addRow(fila);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
        
           private void Limpiar(){
        TxtNumF.setText("");
      
        TxtIm.setText("");
        TxtIdCliente.setText("");
        TxtIdT.setText("");
        TxtMontoT.setText("");
        
       
    }
    
    
    
    
    
    
    
    
    
    public FrmEncabezadoFactura() {
        initComponents();
        
         Calendar c2 = new GregorianCalendar();
         DCFecha.setCalendar(c2);
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TxtIdT = new javax.swing.JTextField();
        TxtIdCliente = new javax.swing.JTextField();
        TxtIm = new javax.swing.JTextField();
        TxtMontoT = new javax.swing.JTextField();
        TxtNumF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DCFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblEncabezado = new javax.swing.JTable();
        E = new javax.swing.JButton();
        M = new javax.swing.JButton();
        B = new javax.swing.JButton();
        I = new javax.swing.JButton();
        BT = new javax.swing.JButton();
        BC = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Mantenimiento de Encabezado de Factura");

        TxtIdT.setEditable(false);

        TxtIdCliente.setEditable(false);

        TxtIm.setEditable(false);

        TxtMontoT.setEditable(false);

        TxtNumF.setEditable(false);

        jLabel2.setText("Factura N°");

        jLabel5.setText("Impuesto");

        jLabel6.setText("ID Trabajador");

        jLabel7.setText("Monto Total");

        jLabel8.setText("Fecha");

        jLabel9.setText("ID Cliente");

        DCFecha.setEnabled(false);

        TblEncabezado.setModel(new javax.swing.table.DefaultTableModel(
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
        TblEncabezado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblEncabezadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblEncabezado);

        E.setText("Eliminar");
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });

        M.setText("Modificar");
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        B.setText("Buscar");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        I.setText("Salir");
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });

        BT.setText("Buscar");
        BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTActionPerformed(evt);
            }
        });

        BC.setText("Buscar");
        BC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(I)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(B)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(M)
                                .addGap(18, 18, 18)
                                .addComponent(E))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtNumF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(TxtIdT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BT))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(DCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(TxtIm, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtMontoT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(BC))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(72, 72, 72))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DCFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxtNumF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TxtIdT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtIm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtMontoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT)
                    .addComponent(BC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(I)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(E)
                            .addComponent(M)
                            .addComponent(B))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TblEncabezadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblEncabezadoMouseClicked
        // TODO add your handling code here:
         try {
           LNEncabezadoFactura logica = new LNEncabezadoFactura();
           EncabezadoFactura encabezado;
            String condicion;
            
            if(evt.getClickCount() == 2){
                int fila = TblEncabezado.rowAtPoint(evt.getPoint());
                TxtNumF.setText(TblEncabezado.getValueAt(fila, 0).toString());
                condicion = String.format("numero_factura = %s", TxtNumF.getText());
                encabezado = logica.ObtenerRegistro(condicion);
                
                TxtNumF.setText(String.valueOf( encabezado.getNumero_factura()));
                TxtIdT.setText(String.valueOf(encabezado.getId_trabajador()));
                DCFecha.setDate(encabezado.getFecha());
                TxtIm.setText(String.valueOf( encabezado.getImpuesto()));
                TxtMontoT.setText(String.valueOf( encabezado.getMonto_a_pagar()));
                TxtIdCliente.setText(String.valueOf( encabezado.getId_cliente()));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_TblEncabezadoMouseClicked

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        // TODO add your handling code here:
         if ( TxtIdCliente.getText().equals("") || TxtIdT.getText().equals("") || TxtIm.getText().equals("") || TxtMontoT.getText().equals("") || TxtNumF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un encabezado de factura para eliminarlo");
        } else {
            LNEncabezadoFactura logica = new LNEncabezadoFactura();
            EncabezadoFactura factura = GenerarEntidad();
            try {
                if((logica.VerificarEliminar(factura))==1){
                    JOptionPane.showMessageDialog(this, logica.getMensaje());
                }else{
                      logica.Eliminar(factura);
                JOptionPane.showMessageDialog(this, logica.getMensaje());
                }
              
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

            try {
                CargarDatos("");
                Limpiar();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

        }
    }//GEN-LAST:event_EActionPerformed

    private void BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTActionPerformed
        // TODO add your handling code here:
        FrmBuscarTrabajador buscar = new FrmBuscarTrabajador(null, true);
        buscar.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    int id = buscar.ObtenerId();
                    String condicion = "";
                    LNTrabajador logica = new LNTrabajador();
                    Trabajador trabajador;
                    if (id > -1) {
                        condicion = String.format("id_trabajador = %s", id);
                        trabajador = logica.ObtenerRegistro(condicion);
                        
                        TxtIdT.setText(Integer.toString(trabajador.getId_trabajador()));
                    } else {
                        Limpiar();
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
       buscar.setVisible(true);
    }//GEN-LAST:event_BTActionPerformed

    private void BCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCActionPerformed
        // TODO add your handling code here:
         FrmBuscarCliente buscar = new FrmBuscarCliente(null, true);
        buscar.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    int id = buscar.ObtenerId();
                    String condicion = "";
                    LNCliente logica = new LNCliente();
                    Cliente cliente;
                    if (id > -1) {
                        condicion = String.format("id_cliente = %s", id);
                        cliente = logica.ObtenerRegistro(condicion);
                        
                        TxtIdCliente.setText(Integer.toString(cliente.getId_cliente()));
                    } else {
                        Limpiar();
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
       buscar.setVisible(true);
    }//GEN-LAST:event_BCActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        // TODO add your handling code here:
         if ( TxtIdCliente.getText().equals("") || TxtIdT.getText().equals("") || TxtIm.getText().equals("") || TxtMontoT.getText().equals("") || TxtNumF.getText().equals("") ) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un encabezado de factura para modificarlo");
        } else {
            LNEncabezadoFactura logica = new LNEncabezadoFactura();
            EncabezadoFactura factura = GenerarEntidad();
            try {
                
                if((logica.VerificarMod(factura))==1){
                    
                JOptionPane.showMessageDialog(this, logica.getMensaje());
                }else{
                     logica.Modificar(factura);
                JOptionPane.showMessageDialog(this, logica.getMensaje());
                Limpiar();
                }
               
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

            try {
                CargarDatos("");
                Limpiar();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

        }
    }//GEN-LAST:event_MActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
         FrmBuscarEncabezado buscar = new FrmBuscarEncabezado(null, true);
        buscar.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    int id = buscar.ObtenerId();
                    String condicion = "";
                    LNEncabezadoFactura logica = new LNEncabezadoFactura();
                    EncabezadoFactura encabezado;
                    if (id > -1) {
                        condicion = String.format("numero_factura = %d", id); //d es para enteros
                        encabezado = logica.ObtenerRegistro(condicion);

                        TxtNumF.setText(String.valueOf(encabezado.getNumero_factura()));
                        TxtIdT.setText(String.valueOf(encabezado.getId_trabajador()));
                        DCFecha.setDate(encabezado.getFecha());
                        TxtIm.setText(String.valueOf(encabezado.getImpuesto()));
                        TxtMontoT.setText(String.valueOf(encabezado.getMonto_a_pagar()));
                        TxtIdCliente.setText(String.valueOf(encabezado.getId_cliente()));
                    } else {
                        Limpiar();
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
       buscar.setVisible(true);
    }//GEN-LAST:event_BActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
        // TODO add your handling code here:
//         FrmFactura formularioInterno = new FrmFactura();
//        formularioInterno.show();
        dispose();
    

    }//GEN-LAST:event_IActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B;
    private javax.swing.JButton BC;
    private javax.swing.JButton BT;
    private com.toedter.calendar.JDateChooser DCFecha;
    private javax.swing.JButton E;
    private javax.swing.JButton I;
    private javax.swing.JButton M;
    private javax.swing.JTable TblEncabezado;
    private javax.swing.JTextField TxtIdCliente;
    private javax.swing.JTextField TxtIdT;
    private javax.swing.JTextField TxtIm;
    private javax.swing.JTextField TxtMontoT;
    private javax.swing.JTextField TxtNumF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
