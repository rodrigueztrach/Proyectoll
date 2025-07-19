
package tallergestion;

//Se creo   un panel neutral de inicio, este panel se utiliza como fondo “de descanso” cuando no se esté usando los formularios.
public class PanelInicio extends javax.swing.JPanel {

    /**
     * Creates new form PanelInicio
     */
    public PanelInicio() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenida = new javax.swing.JLabel();

        lblBienvenida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBienvenida.setText("Bienvenido al sistema Taller Gestion, seleccione una opción del menu lateral.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBienvenida)
                .addContainerGap(269, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBienvenida;
    // End of variables declaration//GEN-END:variables
}
