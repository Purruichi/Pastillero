/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author javieribarra
 */
public class Notificaciones {

    private Timer timer;
    private long frecuenciaEnMilisegundos;

    public Notificaciones(long frecuenciaEnHoras) {
        this.frecuenciaEnMilisegundos = frecuenciaEnHoras * 3600 * 1000; // Convertir horas a milisegundos
        this.timer = new Timer();
    }

    public void iniciar() {
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                mostrarNotificacion();
            }
        };

        // Programar la tarea para que se ejecute cada 'frecuenciaEnMilisegundos' milisegundos
        timer.scheduleAtFixedRate(tarea, 0, frecuenciaEnMilisegundos);
    }

    private void mostrarNotificacion() {
        JOptionPane.showMessageDialog(null, "Time to take your medicine", "REMEMBER", JOptionPane.INFORMATION_MESSAGE);
    }

    public void detener() {
        timer.cancel();
    }
}
