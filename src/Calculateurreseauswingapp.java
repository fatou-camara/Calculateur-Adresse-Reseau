/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
/*
    import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculateurreseauswingapp extends UIComposant {

    @Override
    public void initialiserUI() {
        frame = new JFrame("Calculateur d'Adresse Réseau");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelIP = new JLabel("Adresse IP :");
        labelIP.setBounds(10, 10, 100, 25);
        frame.add(labelIP);

        champIP = new JTextField();
        champIP.setBounds(120, 10, 200, 25);
        frame.add(champIP);

        JLabel labelMasque = new JLabel("Masque :");
        labelMasque.setBounds(10, 50, 100, 25);
        frame.add(labelMasque);

        champMasque = new JTextField();
        champMasque.setBounds(120, 50, 200, 25);
        frame.add(champMasque);

        boutonCalcul = new JButton("Calculer");
        boutonCalcul.setBounds(120, 90, 100, 25);
        frame.add(boutonCalcul);

        zoneResultats = new JTextArea();
        zoneResultats.setBounds(10, 130, 360, 120);
        zoneResultats.setEditable(false);
        frame.add(zoneResultats);

        boutonCalcul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String ip = champIP.getText();
                    int masque = Integer.parseInt(champMasque.getText());
                    Reseau reseau = new Reseau(ip, masque);

                    String resultats = "Classe : " + reseau.getClasseIP() + "\n" +
                            "Adresse Début : " + reseau.getAdresseDebut() + "\n" +
                            "Adresse Fin : " + reseau.getAdresseFin();
                    mettreAJourResultats(resultats);
                } catch (Invalidipexception ex) {
                    mettreAJourResultats("Erreur : " + ex.getMessage());
                } catch (NumberFormatException ex) {
                    mettreAJourResultats("Erreur : Masque invalide !");
                }
            }
        });

        frame.setVisible(true);
    }

    @Override
    public void mettreAJourResultats(String resultats) {
        zoneResultats.setText(resultats);
    }

    public static void main(String[] args) {
        new Calculateurreseauswingapp();
    

*/
/*
   
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculateurreseauswingapp extends UIcomposant {
    private JFrame frame;
    private JTextField champIP;
    private JTextField champMasque;
    private JTextArea zoneResultats;

    @Override
    public void initialiserUI() {
        frame = new JFrame("Calculateur d'Adresse Réseau");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelIP = new JLabel("Adresse IP :");
        labelIP.setBounds(10, 10, 100, 25);
        frame.add(labelIP);

        champIP = new JTextField();
        champIP.setBounds(120, 10, 200, 25);
        frame.add(champIP);

        JLabel labelMasque = new JLabel("Masque :");
        labelMasque.setBounds(10, 50, 100, 25);
        frame.add(labelMasque);

        champMasque = new JTextField();
        champMasque.setBounds(120, 50, 200, 25);
        frame.add(champMasque);

        JButton boutonCalcul = new JButton("Calculer");
        boutonCalcul.setBounds(120, 90, 100, 25);
        frame.add(boutonCalcul);

        zoneResultats = new JTextArea();
        zoneResultats.setBounds(10, 130, 360, 120);
        zoneResultats.setEditable(false);
        frame.add(zoneResultats);

        boutonCalcul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String ip = champIP.getText();
                    int masque = Integer.parseInt(champMasque.getText());
                    Reseau reseau = new Reseau(ip, masque);

                    String resultats = "Classe : " + reseau.getClasseIP() + "\n" +
                            "Adresse Début : " + reseau.getAdresseDebut() + "\n" +
                            "Adresse Fin : " + reseau.getAdresseFin();
                    mettreAJourResultats(resultats);
                } catch (Invalidipexception ex) {
                    mettreAJourResultats("Erreur : " + ex.getMessage());
                } catch (NumberFormatException ex) {
                    mettreAJourResultats("Erreur : Masque invalide !");
                }
            }
        });

        frame.setVisible(true);
    }

    @Override
    public void mettreAJourResultats(String resultats) {
        zoneResultats.setText(resultats);
    }

    public static void main(String[] args) {
        new Calculateurreseauswingapp();
    }
}
*/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculateurreseauswingapp extends UIcomposant {
    private JFrame frame;
    private JTextField champIP, champMasque;
    private JTextArea zoneResultats;

    @Override
    public void initialiserUI() {
        frame = new JFrame("Calculateur d'Adresse Réseau");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelIP = new JLabel("Adresse IP :");
        labelIP.setBounds(10, 100, 100, 25);
        frame.add(labelIP);

        champIP = new JTextField();
        champIP.setBounds(120, 100, 200, 25);
        frame.add(champIP);

        JLabel labelMasque = new JLabel("Masque :");
        labelMasque.setBounds(10, 50, 100, 25);
        frame.add(labelMasque);

        champMasque = new JTextField();
        champMasque.setBounds(120, 50, 200, 25);
        frame.add(champMasque);

        JButton boutonCalcul = new JButton("Calculer");
        boutonCalcul.setBounds(120, 170, 100, 25);
        frame.add(boutonCalcul);

        zoneResultats = new JTextArea();
        zoneResultats.setBounds(10, 130, 360, 120);
        zoneResultats.setEditable(false);
        frame.add(zoneResultats);

        boutonCalcul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String ip = champIP.getText();
                    int masque = Integer.parseInt(champMasque.getText());
                    Reseau reseau = new Reseau(ip, Integer.toString(masque));
                    reseau.calculerPlageAdresse();

                    String resultats = "Classe : " + reseau.getClasse() + "\n" +
                            "Adresse Début : " + reseau.getAdresseDebut() + "\n" +
                            "Adresse Fin : " + reseau.getAdresseFin();
                    mettreAJourResultats(resultats);
                } catch (Invalidipexception ex) {
                    mettreAJourResultats("Erreur : " + ex.getMessage());
                } catch (NumberFormatException ex) {
                    mettreAJourResultats("Erreur : Masque invalide !");
                }
            }
        });

        frame.setVisible(true);
    }

    @Override
    public void mettreAJourResultats(String resultats) {
        zoneResultats.setText(resultats);
    }

    public static void main(String[] args) {
        new Calculateurreseauswingapp().initialiserUI();
    }
}




    


    

