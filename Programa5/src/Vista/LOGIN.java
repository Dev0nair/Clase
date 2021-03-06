/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Errores;
import Controlador.Inicio;
import Modelo.CONSULTAS;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.Locale;
import javafx.scene.input.KeyCode;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

/**
 *
 * @author 3268i
 */
public class LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    Point puntoInicial = null;
    private int state = 0;
    private String user, pass;
    
    Object auxT;
    Object auxP;
    Object act;
    
    public LOGIN() {      
        setContentPane(new FONDO(2));
        initComponents();
        miConfiguracion();
    }
    
    private void miConfiguracion(){
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setTitle("LOGIN");    
        
        JTFORM.setEchoChar((char)0);
        JTFORM.setForeground(Color.gray);
        JTFORM.setText("USUARIO");
        
        quitarFocus();
    }
    
    private void quitarFocus(){
        JTTITULO.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTTITULO = new javax.swing.JLabel();
        JBLOGIN = new javax.swing.JButton();
        JBSALIR = new javax.swing.JButton();
        JTFORM = new javax.swing.JPasswordField();
        JLIMGUSER = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        JTTITULO.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        JTTITULO.setForeground(new java.awt.Color(255, 255, 255));
        JTTITULO.setText("USUARIO");
        JTTITULO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTTITULOKeyPressed(evt);
            }
        });

        JBLOGIN.setBackground(new java.awt.Color(0,0,0,100));
        JBLOGIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/go.png"))); // NOI18N
        JBLOGIN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JBLOGIN.setContentAreaFilled(false);
        JBLOGIN.setFocusPainted(false);
        JBLOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLOGINActionPerformed(evt);
            }
        });

        JBSALIR.setBackground(new java.awt.Color(0,0,0,100));
        JBSALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        JBSALIR.setBorder(null);
        JBSALIR.setContentAreaFilled(false);
        JBSALIR.setFocusPainted(false);
        JBSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSALIRActionPerformed(evt);
            }
        });

        JTFORM.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 15)); // NOI18N
        JTFORM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JTFORM.setCaretColor(new java.awt.Color(255, 255, 255));
        JTFORM.setOpaque(false);
        JTFORM.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTFORMFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTFORMFocusLost(evt);
            }
        });
        JTFORM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFORMKeyPressed(evt);
            }
        });

        JLIMGUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLIMGUSER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Profile/default.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLIMGUSER, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTTITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFORM, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addComponent(JBSALIR))))
                        .addGap(0, 0, 0)
                        .addComponent(JBLOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(249, 249, 249))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(JLIMGUSER, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(JTTITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBLOGIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFORM, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBSALIR)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        quitarFocus();
    }//GEN-LAST:event_formMouseClicked

    private void JBSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSALIRActionPerformed
        salir();        
    }//GEN-LAST:event_JBSALIRActionPerformed

    private void salir(){
        if (state == 0) {
            Inicio.cerrarConexion();
            this.dispose();
        } else {
            state = 0;
            JTFORM.setText(null);
            JTFORM.setEchoChar((char)0);
            JTTITULO.setText("USUARIO");
            JLIMGUSER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Profile/default.png")));
        }
    }
    
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation((int) (evt.getXOnScreen() - puntoInicial.getX()), (int) (evt.getYOnScreen() - puntoInicial.getY()));
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        puntoInicial = new Point(evt.getXOnScreen() - this.getX(), evt.getYOnScreen() - this.getY());
    }//GEN-LAST:event_formMousePressed

    private void JBLOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLOGINActionPerformed
        login();
    }//GEN-LAST:event_JBLOGINActionPerformed

    private void login(){
        switch(state){
            case 0:
                Inicio.setUsuario(JTFORM.getText());
                String aux = (String) Inicio.realizarConsulta(new CONSULTAS(JTFORM.getText()).verA(), CONSULTAS.TABLAS.USUARIO.ordinal(), false);
                if (aux != null){
                    user = aux;
                    JTTITULO.setText(user);
                    
                    try{
                        String url = "/Imagenes/"+Inicio.realizarConsulta(new CONSULTAS(JTFORM.getText()).verIMGA(), CONSULTAS.TABLAS.USUARIO.ordinal(), false);
                        JLIMGUSER.setIcon(new javax.swing.ImageIcon(getClass().getResource(url)));
                        Inicio.setIMG(url);
                    } catch(Exception e){ // si el usuario no tiene imagen de perfil seleccionada, dejamos la de por defecto
                        JLIMGUSER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Profile/default.png")));
                        Inicio.setIMG("/Imagenes/Profile/default.png");
                    }
                    
                    JTFORM.setForeground(Color.gray);
                    cambiarState();
                } else {
                    Inicio.mostrarError(Errores.listaErrores.BadUser.ordinal());
                }
                break;
            case 1:
                cambiarState();
                break;
        }
    }
    
    private void JTFORMFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFORMFocusGained
        if (JTFORM.getForeground() == Color.gray) {
            JTFORM.setText(null);
            JTFORM.setForeground(Color.WHITE);
            if (state == 1) {
                JTFORM.setEchoChar('*');
            }
        } else {
            JTFORM.selectAll();
        }
    }//GEN-LAST:event_JTFORMFocusGained

    private void JTFORMFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFORMFocusLost
        if (JTFORM.getForeground() != Color.WHITE || JTFORM.getText().compareTo("") == 0) {
            JTFORM.setForeground(Color.gray);
            if (state == 0) {
                JTFORM.setText("USUARIO");
            } else {
                JTFORM.setEchoChar((char)0);
                JTFORM.setText("PASSWORD");
            }
            
        }
    }//GEN-LAST:event_JTFORMFocusLost

    private void JTFORMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFORMKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            salir();
        }
    }//GEN-LAST:event_JTFORMKeyPressed

    private void JTTITULOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTTITULOKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            salir();
        }
    }//GEN-LAST:event_JTTITULOKeyPressed

    private void cambiarState(){
        if (state == 0) {
            state = 1;
            JTFORM.setText(null);
            JTFORM.setForeground(Color.WHITE);
            JTFORM.setEchoChar('*');
        } else {
            pass = JTFORM.getText();
            if (Inicio.realizarLogin(pass)) {
                this.dispose();
                Inicio.AbrirPrograma();
            }            
        }
        
        
        
        
        
        
        
    }
//this.getLocation().x - (evt.getXOnScreen() - this.getLocation().x), this.getLocation().y - (evt.getYOnScreen() - this.getLocation().y)
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBLOGIN;
    private javax.swing.JButton JBSALIR;
    private javax.swing.JLabel JLIMGUSER;
    private javax.swing.JPasswordField JTFORM;
    private javax.swing.JLabel JTTITULO;
    // End of variables declaration//GEN-END:variables
}
