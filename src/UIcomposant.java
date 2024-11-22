/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
/*
public class UIcomposant {
    
}
import javax.swing.*;

public abstract class UIComposant {
    protected JFrame frame;
    protected JTextField champIP;
    protected JTextField champMasque;
    protected JTextArea zoneResultats;
    protected JButton boutonCalcul;

    public UIComposant() {
        initialiserUI();
    }

    public abstract void initialiserUI();

    public abstract void mettreAJourResultats(String resultats);
}
*/
/*

import javax.swing.*;
import java.awt.event.*;

public class Calculateurreseauswingapp extends UIComposant {
    private JTextField ipField, masqueField;
    private JTextArea resultArea;

    public void initialiserUI() {
        JFrame frame = new JFrame("Calculateur d'Adresse Réseau");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ipField = new JTextField(15);
        masqueField = new JTextField(15);
        resultArea = new JTextArea(5, 20);
        JButton calculerButton = new JButton("Calculer");

        calculerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code pour lancer les calculs
                String ip = ipField.getText();
                String masque = masqueField.getText();
                // Exemple d'appel de méthode de calcul
                // calculerAdresse(ip, masque);
            }
        });

        frame.getContentPane().add(ipField);
        frame.getContentPane().add(masqueField);
        frame.getContentPane().add(calculerButton);
        frame.getContentPane().add(resultArea);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void mettreAJourResultats(String resultat) {
        resultArea.setText(resultat);
    }
}

*/

public abstract class UIcomposant {
    public abstract void initialiserUI();
    public abstract void mettreAJourResultats(String resultats);
}
