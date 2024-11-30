/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.mainWindow;
import Domain.Medicine;
import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author salvadorcabreraparra
 */
public class PanelMedicines extends javax.swing.JPanel {
    
    private Medicine medicine;
    private boolean selected;
    
    /**
     * Creates new form PanelMedicines
     */
    public PanelMedicines() {
        initComponents();
        setSize(330, 140);
    }
    
    public PanelMedicines(Medicine medicine) {
        this.medicine = medicine;
        initComponents();
        setSize(330, 140);
        reload();
    }
    
    public PanelMedicines(String name, String dose, int id, int frequency, int remaining) {
        this.medicine = new Medicine(name, dose, id, frequency, remaining);
        initComponents();
        setSize(330, 140);
        this.selected = false;
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toggleSelection();
            }
        });
        reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblNameMedicine = new javax.swing.JLabel();
        lblRemainig = new javax.swing.JLabel();
        lblRemainingMedicine = new javax.swing.JLabel();
        lblDose = new javax.swing.JLabel();
        lblDoseMedicine = new javax.swing.JLabel();
        lblFrequency = new javax.swing.JLabel();
        lblFrequencyMedicine = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(300, 120));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("PT Mono", 3, 13)); // NOI18N
        lblName.setText("NAME:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 45, 20));

        lblNameMedicine.setFont(new java.awt.Font("PT Mono", 0, 13)); // NOI18N
        add(lblNameMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 10, 240, 20));

        lblRemainig.setFont(new java.awt.Font("PT Mono", 3, 13)); // NOI18N
        lblRemainig.setText("REMAINING:");
        add(lblRemainig, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 20));

        lblRemainingMedicine.setFont(new java.awt.Font("PT Mono", 0, 13)); // NOI18N
        add(lblRemainingMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 200, 20));

        lblDose.setFont(new java.awt.Font("PT Mono", 3, 13)); // NOI18N
        lblDose.setText("DOSE:");
        add(lblDose, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 42, 20));

        lblDoseMedicine.setFont(new java.awt.Font("PT Mono", 0, 13)); // NOI18N
        add(lblDoseMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 70, 220, 20));

        lblFrequency.setFont(new java.awt.Font("PT Mono", 3, 13)); // NOI18N
        lblFrequency.setText("FREQUENCY:");
        add(lblFrequency, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 85, 20));

        lblFrequencyMedicine.setFont(new java.awt.Font("PT Mono", 0, 13)); // NOI18N
        add(lblFrequencyMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 100, 190, 20));
    }// </editor-fold>//GEN-END:initComponents
    
    private void toggleSelection() {
        selected = !selected; // Cambia el estado de selección
        System.out.println("Panel seleccionado: " + selected); // Imprime el estado en consola
        // Cambiar el color de fondo para reflejar la selección visualmente
        setBackground(selected ? new java.awt.Color(255, 0, 0) : new java.awt.Color(153, 204, 255));
    }
    public boolean isSelected() {
        return selected;
    }
    
    public void setMedicine(Medicine medicine){
        this.medicine = medicine;
    }
    
    public Medicine getMedicine(){
        return medicine;
    }
    
    public void reload(){
        lblNameMedicine.setText(medicine.getName());
        lblDoseMedicine.setText(medicine.getDose());
        lblFrequencyMedicine.setText(String.valueOf(medicine.getFrequency()));
        lblRemainingMedicine.setText(String.valueOf(medicine.getRemaining()));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDose;
    private javax.swing.JLabel lblDoseMedicine;
    private javax.swing.JLabel lblFrequency;
    private javax.swing.JLabel lblFrequencyMedicine;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameMedicine;
    private javax.swing.JLabel lblRemainig;
    private javax.swing.JLabel lblRemainingMedicine;
    // End of variables declaration//GEN-END:variables
}
