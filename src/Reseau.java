/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
/*
public class Reseau extends Adresseip{
    private int[] masque;        // Tableau pour le masque de sous-réseau
    private int[] adresseDebut;  // Première adresse disponible dans le réseau
    private int[] adresseFin;    // Dernière adresse disponible dans le réseau

    // Constructeur
    public Reseau(String adresse, String masque) throws Invalidipexception {
        super(adresse); // Appelle le constructeur de la classe parent
        this.masque = new int[4];
        validerMasque(masque);
        calculerPlageAdresse();
    }

    // Valider le masque de sous-réseau
    private void validerMasque(String masqueStr) throws Invalidipexception {
        String[] parties = masqueStr.split("\\.");
        if (parties.length != 4) {
            throw new Invalidipexception
        ("Le masque doit comporter exactement 4 octets.");
        }

        for (int i = 0; i < 4; i++) {
            try {
                int octet = Integer.parseInt(parties[i]);
                if (octet < 0 || octet > 255) {
                    throw new Invalidipexception("Chaque octet du masque doit être compris entre 0 et 255.");
                }
                masque[i] = octet;
            } catch (NumberFormatException e) {
                throw new Invalidipexception("Chaque partie du masque doit être un entier.");
            }
        }
    }

    // Calculer la plage d'adresses du réseau
    private void calculerPlageAdresse() {
        this.adresseDebut = new int[4];
        this.adresseFin = new int[4];

        // Calcul de l'adresse début (AND logique entre l'adresse IP et le masque)
        for (int i = 0; i < 4; i++) {
            adresseDebut[i] = ip[i] & masque[i];
        }

        // Calcul de l'adresse fin (inverse du masque + adresse début)
        for (int i = 0; i < 4; i++) {
            adresseFin[i] = adresseDebut[i] | (~masque[i] & 0xFF);
        }
    }

    // Obtenir le masque en notation CIDR (nombre de bits à 1)
    public int getMasqueEnBits() {
        int bits = 0;
        for (int octet : masque) {
            bits += Integer.bitCount(octet);
        }
        return bits;
    }

    // Méthode pour afficher les informations du réseau
    @Override
    public String toString() {
        return super.toString() + String.format(
            "\nMasque : %d.%d.%d.%d (/%d)\nAdresse Début : %d.%d.%d.%d\nAdresse Fin : %d.%d.%d.%d",
            masque[0], masque[1], masque[2], masque[3], getMasqueEnBits(),
            adresseDebut[0], adresseDebut[1], adresseDebut[2], adresseDebut[3],
            adresseFin[0], adresseFin[1], adresseFin[2], adresseFin[3]
        );
    }
}

*/

/*
public class Reseau extends Adresseip {
    private int masque;
    private String adresseDebut;
    private String adresseFin;

    public Reseau(String ip, int masque) throws Invalidipexception {
        super(ip);
        this.masque = masque;
        calculerPlageAdresse();
    }

    public void calculerPlageAdresse() {
        int[] octets = getOctets();
        int bitsReseau = masque;
        int bitsHost = 32 - bitsReseau;

        int nbAdresses = (int) Math.pow(2, bitsHost);
        int[] debut = octets.clone();
        int[] fin = octets.clone();

        debut[3] = 0;
        fin[3] = nbAdresses - 1;

        adresseDebut = convertirEnString(debut);
        adresseFin = convertirEnString(fin);
    }

    private String convertirEnString(int[] octets) {
        return octets[0] + "." + octets[1] + "." + octets[2] + "." + octets[3];
    }

    public String getAdresseDebut() {
        return adresseDebut;
    }

    public String getAdresseFin() {
        return adresseFin;
    }
}
*/
/*
public class Reseau extends Adresseip {
    private String masque;
    private String adresseDebut;
    private String adresseFin;

    public Reseau(String iP, String masque) {
        super(ip);
        this.masque = masque;
    }
    
    public void calculerPlageAdresse() {
        // Logique pour calculer la plage d'adresses
        this.adresseDebut = "192.168.1.0";
        this.adresseFin = "192.168.1.255";
    }
    
    public String getMasqueEnBits() {
        // Convertir le masque en bits
        return "11111111.11111111.11111111.00000000";
    }
}
*/

public class Reseau extends Adresseip {
    private String masque;
    private String adresseDebut;
    private String adresseFin;

    public Reseau(String ip, String masque) throws Invalidipexception {
        super(ip);
        this.masque = masque;
    }

    public void calculerPlageAdresse() {
        // Exemple de calcul de plage d'adresses selon la classe IP
        if (getClasse().equals("A")) {
            this.adresseDebut = "192.168.0.0";
            this.adresseFin = "192.168.255.255";
        } else if (getClasse().equals("B")) {
            this.adresseDebut = "128.0.0.0";
            this.adresseFin = "128.255.255.255";
        } else if (getClasse().equals("C")) {
            this.adresseDebut = "192.168.1.0";
            this.adresseFin = "192.168.1.255";
        } else {
            this.adresseDebut = "Invalide";
            this.adresseFin = "Invalide";
        }
    }

    public String getMasqueEnBits() {
        // Conversion du masque en bits (exemple simplifié)
        return "11111111.11111111.11111111.00000000";
    }

    public String getAdresseDebut() {
        return adresseDebut;
    }

    public String getAdresseFin() {
        return adresseFin;
    }
}
