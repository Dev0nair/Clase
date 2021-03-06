/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Errores;
import Controlador.Inicio;
import Modelo.CONSULTAS;
import Modelo.SERVICIO;
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author 3268i
 */
public class NUEVAFACTURA extends javax.swing.JDialog {

    /**
     * Creates new form NUEVAFACTURA
     */
    private SERVICIO Servicio;
    private Point puntoInicial;

    public NUEVAFACTURA(java.awt.Frame parent, boolean modal, SERVICIO servicio) {
        super(parent, modal);
        initComponents();

        miconfiguracion(servicio);

    }

    private void miconfiguracion(SERVICIO servicio) {
        this.setLocationRelativeTo(null);
        Servicio = servicio;
        JLSERVICIO.setText(servicio.getDESCRIPCION());
        JLUSER.setText(Servicio.getUSERNAME());

        ImageIcon ic = new javax.swing.ImageIcon(getClass().getResource(Inicio.getImg()));
        Icon i = new javax.swing.ImageIcon(ic.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

        JLIMG.setIcon(i);
        
        JTCLIENTE.setForeground(Color.gray);
        JTPRECIO.setForeground(Color.gray);
        JTDESCRIPCION.setForeground(Color.gray);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        JBSALIR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JLIMG = new javax.swing.JLabel();
        JLUSER = new javax.swing.JLabel();
        JLSERVICIO = new javax.swing.JLabel();
        JBCREAR = new javax.swing.JButton();
        JTPRECIO = new javax.swing.JTextField();
        JTDESCRIPCION = new javax.swing.JTextField();
        JTCLIENTE = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        JBSALIR.setBackground(new java.awt.Color(0,0,0,255));
        JBSALIR.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        JBSALIR.setForeground(new java.awt.Color(204, 204, 204));
        JBSALIR.setText("X");
        JBSALIR.setBorderPainted(false);
        JBSALIR.setContentAreaFilled(false);
        JBSALIR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JBSALIR.setFocusPainted(false);
        JBSALIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBSALIRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBSALIRMouseExited(evt);
            }
        });
        JBSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSALIRActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUEVA FACTURA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(139, 139, 139)
                .addComponent(JBSALIR))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBSALIR)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(2, 2, 2))
        );

        jPanel1.setBackground(new java.awt.Color(0,0,0,0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(JLIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLUSER, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLSERVICIO))
                .addGap(20, 20, 20))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JLSERVICIO, JLUSER});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLUSER, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLSERVICIO))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JLSERVICIO, JLUSER});

        JBCREAR.setText("Crear");
        JBCREAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCREARActionPerformed(evt);
            }
        });

        JTPRECIO.setText("PRECIO");
        JTPRECIO.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        JTPRECIO.setOpaque(false);
        JTPRECIO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTPRECIOFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTPRECIOFocusLost(evt);
            }
        });

        JTDESCRIPCION.setText("DESCRIPCION");
        JTDESCRIPCION.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        JTDESCRIPCION.setOpaque(false);
        JTDESCRIPCION.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTDESCRIPCIONFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTDESCRIPCIONFocusLost(evt);
            }
        });

        JTCLIENTE.setText("CLIENTE");
        JTCLIENTE.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        JTCLIENTE.setOpaque(false);
        JTCLIENTE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTCLIENTEFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTCLIENTEFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(JBCREAR))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTDESCRIPCION, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(JTCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JTDESCRIPCION, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(JBCREAR)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBSALIRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBSALIRMouseEntered
        JBSALIR.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_JBSALIRMouseEntered

    private void JBSALIRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBSALIRMouseExited
        JBSALIR.setForeground(new Color(200, 200, 200));
    }//GEN-LAST:event_JBSALIRMouseExited

    private void JBSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSALIRActionPerformed

        this.dispose();
    }//GEN-LAST:event_JBSALIRActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        puntoInicial = new Point(evt.getXOnScreen() - this.getX(), evt.getYOnScreen() - this.getY());
        this.requestFocus();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation((int) (evt.getXOnScreen() - puntoInicial.getX()), (int) (evt.getYOnScreen() - puntoInicial.getY()));
    }//GEN-LAST:event_formMouseDragged

    private void JTPRECIOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTPRECIOFocusGained
        if (JTPRECIO.getForeground() == Color.gray) {
            JTPRECIO.setText(null);
            JTPRECIO.setForeground(Color.BLACK);
        } else {
            JTPRECIO.selectAll();
        }
    }//GEN-LAST:event_JTPRECIOFocusGained

    private void JTPRECIOFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTPRECIOFocusLost
        if (JTPRECIO.getForeground() != Color.BLACK || JTPRECIO.getText().compareTo("") == 0) {
            JTPRECIO.setForeground(Color.gray);

            JTPRECIO.setText("PRECIO");

        }
    }//GEN-LAST:event_JTPRECIOFocusLost

    private void JTDESCRIPCIONFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTDESCRIPCIONFocusGained
        if (JTDESCRIPCION.getForeground() == Color.gray) {
            JTDESCRIPCION.setText(null);
            JTDESCRIPCION.setForeground(Color.BLACK);
        } else {
            JTDESCRIPCION.selectAll();
        }
    }//GEN-LAST:event_JTDESCRIPCIONFocusGained

    private void JTDESCRIPCIONFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTDESCRIPCIONFocusLost
        if (JTDESCRIPCION.getForeground() != Color.BLACK || JTDESCRIPCION.getText().compareTo("") == 0) {
            JTDESCRIPCION.setForeground(Color.gray);

            JTDESCRIPCION.setText("DESCRIPCION");

        }
    }//GEN-LAST:event_JTDESCRIPCIONFocusLost

    private void JBCREARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCREARActionPerformed
       
        if ((int)Inicio.realizarConsulta(new CONSULTAS(Servicio.getUSERNAME()).crearC(Servicio.getCOD(), Integer.parseInt(JTCLIENTE.getText()), Float.parseFloat(JTPRECIO.getText()), JTDESCRIPCION.getText()), CONSULTAS.TABLAS.FACTURA.ordinal(), false) != 0) {
            this.dispose();
        } else {
            Inicio.mostrarError(Errores.listaErrores.NoSalidas.ordinal());
        }
        
    }//GEN-LAST:event_JBCREARActionPerformed

    private void JTCLIENTEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTCLIENTEFocusGained
        if (JTCLIENTE.getForeground() == Color.gray) {
            JTCLIENTE.setText(null);
            JTCLIENTE.setForeground(Color.BLACK);
        } else {
            JTCLIENTE.selectAll();
        }
    }//GEN-LAST:event_JTCLIENTEFocusGained

    private void JTCLIENTEFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTCLIENTEFocusLost
        if (JTCLIENTE.getForeground() != Color.BLACK || JTCLIENTE.getText().compareTo("") == 0) {
            JTCLIENTE.setForeground(Color.gray);

            JTCLIENTE.setText("CLIENTE");

        }
    }//GEN-LAST:event_JTCLIENTEFocusLost

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCREAR;
    private javax.swing.JButton JBSALIR;
    private javax.swing.JLabel JLIMG;
    private javax.swing.JLabel JLSERVICIO;
    private javax.swing.JLabel JLUSER;
    private javax.swing.JTextField JTCLIENTE;
    private javax.swing.JTextField JTDESCRIPCION;
    private javax.swing.JTextField JTPRECIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
