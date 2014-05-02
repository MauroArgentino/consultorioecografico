/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package consultorioecografico;
import javax.swing.*;
import consultorioecografico.conexion.Conexion;

/**
 *
 * @author Administrador
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        jLabel1.setText("");
        /* JXStatusBar bar = new JXStatusBar();
      JLabel statusLabel = new JLabel("Ready");
      bar.add(statusLabel, new JXStatusBar.Constraints(1.0); //weight of 0.0 and no insets
      JProgressBar pbar = new JProgressBar();
      bar.add(pbar); //weight of 0.0 and no insets */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        btnPruebaConexion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuVer = new javax.swing.JMenu();
        mnuReportes = new javax.swing.JMenu();
        mnuAyuda = new javax.swing.JMenu();
        mniAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor Consultorio Ecográfico");
        setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        setFont(new java.awt.Font("MS Reference Sans Serif", 0, 10)); // NOI18N

        jDesktopPane1.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.borderDarkShadow"));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultorioecografico/recursos/paciente_32x32.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        btnPruebaConexion.setText("Probar Conexión");
        btnPruebaConexion.setFocusable(false);
        btnPruebaConexion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPruebaConexion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPruebaConexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPruebaConexionMouseClicked(evt);
            }
        });
        jToolBar1.add(btnPruebaConexion);

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 21));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, java.awt.BorderLayout.LINE_END);

        jMenu3.setText("Archivo");
        jMenu3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 11)); // NOI18N
        jMenuItem1.setText("Salir");
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edición");
        jMenu4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jMenuBar2.add(jMenu4);

        mnuVer.setText("Ver");
        mnuVer.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jMenuBar2.add(mnuVer);

        mnuReportes.setText("Reportes");
        mnuReportes.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jMenuBar2.add(mnuReportes);

        mnuAyuda.setText("Ayuda");
        mnuAyuda.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N

        mniAcercaDe.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        mniAcercaDe.setText("Acerca de...");
        mniAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAcercaDeActionPerformed(evt);
            }
        });
        mnuAyuda.add(mniAcercaDe);

        jMenuBar2.add(mnuAyuda);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAcercaDeActionPerformed
        // TODO add your handling code here:
        frmAcercaDe AcercaDe = new frmAcercaDe();
        
        jDesktopPane1.add(AcercaDe);
        AcercaDe.show();
        
    }//GEN-LAST:event_mniAcercaDeActionPerformed

    private void btnPruebaConexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPruebaConexionMouseClicked
        // TODO add your handling code here:
        Conexion PruebaConexion = new Conexion();

        if(PruebaConexion.getConnection() != null){
        jLabel1.setText("La conexión a sido exitosa!");
        jLabel1.setIcon(null);
        }
        
    }//GEN-LAST:event_btnPruebaConexionMouseClicked

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPruebaConexion;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mniAcercaDe;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JMenu mnuVer;
    // End of variables declaration//GEN-END:variables
}
