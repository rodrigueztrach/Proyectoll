
package tallergestion;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import tallergestion.moduloVehiculos.ConsultaVehiculos;
import tallergestion.moduloVehiculos.FormularioVehiculo;

public class Vista extends javax.swing.JFrame {
 
    public Vista() {
    initComponents();

    //Ocultar los botones del submenu Clientes
    btnRegistrarCliente.setVisible(false);
    btnConsultarCliente.setVisible(false);
    PanelSubmenuClientes.setVisible(false);
    
    
    // Mostrar u ocultar el submenu cuando se toca el boton Clientes
    btnClientes.addActionListener(e -> {
        boolean visible = btnRegistrarCliente.isVisible(); // podés usar cualquiera
        btnRegistrarCliente.setVisible(!visible);
        btnConsultarCliente.setVisible(!visible);
    });
      
    
    

    // Instancias de paneles 
    FormularioCliente panelRegistro = new FormularioCliente(); //hacemos la llamada
    ConsultaClientes panelConsulta = new ConsultaClientes();
    FormularioVehiculo panelRegistroVehiculo = new FormularioVehiculo();
    ConsultaVehiculos panelConsultaVehiculo = new ConsultaVehiculos();
    
    
     //Agregarlos al panel con CardLayout 
    PanelContenido.setLayout(new CardLayout());
    PanelContenido.add(new PanelInicio(), "inicio");
    PanelContenido.add(panelRegistro, "registro");
    PanelContenido.add(panelConsulta, "consulta");
    PanelContenido.add(new FormularioVehiculo(), "registroVehiculo");
    PanelContenido.add(new ConsultaVehiculos(), "consultaVehiculo");
    PanelContenido.add(panelRegistroVehiculo, "registroVehiculo");
    PanelContenido.add(panelConsultaVehiculo, "consultaVehiculo");

    
    // Mostrar el vacío al inicio
    ((CardLayout) PanelContenido.getLayout()).show(PanelContenido, "inicio");
    
    
         //Conectar los botones secundarios SubmenuClientes
    btnRegistrarCliente.addActionListener(e -> {
        ((CardLayout) PanelContenido.getLayout()).show(PanelContenido, "registro");
    });

    btnConsultarCliente.addActionListener((ActionEvent e) -> {
        ((CardLayout) PanelContenido.getLayout()).show(PanelContenido, "consulta");
    });
}
    
   


    
    
    
    

    
    
    
    
                 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelvista = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        bntServicios = new javax.swing.JButton();
        btnVehiculos = new javax.swing.JButton();
        btnOrdenesTrabajo = new javax.swing.JButton();
        PanelSubmenuClientes = new javax.swing.JPanel();
        btnRegistrarCliente = new javax.swing.JButton();
        btnConsultarCliente = new javax.swing.JButton();
        PanelContenido = new javax.swing.JPanel();
        PanelSubmenuVehiculos = new javax.swing.JPanel();
        btnConsultarVehiculo = new javax.swing.JButton();
        btnRegistrarVehiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema Gestion de Taller");

        jPanelvista.setLayout(new javax.swing.BoxLayout(jPanelvista, javax.swing.BoxLayout.Y_AXIS));

        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        bntServicios.setText("Servicios");
        bntServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntServiciosActionPerformed(evt);
            }
        });

        btnVehiculos.setText("Vehiculos");
        btnVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculosActionPerformed(evt);
            }
        });

        btnOrdenesTrabajo.setText("Ordenes de Trabajo");

        PanelSubmenuClientes.setLayout(new java.awt.BorderLayout());

        btnRegistrarCliente.setText("Registrar");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        PanelSubmenuClientes.add(btnRegistrarCliente, java.awt.BorderLayout.CENTER);

        btnConsultarCliente.setText("Consultar");
        PanelSubmenuClientes.add(btnConsultarCliente, java.awt.BorderLayout.PAGE_START);

        PanelContenido.setLayout(new java.awt.CardLayout());

        PanelSubmenuVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelSubmenuVehiculos.setLayout(new java.awt.BorderLayout());

        btnConsultarVehiculo.setText("Consultar");
        btnConsultarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarVehiculoActionPerformed(evt);
            }
        });
        PanelSubmenuVehiculos.add(btnConsultarVehiculo, java.awt.BorderLayout.CENTER);

        btnRegistrarVehiculo.setText("Registar");
        btnRegistrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVehiculoActionPerformed(evt);
            }
        });
        PanelSubmenuVehiculos.add(btnRegistrarVehiculo, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bntServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
                .addComponent(PanelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jPanelvista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnOrdenesTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelSubmenuVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelSubmenuClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelSubmenuClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelSubmenuVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnOrdenesTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanelvista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        PanelSubmenuClientes.getAccessibleContext().setAccessibleName("PanelSubmenuClientes");
        PanelContenido.getAccessibleContext().setAccessibleName("PanelContenido");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //  Mostrar/ocultar submenú de clientes con el fin de que se vean solo al desplegarlos
    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
       
        btnClientes.addActionListener(e -> {
    boolean visible = PanelSubmenuClientes.isVisible();
    PanelSubmenuClientes.setVisible(!visible);

    // Si estás ocultando el submenú, también ocultá el formulario
    if (!PanelSubmenuClientes.isVisible()) {
        ((CardLayout) PanelContenido.getLayout()).show(PanelContenido, "vacio");
    }
});
        //  Mostrar/ocultar submenú de clientes con el fin de que se vean solo al desplegarlos
     //   btnClientes.addActionListener(e -> {
       // PanelSubmenuClientes.setVisible(!PanelSubmenuClientes.isVisible());
   // });
        
        
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void bntServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntServiciosActionPerformed

    private void btnVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculosActionPerformed
         PanelSubmenuVehiculos.setVisible(!PanelSubmenuVehiculos.isVisible()); //mostrar y ocultar el submenu
        if (!PanelSubmenuVehiculos.isVisible()) {
    ((CardLayout) PanelContenido.getLayout()).show(PanelContenido, "inicio"); //se limpia la vista cuando se oculta
}
        
    }//GEN-LAST:event_btnVehiculosActionPerformed

    private void btnRegistrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVehiculoActionPerformed
        
        CardLayout cl = (CardLayout) PanelContenido.getLayout();
        cl.show(PanelContenido, "registroVehiculo");
    
    }//GEN-LAST:event_btnRegistrarVehiculoActionPerformed

    private void btnConsultarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarVehiculoActionPerformed
        
        CardLayout cl = (CardLayout) PanelContenido.getLayout();
        cl.show(PanelContenido, "consultaVehiculo");

        
    }//GEN-LAST:event_btnConsultarVehiculoActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Vista().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JPanel PanelSubmenuClientes;
    private javax.swing.JPanel PanelSubmenuVehiculos;
    private javax.swing.JButton bntServicios;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnConsultarVehiculo;
    private javax.swing.JButton btnOrdenesTrabajo;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarVehiculo;
    private javax.swing.JButton btnVehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelvista;
    // End of variables declaration//GEN-END:variables
}
