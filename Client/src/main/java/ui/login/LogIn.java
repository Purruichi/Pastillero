/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.login;

import Cliente.Client;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import ui.mainWindow.mainWindow;
import Idioma.GestorIdiomas;

/**
 *
 * @author purru
 */
public class LogIn extends javax.swing.JFrame{
    
    Client cliente;
    
    int xMouse, yMouse;
    private GestorIdiomas gestorIdiomas = GestorIdiomas.getInstance();
    
    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
        //configurarListeners();
        setImageLabel(bgImage, "/LogInBackground.png");
        setImageLabel(windowIcon, "/small-logo.png");
        setImageLabel(lblMaximizar, "/Maximizar.png");
        setImageLabel(lblMinimizar, "/Guion.png");
        setImageLabel(lblVolver, "/Volver.png");
        btnMinimizar.setOpaque(true);
        lblMinimizar.setOpaque(false);
        btnMaximizar.setOpaque(true);
        lblMaximizar.setOpaque(false);
        setSize(800, 500);
        setLocationRelativeTo(null);
        cliente = new Client();
        
        actualizarTextos();
        GestorIdiomas.getInstance().registrarObservador(() -> actualizarTextos());
    }
    
    private void actualizarTextos(){
        lblTitleLogIn.setText(gestorIdiomas.getTexto("lblTitleLogIn"));
        lblForgotPass.setText(gestorIdiomas.getTexto("lblForgotPass"));
        lblSignUpAccess.setText(gestorIdiomas.getTexto("lblSignUpAccess"));
        lblTitleSignUp.setText(gestorIdiomas.getTexto("lblTitleSignUp"));
        lblPassword.setText(gestorIdiomas.getTexto("lblPassword"));
        lblConfirmPassword.setText(gestorIdiomas.getTexto("lblConfirmPassword"));
        lblErrorLogIn.setText(gestorIdiomas.getTexto("lblErrorLogIn"));
        lblErrorSignUp.setText(gestorIdiomas.getTexto("lblErrorSignUp"));
        labelLogIn.setText(gestorIdiomas.getTexto("labelLogIn"));
        lblSignUp.setText(gestorIdiomas.getTexto("lblSignUp"));
        usernameField.setText(gestorIdiomas.getTexto("usernameField"));
        passField.setText(gestorIdiomas.getTexto("passField"));
        newEmailField.setText(gestorIdiomas.getTexto("newEmailField"));
        newUsernameField.setText(gestorIdiomas.getTexto("newUsernameField"));
        newPassField.setText(gestorIdiomas.getTexto("newPassField"));
        confirmPassField.setText(gestorIdiomas.getTexto("confirmPassField"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        titleBar = new javax.swing.JPanel();
        btnX = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        btnMaximizar = new javax.swing.JPanel();
        lblMaximizar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        windowIcon = new javax.swing.JLabel();
        lblMyPills = new javax.swing.JLabel();
        pnlLogIn = new javax.swing.JPanel();
        lblTitleLogIn = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        panelLogInButton = new javax.swing.JPanel();
        labelLogIn = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        lblForgotPass = new javax.swing.JLabel();
        lblSignUpAccess = new javax.swing.JLabel();
        lblErrorLogIn = new javax.swing.JLabel();
        pnlSignUp = new javax.swing.JPanel();
        lblErrorSignUp = new javax.swing.JLabel();
        lblTitleSignUp = new javax.swing.JLabel();
        newEmailField = new javax.swing.JTextField();
        newUsernameField = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        newPassField = new javax.swing.JPasswordField();
        lblConfirmPassword = new javax.swing.JLabel();
        confirmPassField = new javax.swing.JPasswordField();
        pnlSignUpButton = new javax.swing.JPanel();
        lblSignUp = new javax.swing.JLabel();
        btnVolver = new javax.swing.JPanel();
        lblVolver = new javax.swing.JLabel();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2);
        setUndecorated(true);

        panelFondo.setBackground(new java.awt.Color(51, 153, 255));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnX.setBackground(new java.awt.Color(255, 0, 0));
        btnX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnX.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblX.setText("x");
        lblX.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnX.add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 20));

        titleBar.add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 20));

        btnMaximizar.setBackground(new java.awt.Color(204, 204, 204));
        btnMaximizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        lblMaximizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaximizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaximizar.setToolTipText("");
        lblMaximizar.setMaximumSize(new java.awt.Dimension(8, 17));
        lblMaximizar.setMinimumSize(new java.awt.Dimension(8, 17));
        lblMaximizar.setPreferredSize(new java.awt.Dimension(8, 17));
        btnMaximizar.add(lblMaximizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 20, 20));

        titleBar.add(btnMaximizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 30, 20));

        btnMinimizar.setBackground(new java.awt.Color(204, 204, 204));
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.setMinimumSize(new java.awt.Dimension(30, 20));
        btnMinimizar.setOpaque(false);
        btnMinimizar.setPreferredSize(new java.awt.Dimension(30, 20));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
        });
        btnMinimizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinimizar.setFont(new java.awt.Font("Shree Devanagari 714", 0, 13)); // NOI18N
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });
        btnMinimizar.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 20, 20));

        titleBar.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 30, 20));
        titleBar.add(windowIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        lblMyPills.setFont(new java.awt.Font("PT Mono", 1, 12)); // NOI18N
        lblMyPills.setText("MyPills");
        titleBar.add(lblMyPills, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 250, 20));

        panelFondo.add(titleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 20));

        pnlLogIn.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitleLogIn.setFont(new java.awt.Font("PT Mono", 3, 36)); // NOI18N
        lblTitleLogIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleLogIn.setText("Log In");
        pnlLogIn.add(lblTitleLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 169, 50));

        usernameField.setFont(new java.awt.Font("PT Mono", 2, 18)); // NOI18N
        usernameField.setForeground(java.awt.Color.lightGray);
        usernameField.setText("Username");
        usernameField.setToolTipText("");
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });
        pnlLogIn.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 230, 41));

        panelLogInButton.setBackground(new java.awt.Color(51, 153, 255));
        panelLogInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelLogInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLogInButtonMouseClicked(evt);
            }
        });
        panelLogInButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogIn.setFont(new java.awt.Font("PT Mono", 1, 18)); // NOI18N
        labelLogIn.setText("Log In");
        panelLogInButton.add(labelLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 1, -1, 50));

        pnlLogIn.add(panelLogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 230, 50));

        passField.setForeground(java.awt.Color.lightGray);
        passField.setText("Password");
        passField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFieldFocusLost(evt);
            }
        });
        pnlLogIn.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 230, 40));

        lblForgotPass.setFont(new java.awt.Font("PT Mono", 0, 13)); // NOI18N
        lblForgotPass.setForeground(new java.awt.Color(0, 153, 255));
        lblForgotPass.setText("Forgot your password?");
        lblForgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotPassMouseClicked(evt);
            }
        });
        pnlLogIn.add(lblForgotPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 230, -1));

        lblSignUpAccess.setFont(new java.awt.Font("PT Mono", 0, 13)); // NOI18N
        lblSignUpAccess.setForeground(new java.awt.Color(0, 153, 255));
        lblSignUpAccess.setText("Don't have an account? Sign up here");
        lblSignUpAccess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSignUpAccess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSignUpAccessMouseClicked(evt);
            }
        });
        pnlLogIn.add(lblSignUpAccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, -1));

        lblErrorLogIn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblErrorLogIn.setForeground(new java.awt.Color(255, 0, 0));
        pnlLogIn.add(lblErrorLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 230, 60));

        panelFondo.add(pnlLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 500));

        pnlSignUp.setBackground(new java.awt.Color(255, 255, 255));
        pnlSignUp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblErrorSignUp.setFont(new java.awt.Font("Shree Devanagari 714", 0, 18)); // NOI18N
        lblErrorSignUp.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlSignUp.add(lblErrorSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 230, 70));

        lblTitleSignUp.setFont(new java.awt.Font("PT Mono", 0, 36)); // NOI18N
        lblTitleSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleSignUp.setText("Sign Up");
        pnlSignUp.add(lblTitleSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 169, 50));

        newEmailField.setFont(new java.awt.Font("PT Mono", 0, 18)); // NOI18N
        newEmailField.setForeground(java.awt.Color.lightGray);
        newEmailField.setText("Email");
        newEmailField.setToolTipText("");
        newEmailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newEmailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                newEmailFieldFocusLost(evt);
            }
        });
        pnlSignUp.add(newEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 230, 40));

        newUsernameField.setFont(new java.awt.Font("PT Mono", 0, 18)); // NOI18N
        newUsernameField.setForeground(java.awt.Color.lightGray);
        newUsernameField.setText("Username");
        newUsernameField.setToolTipText("");
        newUsernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newUsernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                newUsernameFieldFocusLost(evt);
            }
        });
        pnlSignUp.add(newUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 230, 40));

        lblPassword.setFont(new java.awt.Font("PT Mono", 1, 18)); // NOI18N
        lblPassword.setText("Password:");
        pnlSignUp.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 30));

        newPassField.setForeground(java.awt.Color.lightGray);
        newPassField.setText("Password");
        newPassField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newPassFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                newPassFieldFocusLost(evt);
            }
        });
        pnlSignUp.add(newPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 230, 40));

        lblConfirmPassword.setFont(new java.awt.Font("PT Mono", 1, 18)); // NOI18N
        lblConfirmPassword.setText("Confirm Password:");
        pnlSignUp.add(lblConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 230, 30));

        confirmPassField.setForeground(java.awt.Color.lightGray);
        confirmPassField.setText("Password");
        confirmPassField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmPassFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmPassFieldFocusLost(evt);
            }
        });
        pnlSignUp.add(confirmPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 40));

        pnlSignUpButton.setBackground(new java.awt.Color(51, 153, 255));
        pnlSignUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSignUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSignUpButtonMouseClicked(evt);
            }
        });
        pnlSignUpButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSignUp.setFont(new java.awt.Font("PT Mono", 1, 18)); // NOI18N
        lblSignUp.setText("Sign Up");
        lblSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSignUpButton.add(lblSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 30));

        pnlSignUp.add(pnlSignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 230, 50));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setOpaque(false);
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });
        btnVolver.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 20));

        pnlSignUp.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 40, 30));

        panelFondo.add(pnlSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 500));
        pnlSignUp.setVisible(false);

        bgImage.setMaximumSize(new java.awt.Dimension(1000, 1000));
        bgImage.setMinimumSize(new java.awt.Dimension(520, 500));
        bgImage.setPreferredSize(new java.awt.Dimension(520, 500));
        panelFondo.add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 520, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        if ("Username".equals(usernameField.getText())){
            usernameField.setText("");
            usernameField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_usernameFieldFocusGained

    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusLost
        if ("".equals(usernameField.getText())){
            usernameField.setText("Username");
            usernameField.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_usernameFieldFocusLost

    private void panelLogInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLogInButtonMouseClicked
        
        HashMap<String, Object> sessionIn = new HashMap<>();
        sessionIn.put("username", usernameField.getText());
        sessionIn.put("password", String.valueOf(passField.getPassword()));
        
        HashMap<String, Object> sessionOut = cliente.sentMessage("/checkLogIn", sessionIn);
        boolean logedIn = (boolean)sessionOut.get("check");
        HashMap<String, String> userData = (HashMap<String, String>)sessionOut.get("userData");
        
        if (logedIn)
            LogedIn(userData);
        else
            lblErrorLogIn.setText("<html>Username or password are incorrect<html>");
        
        /*ArrayList<HashMap<String, String>> userData = DatabaseFunctions.SELECT("users", new String[0], "username", usernameField.getText());
        if (userData.isEmpty()){
            lblErrorLogIn.setText("<html>Username or password are incorrect<html>");
        } else {
            if (userData.get(0).get("password").equals(String.valueOf(passField.getPassword()))){
                LogedIn(userData.get(0));
            } else {
                lblErrorLogIn.setText("<html>Username or password are incorrect<html>");
            }
        }*/
    }//GEN-LAST:event_panelLogInButtonMouseClicked

    private void passFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusGained
        if ("Password".equals(String.valueOf(passField.getPassword()))){
            passField.setText("");
            passField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_passFieldFocusGained

    private void passFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusLost
        if ("".equals(String.valueOf(passField.getPassword()))){
            passField.setText("Password");
            passField.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_passFieldFocusLost

    private void titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_titleBarMouseDragged

    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_titleBarMousePressed

    private void btnXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseEntered
        btnX.setOpaque(true);
        lblX.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnXMouseEntered

    private void btnXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseExited
        btnX.setOpaque(false);
        lblX.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnXMouseExited

    private void btnXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnXMouseClicked

    private void newUsernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newUsernameFieldFocusGained
        if ("Username".equals(newUsernameField.getText())){
            newUsernameField.setText("");
            newUsernameField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_newUsernameFieldFocusGained

    private void newUsernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newUsernameFieldFocusLost
        if ("".equals(newUsernameField.getText())){
            newUsernameField.setText("Username");
            newUsernameField.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_newUsernameFieldFocusLost

    private void pnlSignUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSignUpButtonMouseClicked
        if (!newEmailField.getText().equals("Email") && !newUsernameField.getText().equals("Username")){
            lblErrorSignUp.setText("");
            if (String.valueOf(newPassField.getPassword()).equals(String.valueOf(confirmPassField.getPassword())) && !"Password".equals(String.valueOf(newPassField.getPassword()))){
                lblErrorSignUp.setText("");
                String[] values = {newUsernameField.getText(), String.valueOf(newPassField.getPassword()), newEmailField.getText()};
                HashMap<String, Object> session = new HashMap<>();
                session.put("values", values);
                boolean check = (boolean)cliente.sentMessage("/signUpUser", session).get("check");
                if (check){
                    //Ventana de confirmación
                    System.out.println("Inicio de session correcto");
                    newEmailField.setText("Email");
                    newUsernameField.setText("Username");
                    newPassField.setText("Password");
                    confirmPassField.setText("Password");
                    newPassField.setForeground(Color.LIGHT_GRAY);
                    newEmailField.setForeground(Color.LIGHT_GRAY);
                    newUsernameField.setForeground(Color.LIGHT_GRAY);
                    confirmPassField.setForeground(Color.LIGHT_GRAY);
                    pnlSignUp.setVisible(false);
                    pnlLogIn.setVisible(true);
                } else {
                    //Ventana de error
                    System.out.println("Error en el inicio de session");
                }
            } else {
                lblErrorSignUp.setText("<html>Both passwords don't match<html>");
            }
        } else {
            lblErrorSignUp.setText("<html>Write your email and password<html>");
        }
    }//GEN-LAST:event_pnlSignUpButtonMouseClicked

    private void newPassFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPassFieldFocusGained
        if ("Password".equals(String.valueOf(newPassField.getPassword()))){
            newPassField.setText("");
            newPassField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_newPassFieldFocusGained

    private void newPassFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPassFieldFocusLost
        if ("".equals(String.valueOf(newPassField.getPassword()))){
            newPassField.setText("Password");
            newPassField.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_newPassFieldFocusLost

    private void newEmailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newEmailFieldFocusGained
        if ("Email".equals(newEmailField.getText())){
            newEmailField.setText("");
            newEmailField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_newEmailFieldFocusGained

    private void newEmailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newEmailFieldFocusLost
        if ("".equals(newEmailField.getText())){
            newEmailField.setText("Email");
            newEmailField.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_newEmailFieldFocusLost

    private void confirmPassFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPassFieldFocusGained
        if ("Password".equals(String.valueOf(confirmPassField.getPassword()))){
            confirmPassField.setText("");
            confirmPassField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_confirmPassFieldFocusGained

    private void confirmPassFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPassFieldFocusLost
        if ("".equals(String.valueOf(confirmPassField.getPassword()))){
            confirmPassField.setText("Password");
            confirmPassField.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_confirmPassFieldFocusLost

    private void lblSignUpAccessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpAccessMouseClicked
        pnlLogIn.setVisible(false);
        pnlSignUp.setVisible(true);
    }//GEN-LAST:event_lblSignUpAccessMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        // TODO add your handling code here:
        pnlSignUp.setVisible(false);
        pnlLogIn.setVisible(true);
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void lblForgotPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPassMouseClicked
        new VerifyEmailWindow(cliente).setVisible(true);
        dispose();
    }//GEN-LAST:event_lblForgotPassMouseClicked

    private void btnMaximizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizarMouseEntered
        btnMaximizar.setOpaque(true);
        lblMaximizar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnMaximizarMouseEntered

    private void btnMaximizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizarMouseExited
        btnMaximizar.setOpaque(false);
        lblMaximizar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnMaximizarMouseExited

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizar.setOpaque(true);
        lblMinimizar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizar.setOpaque(false);
        lblMinimizar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnMinimizarMouseExited
    
    private void LogedIn(HashMap<String, String> userData){
        mainWindow menuWindow = new mainWindow(userData, cliente);
        menuWindow.setVisible(true);
        dispose();
    }
    
    private void setImageLabel(JLabel labelN, String root){
        ImageIcon imagen = new ImageIcon(getClass().getResource(root));
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(labelN.getWidth(), labelN.getHeight(), Image.SCALE_SMOOTH));
        labelN.setIcon(icon);
        this.repaint();
    }
    
    
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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JPanel btnMaximizar;
    private javax.swing.JPanel btnMinimizar;
    private javax.swing.JPanel btnVolver;
    private javax.swing.JPanel btnX;
    private javax.swing.JPasswordField confirmPassField;
    private javax.swing.JLabel labelLogIn;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblErrorLogIn;
    private javax.swing.JLabel lblErrorSignUp;
    private javax.swing.JLabel lblForgotPass;
    private javax.swing.JLabel lblMaximizar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblMyPills;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblSignUpAccess;
    private javax.swing.JLabel lblTitleLogIn;
    private javax.swing.JLabel lblTitleSignUp;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JLabel lblX;
    private javax.swing.JTextField newEmailField;
    private javax.swing.JPasswordField newPassField;
    private javax.swing.JTextField newUsernameField;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelLogInButton;
    private javax.swing.JPasswordField passField;
    private javax.swing.JPanel pnlLogIn;
    private javax.swing.JPanel pnlSignUp;
    private javax.swing.JPanel pnlSignUpButton;
    private javax.swing.JPanel titleBar;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel windowIcon;
    // End of variables declaration//GEN-END:variables
}
