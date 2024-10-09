/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainWindow;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import quitar.quitar;

/**
 *
 * @author andre
 */
public class mainWindow extends javax.swing.JFrame {
    int xMouse, yMouse;
    private quitar quitarWindow = null;
    /**
     * Creates new form mainWindow
     */
    public mainWindow() {
        initComponents();
        
        showDate();
        showUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NorthPan = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        MyPills = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        quit = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        datename = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        EastPan = new javax.swing.JPanel();
        addPanel = new javax.swing.JPanel();
        addlabel = new javax.swing.JLabel();
        QuitPanel = new javax.swing.JPanel();
        QuitLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JScrollPane();
        medTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NorthPan.setBackground(new java.awt.Color(51, 153, 255));
        NorthPan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                NorthPanMouseDragged(evt);
            }
        });
        NorthPan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NorthPanMousePressed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/small-logo.png"))); // NOI18N
        logo.setText("jLabel1");

        MyPills.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        MyPills.setForeground(new java.awt.Color(255, 255, 255));
        MyPills.setText("MyPills");

        username.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Username:");

        quit.setBackground(new java.awt.Color(255, 51, 0));
        quit.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        quit.setForeground(new java.awt.Color(255, 255, 255));
        quit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quit.setText("X");
        quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                quitMouseExited(evt);
            }
        });

        user.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("UsernamePH");

        datename.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        datename.setForeground(new java.awt.Color(255, 255, 255));
        datename.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datename.setText("Date: ");

        date.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("jLabel1");

        javax.swing.GroupLayout NorthPanLayout = new javax.swing.GroupLayout(NorthPan);
        NorthPan.setLayout(NorthPanLayout);
        NorthPanLayout.setHorizontalGroup(
            NorthPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NorthPanLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NorthPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NorthPanLayout.createSequentialGroup()
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                    .addGroup(NorthPanLayout.createSequentialGroup()
                        .addComponent(MyPills, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(datename, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        NorthPanLayout.setVerticalGroup(
            NorthPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NorthPanLayout.createSequentialGroup()
                .addGroup(NorthPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NorthPanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(datename, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NorthPanLayout.createSequentialGroup()
                        .addGroup(NorthPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MyPills, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NorthPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel1.add(NorthPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        EastPan.setBackground(new java.awt.Color(102, 204, 255));

        addPanel.setBackground(new java.awt.Color(0, 204, 102));

        addlabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addlabel.setForeground(new java.awt.Color(255, 255, 255));
        addlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addlabel.setText("Añadir");
        addlabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addlabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        QuitPanel.setBackground(new java.awt.Color(204, 51, 0));

        QuitLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        QuitLabel.setForeground(new java.awt.Color(255, 255, 255));
        QuitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuitLabel.setText("Quitar");
        QuitLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        QuitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QuitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuitLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout QuitPanelLayout = new javax.swing.GroupLayout(QuitPanel);
        QuitPanel.setLayout(QuitPanelLayout);
        QuitPanelLayout.setHorizontalGroup(
            QuitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        QuitPanelLayout.setVerticalGroup(
            QuitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout EastPanLayout = new javax.swing.GroupLayout(EastPan);
        EastPan.setLayout(EastPanLayout);
        EastPanLayout.setHorizontalGroup(
            EastPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EastPanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EastPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(QuitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        EastPanLayout.setVerticalGroup(
            EastPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EastPanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(QuitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(EastPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 156, -1, -1));

        medTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Medicina", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        medTable.setGridColor(new java.awt.Color(204, 255, 255));
        mainPanel.setViewportView(medTable);

        jPanel1.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 550, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_quitMouseClicked

    private void addlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addlabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addlabelMouseClicked

    private void QuitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitLabelMouseClicked
    // Verificar si la ventana ya está abierta
    if (quitarWindow == null || !quitarWindow.isShowing()) {
        // Crear una nueva instancia de la ventana "quitar" si no está abierta
        quitarWindow = new quitar();
        
        // Añadir un listener para detectar cuando se cierra la ventana "quitar"
        quitarWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                // Volver a mostrar la ventana principal cuando se cierre "quitar"
                mainWindow.this.setVisible(true);
            }
        });
        
        // Ocultar la ventana principal (opcional, si quieres ocultarla mientras está abierta "quitar")
        
        // Mostrar la ventana "quitar"
        quitarWindow.setVisible(true);
    }
    }//GEN-LAST:event_QuitLabelMouseClicked

    private void NorthPanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NorthPanMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_NorthPanMousePressed

    private void NorthPanMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NorthPanMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- xMouse, y - yMouse);
        
    }//GEN-LAST:event_NorthPanMouseDragged

    private void quitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMouseEntered
        quit.setOpaque(true);
    }//GEN-LAST:event_quitMouseEntered

    private void quitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMouseExited
        quit.setOpaque(false);
    }//GEN-LAST:event_quitMouseExited

    
    private void showDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        String dat =s.format(d);
        date.setText(dat);
    }
    
    private void showUser(){
            // URL de conexión a la base de datos (reemplaza con tus propios valores)
    String url = "jdbc:mysql://localhost:3306/tu_base_de_datos";
    String userDb = "root";  // Usuario de la base de datos
    String passwordDb = "password";  // Contraseña de la base de datos
    String query = "SELECT user FROM usuarios WHERE id = ?";  // Consulta SQL (modifica según tu tabla)
    // Establecer conexión y realizar la consulta
    try (Connection con = DriverManager.getConnection(url, userDb, passwordDb);
         PreparedStatement pst = con.prepareStatement(query)) {
        
        // Aquí puedes pasar un valor para identificar el usuario, por ejemplo, el id
        pst.setInt(1, 1);  // Suponiendo que buscas al usuario con id = 1
        
        try (ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                String userName = rs.getString("user");
                user.setText(userName);  // Mostrar el usuario en el JLabel
            } else {
                user.setText("Usuario no encontrado");
            }
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
        user.setText("Error al conectar");
    }
    }
    
    private void ShowMeds(){
        
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
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EastPan;
    private javax.swing.JLabel MyPills;
    private javax.swing.JPanel NorthPan;
    private javax.swing.JLabel QuitLabel;
    private javax.swing.JPanel QuitPanel;
    private javax.swing.JPanel addPanel;
    private javax.swing.JLabel addlabel;
    private javax.swing.JLabel date;
    private javax.swing.JLabel datename;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JScrollPane mainPanel;
    private javax.swing.JTable medTable;
    private javax.swing.JLabel quit;
    private javax.swing.JLabel user;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
