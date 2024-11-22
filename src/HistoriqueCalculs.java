/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
/*
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HistoriqueCalculs {
    private List<String> historique;

    public HistoriqueCalculs() {
        historique = new ArrayList<>();
    }

    public void ajouterCalcul(String calcul) {
        historique.add(calcul);
    }

    public void sauvegarderHistorique(String fichier) throws IOException {
        try (FileWriter writer = new FileWriter(fichier)) {
            for (String ligne : historique) {
                writer.write(ligne + "\n");
            }
        }
    }
}
*/

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class HistoriqueCalculs {
    private ArrayList<String> historique = new ArrayList<>();
    
    public void ajouterCalcul(String calcul) {
        historique.add(calcul);
    }
    
    public void sauvegarderHistorique() {
        try (FileWriter writer = new FileWriter("historique.txt", true)) {
            for (String calcul : historique) {
                writer.write(calcul + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
