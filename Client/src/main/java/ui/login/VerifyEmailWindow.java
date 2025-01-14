/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.login;

import java.awt.Color;
import Cliente.Client;
import Domain.Customer;
import java.awt.Image;
import java.awt.Point;
import java.util.HashMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Toolkit;
import Idioma.GestorIdiomas;

/**
 *
 * @author purru
 */
public class VerifyEmailWindow extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    String code;
    Customer user;
    
    Client cliente;
    private GestorIdiomas gestorIdiomas = GestorIdiomas.getInstance();
    
    /**
     * Creates new form VerifyEmailWindow
     * @param cliente
     */
    public VerifyEmailWindow(Client cliente) {
        initComponents();
        setLocationRelativeTo(null);
        setImageLabel(titleIcon, "/small-logo.png");
        setImageLabel(lblMaximizar, "/Maximizar.png");
        setImageLabel(lblMinimizar, "/Guion.png");
        this.cliente=cliente;
        
        actualizarTextos();
        gestorIdiomas.registrarObservador(() -> actualizarTextos());
        
    }
    
    private void actualizarTextos(){
        lblEmail.setText(gestorIdiomas.getTexto("lblEmail"));
        lblSend.setText(gestorIdiomas.getTexto("lblSend"));
        lblConfirm.setText(gestorIdiomas.getTexto("lblConfirm"));
        lblCode.setText(gestorIdiomas.getTexto("lblCode"));
        txtFieldEmail.setText(gestorIdiomas.getTexto("txtFieldEmail"));
        txtFieldCode.setText(gestorIdiomas.getTexto("txtFieldCode"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        titleBar = new javax.swing.JPanel();
        titleIcon = new javax.swing.JLabel();
        lblMyPills = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        btnMaximizar = new javax.swing.JPanel();
        lblMaximizar = new javax.swing.JLabel();
        btnX = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        pnlEmail = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        txtFieldEmail = new javax.swing.JTextField();
        btnSend = new javax.swing.JPanel();
        lblSend = new javax.swing.JLabel();
        pnlCode = new javax.swing.JPanel();
        pnlCode.setVisible(false);
        lblCode = new javax.swing.JLabel();
        txtFieldCode = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JPanel();
        lblConfirm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleBar.setBackground(new java.awt.Color(204, 204, 204));
        titleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleBarMouseDragged(evt);
            }
        });
        titleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleBarMousePressed(evt);
            }
        });
        titleBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        titleBar.add(titleIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        lblMyPills.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMyPills.setText("MyPills");
        titleBar.add(lblMyPills, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 0, 200, 20));

        btnMinimizar.setOpaque(false);
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
        });
        btnMinimizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnMinimizar.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 20, 20));

        titleBar.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 30, 20));

        btnMaximizar.setOpaque(false);
        btnMaximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMaximizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMaximizarMouseExited(evt);
            }
        });
        btnMaximizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnMaximizar.add(lblMaximizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 20, 20));

        titleBar.add(btnMaximizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 30, 20));

        btnX.setBackground(new java.awt.Color(255, 0, 0));
        btnX.setOpaque(false);
        btnX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXMouseExited(evt);
            }
        });

        lblX.setBackground(new java.awt.Color(255, 0, 0));
        lblX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblX.setText("x");

        javax.swing.GroupLayout btnXLayout = new javax.swing.GroupLayout(btnX);
        btnX.setLayout(btnXLayout);
        btnXLayout.setHorizontalGroup(
            btnXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblX, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnXLayout.setVerticalGroup(
            btnXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        titleBar.add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 20));

        pnlFondo.add(titleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 20));

        pnlEmail.setOpaque(false);
        pnlEmail.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("Insert your Email:");
        pnlEmail.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 250, 40));

        txtFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFieldEmail.setForeground(java.awt.Color.lightGray);
        txtFieldEmail.setText("Email");
        txtFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldEmailFocusLost(evt);
            }
        });
        txtFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEmailActionPerformed(evt);
            }
        });
        pnlEmail.add(txtFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 330, 40));

        btnSend.setBackground(new java.awt.Color(51, 153, 255));
        btnSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSendMouseClicked(evt);
            }
        });
        btnSend.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSend.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSend.setText("Send Code");
        btnSend.add(lblSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        pnlEmail.add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 150, 40));

        pnlFondo.add(pnlEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 470, 190));

        pnlCode.setOpaque(false);
        pnlCode.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCode.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCode.setText("Insert the verification code:");
        pnlCode.add(lblCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 350, 40));

        txtFieldCode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFieldCode.setForeground(java.awt.Color.lightGray);
        txtFieldCode.setText("Verification Code");
        txtFieldCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldCodeFocusLost(evt);
            }
        });
        txtFieldCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCodeActionPerformed(evt);
            }
        });
        pnlCode.add(txtFieldCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 270, 40));

        btnConfirm.setBackground(new java.awt.Color(51, 153, 255));
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmMouseClicked(evt);
            }
        });
        btnConfirm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblConfirm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblConfirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConfirm.setText("Confirm");
        btnConfirm.add(lblConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        pnlCode.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 150, 40));

        pnlFondo.add(pnlCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 470, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseEntered
        btnX.setOpaque(true);
        lblX.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnXMouseEntered

    private void btnXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseExited
        btnX.setOpaque(false);
        lblX.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnXMouseExited

    private void btnXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseClicked
        dispose();
    }//GEN-LAST:event_btnXMouseClicked

    private void txtFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldEmailActionPerformed

    private void txtFieldCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCodeActionPerformed

    private void btnSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendMouseClicked
        HashMap<String, Object> session = new HashMap<>();
        session.put("Email", txtFieldEmail.getText());
        session = cliente.sentMessage("/sendVerificationCode", session);
        if (!(boolean)session.get("check")) {
            //Pop-Up No hay usuario registrado con ese email
        } else {
            code = (String)session.get("code");
            user = (Customer)session.get("user");
            //Pop-Up enviado correctamente
            pnlCode.setVisible(true);
        }
    }//GEN-LAST:event_btnSendMouseClicked

    private void txtFieldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEmailFocusGained
        if ("Email".equals(txtFieldEmail.getText())){
            txtFieldEmail.setText("");
            txtFieldEmail.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtFieldEmailFocusGained

    private void txtFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEmailFocusLost
        if ("".equals(txtFieldEmail.getText())){
            txtFieldEmail.setText("Email");
            txtFieldEmail.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtFieldEmailFocusLost

    private void txtFieldCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCodeFocusGained
        if ("Verification Code".equals(txtFieldCode.getText())){
            txtFieldCode.setText("");
            txtFieldCode.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtFieldCodeFocusGained

    private void txtFieldCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCodeFocusLost
        if ("".equals(txtFieldCode.getText())){
            txtFieldCode.setText("Verification Code");
            txtFieldCode.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtFieldCodeFocusLost

    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_titleBarMousePressed

    private void titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_titleBarMouseDragged

    private void btnMaximizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizarMouseEntered
        btnMaximizar.setOpaque(true);
        lblMaximizar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnMaximizarMouseEntered

    private void btnMaximizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizarMouseExited
        btnMaximizar.setOpaque(false);
        lblMaximizar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnMaximizarMouseExited

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizar.setOpaque(true);
        lblMinimizar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizar.setOpaque(false);
        lblMinimizar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked
        if (txtFieldCode.getText().equals(code)) {
            new CambiarContrasena(cliente, user).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnConfirmMouseClicked
    
    private void setImageLabel(JLabel labelN, String root){
        ImageIcon imagen = new ImageIcon(getClass().getResource(root));
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(labelN.getWidth(), labelN.getHeight(), Image.SCALE_SMOOTH));
        labelN.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnConfirm;
    private javax.swing.JPanel btnMaximizar;
    private javax.swing.JPanel btnMinimizar;
    private javax.swing.JPanel btnSend;
    private javax.swing.JPanel btnX;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMaximizar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblMyPills;
    private javax.swing.JLabel lblSend;
    private javax.swing.JLabel lblX;
    private javax.swing.JPanel pnlCode;
    private javax.swing.JPanel pnlEmail;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel titleBar;
    private javax.swing.JLabel titleIcon;
    private javax.swing.JTextField txtFieldCode;
    private javax.swing.JTextField txtFieldEmail;
    // End of variables declaration//GEN-END:variables
}
