/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Presentacion_Capa1;

import AccesoDatos_Capa3.ADEncabezadoFactura;
import Entidades.EncabezadoFactura;
import Entidades.Trabajador;
import LogicaNegocio_Capa2.LNEncabezadoFactura;
import LogicaNegocio_Capa2.LNTrabajador;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Telyman
 */
public class Vendedores_X_Mes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vendedores_X_Mes
     */
    public Vendedores_X_Mes() {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        CB = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblVentas = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jButton1.setText("Buscar Cantidad de Ventas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);

        jLabel1.setText("ID Trabajador");

        jButton2.setText("Buscar Ventas Solo Trabajador");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Mes");

        TxtTotal.setEditable(false);

        TblVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TblVentas);

        jButton3.setText("Buscar Trabajador");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Limpiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Resumir ventas por vendedor y por mes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addComponent(jButton2)
                            .addComponent(jLabel1))
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jLabel2)
                            .addComponent(TxtTotal))
                        .addGap(0, 257, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(TxtTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Faltan datos");
        }else{
            int month =0;
        switch ((String) CB.getSelectedItem() ){
            case "Enero":
                month = 1;
             break;
             
            case "Febrero":
                month = 2;
             break;
            case "Marzo":
                month = 3;
             break;
             case "Abril":
                month = 4;
             break;
             case "Mayo":
                month = 5;
             break;
             case "Junio":
                month = 6;
             break;
             case "Julio":
                month = 7;
             break;
             case "Agosto":
                month = 8;
             break;
             case "Septiembre":
                month = 9;
             break;
             case "Octubre":
                month = 10;
             break;
             case "Noviembre":
                month = 11;
             break;
             case "Diciembre":
                month = 12;
             break;
            
            
        }
        
        
        try{
            ADEncabezadoFactura enc = new ADEncabezadoFactura();
            TxtTotal.setText(enc.Ventas(month, jTextField1.getText()));
            if (TxtTotal.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Este trabajador no tiene ventas en este mes");
            }
        }catch(Exception e){
              JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
        
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        /* FrmBuscarTrabajador buscar = new FrmBuscarTrabajador(null, true);
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
                        
                        jTextField1.setText(Integer.toString(trabajador.getId_trabajador()));
                    } 
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
       buscar.setVisible(true);*/
         if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Faltan datos");
        }else{
             String condicion = "";
        try {
            if(!jTextField1.getText().equals("")){
                condicion = " ID_TRABAJADOR LIKE '%" + jTextField1.getText() + "%'";
            }
            CargarDatos(condicion);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
         }
        
          

    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
                        
                        jTextField1.setText(Integer.toString(trabajador.getId_trabajador()));
                    } 
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
       buscar.setVisible(true);
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        dispose();
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        TxtTotal.setText("");
        jTextField1.setText("");
    }                                        

    
    
    
    
    
    
    
    
    
    
    
    
    
    DefaultTableModel modelo;
    private void LimpiarTabla() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        TblVentas.setModel(modelo);
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
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> CB;
    private javax.swing.JTable TblVentas;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}
