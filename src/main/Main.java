package main;

import UI.LoginUI;

/**
 *
 * @author dfbaes
 */
public class Main {
    public static void main(String[] args) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            
            LoginUI loginUI = new LoginUI();
            loginUI.setVisible(true);
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        
        
        
    }
}
