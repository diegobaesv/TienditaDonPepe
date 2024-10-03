/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import javax.swing.JOptionPane;

/**
 *
 * @author dfbaes
 */
public class AlertUtil {
    
    public static void showInfo(String message){
        JOptionPane.showMessageDialog(null, message, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void showWarning(String message){
        JOptionPane.showMessageDialog(null, message, "Alerta", JOptionPane.WARNING_MESSAGE);
    }
    
    public static void showError(String message){
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public static boolean showQuestion(String message){
        return JOptionPane.showConfirmDialog(null, message, "Pregunta", JOptionPane.YES_NO_OPTION) == 0;
    }
    
}
