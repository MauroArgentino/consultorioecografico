/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorioecografico;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.sql.*;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author MAURO
 */
public class frmInicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form frmInicioSesion
     */
    public frmInicioSesion() {
        initComponents();
        // Sentencia que lo que hace.. es centrar el formulario en la
        // pantalla.
        setLocationRelativeTo(null);
       
            //Imagen imagen = new Imagen();
        ImageIcon ImagenDeLogueo = new ImageIcon(getClass().getResource("recursos/user-login-icon.png"));
        lblImagenDeLogueo.setIcon(ImagenDeLogueo);
        lblImagenDeLogueo.setText(null);
        txtUsuario.setToolTipText("Ingrese el nombre de usuario para iniciar sesión");
        // Cualquiera la que me mandé.
        if (txtUsuario.getText().length()>0){
            txtContrasenia.setToolTipText("Ahora ingrese su contraseña");
        }else{
            txtContrasenia.setToolTipText("Ingrese la contraseña");
        }
        
        getRootPane().setDefaultButton(btnIngresar);
        
        //getRootPane().set
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        grpInicioDeSesion = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        lblImagenDeLogueo = new javax.swing.JLabel();

        jDialog1.setBounds(new java.awt.Rectangle(0, 0, 200, 300));

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acceso al Sistema");
        setResizable(false);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        grpInicioDeSesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Inicio de Sesión"));
        grpInicioDeSesion.setPreferredSize(new java.awt.Dimension(230, 80));

        lblUsuario.setText("Usuario");

        lblContrasenia.setText("Contraseña");

        jCheckBox1.setText("Recordar contraseña en este equipo");

        javax.swing.GroupLayout grpInicioDeSesionLayout = new javax.swing.GroupLayout(grpInicioDeSesion);
        grpInicioDeSesion.setLayout(grpInicioDeSesionLayout);
        grpInicioDeSesionLayout.setHorizontalGroup(
            grpInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grpInicioDeSesionLayout.createSequentialGroup()
                .addGroup(grpInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grpInicioDeSesionLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblUsuario))
                    .addComponent(lblContrasenia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(grpInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContrasenia)
                    .addComponent(txtUsuario)))
            .addGroup(grpInicioDeSesionLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jCheckBox1))
        );
        grpInicioDeSesionLayout.setVerticalGroup(
            grpInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grpInicioDeSesionLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(grpInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(grpInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrasenia)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                .addComponent(jCheckBox1))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(230, 230));

        lblImagenDeLogueo.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblImagenDeLogueo)
                .addGap(0, 196, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblImagenDeLogueo)
                .addGap(0, 216, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grpInicioDeSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnCancelar)
                        .addGap(5, 5, 5)
                        .addComponent(btnIngresar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(grpInicioDeSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnIngresar))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        
        // jDialog1.show();
         try
                {                    
                    //chekar si el usuario escrbio el nombre de usuario y pw
                    if (txtUsuario.getText().length() > 0 && txtContrasenia.getText().length() > 0 )
                    {
                        // Si el usuario si fue validado correctamente
                        if( validarUsuario( txtUsuario.getText(), txtContrasenia.getText() ) )    //enviar datos a validar
                        {
                            // Codigo para mostrar la ventana principal
                            setVisible(false);
                            frmPrincipal InstanciafrmPrincipal = new frmPrincipal();
                            InstanciafrmPrincipal.setVisible(true);
 
 
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "El nombre de usuario y/o contraseña no son válidos.", "Atención", ERROR_MESSAGE);
                            //JOptionPane.showMessageDialog(null, txtUsuario.getText()+" " +txtContrasenia.getText() );
                            txtUsuario.setText("");    //limpiar campos
                            txtContrasenia.setText("");        
                             
                            txtUsuario.requestFocusInWindow();
                        }
 
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Debe escribir nombre de usuario y contrasenia.\n" +
                            "NO puede dejar ningun campo vacio");
                    }
 
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
    }//GEN-LAST:event_btnIngresarActionPerformed

    boolean validarUsuario(String elUsr, String elPw)  throws Exception
    {
        
        try
        {
            //nombre de la BD: bdlogin
             //nombre de la tabla: usuarios
             //                             id      integer auto_increment not null     <--llave primaria
             //                   campos:    usuario    char(25)
             //                              password char(50)
            Connection unaConexion  = DriverManager.getConnection ("jdbc:mysql://localhost/consulecografico","root", "admin");
            
            // Preparamos la consulta
            Statement instruccionSQL = unaConexion.createStatement();
            ResultSet resultadosConsulta = instruccionSQL.executeQuery ("SELECT * FROM usuarios WHERE nombreusuario='"+elUsr+"' AND contrasenia=password('"+ elPw+"')");
 
            if( resultadosConsulta.first() )        // si es valido el primer reg. hay una fila, tons el usuario y su pw existen
                return true;        //usuario validado correctamente
            else
                return false;        //usuario validado incorrectamente
                 
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            JOptionPane.showMessageDialog(null, e.getSQLState());
            JOptionPane.showMessageDialog(null, e.getErrorCode());
            return false;
        }
 
    }
        /*catch (SQLException e) {
            System.out.println("Excepción SQLException: ");
            System.out.println("Mensaje:....." + e.getMessage());
            System.out.println("SQLState:...." + e.getSQLState());
            System.out.println("Código proveedor:." + e.getErrorCode());
            System.out.println("-----------------------------------------------------");
            e.printStackTrace();
        }catch (Exception ex) {
            System.out.println("Se ha lanzado una excepción que no es una SQLException: ");
            ex.printStackTrace();
        } /*finally {
            try {
                if ( unaConexion != null) {
                    unaConexion.close();
                }
            } catch (SQLException e) {
                System.out.println("Excepción capturada al intentar concluir...");
        
        return false;*/
      
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
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e){
        e.printStackTrace();
        }
//JFrame.setDefaultLookAndFeelDecorated(false);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicioSesion().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPanel grpInicioDeSesion;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblImagenDeLogueo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
