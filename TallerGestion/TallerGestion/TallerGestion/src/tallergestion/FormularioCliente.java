
package tallergestion;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class FormularioCliente extends javax.swing.JPanel {

   
    public FormularioCliente() {
        initComponents();
  
    btnRegistrar.addActionListener((ActionEvent e) -> {
    String nombre = txtNombre.getText().trim();
    String telefono = txtTelefono.getText().trim();
    String direccion = txtDireccion.getText().trim();

    if (nombre.isEmpty() || telefono.isEmpty()) {
        lblMensaje.setText(" Nombre y teléfono son obligatorios");
    } else {
        lblMensaje.setText(" Cliente registrado: " + nombre);
        // Aquí se debera  agregar lógica para guardar los .txt
        txtNombre.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
    }
});

        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtNombre = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new java.awt.TextField();
        txtDireccion = new java.awt.TextField();
        lblID1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 175, -1, -1));
        add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 540, 20));
        lblMensaje.getAccessibleContext().setAccessibleName("lblMensaje ");

        lblID.setText("----");
        add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 220, 30));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 260, 60));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 215, 33));
        txtNombre.getAccessibleContext().setAccessibleName("txtNombre");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nombre");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 43, 100, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Telefono");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 101, 80, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Direccion");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 110, 60));
        add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 215, 33));
        txtTelefono.getAccessibleContext().setAccessibleName("txtTelefono");

        txtDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 215, 33));
        txtDireccion.getAccessibleContext().setAccessibleName("txtDireccion");

        lblID1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblID1.setText("ID Cliente");
        add(lblID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 115, 56));

        btnCerrar.setBackground(new java.awt.Color(255, 102, 102));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 260, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
   
    Container contenedor = FormularioCliente.this.getParent();  
    if (contenedor instanceof JPanel) {
        CardLayout cl = (CardLayout) contenedor.getLayout();
        cl.show(contenedor, "inicio"); // Este es el nombre del panel neutral que creaste
    }
        
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblMensaje;
    private java.awt.TextField txtDireccion;
    private java.awt.TextField txtNombre;
    private java.awt.TextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
