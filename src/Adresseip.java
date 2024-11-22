/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
/*
public class Adresseip {
    private int[] octets;
    private char classe;

    public Adresseip(String adresse) throws Invalidipexception {
        this.octets = new int[4];
        validerAdresse(adresse);
        this.classe = getClasse();
    }

    private void validerAdresse(String adresse) throws Invalidipexception {
        String[] parties = adresse.split("\\.");
        if (parties.length != 4) {
            throw new Invalidipexception("L'adresse IP doit comporter exactement 4 octets.");
        }

        for (int i = 0; i < 4; i++) {
            try {
                int octet = Integer.parseInt(parties[i]);
                if (octet < 0 || octet > 255) {
                    throw new Invalidipexception("Chaque octet doit être compris entre 0 et 255.");
                }
                octets[i] = octet;
            } catch (NumberFormatException e) {
                throw new Invalidipexception("Chaque partie de l'adresse IP doit être un entier.");
            }
        }
    }

    private char getClasse() {
        if (octets[0] >= 1 && octets[0] <= 126) {
            return 'A';
        } else if (octets[0] >= 128 && octets[0] <= 191) {
            return 'B';
        } else if (octets[0] >= 192 && octets[0] <= 223) {
            return 'C';
        } else if (octets[0] >= 224 && octets[0] <= 239) {
            return 'D';
        } else {
            return 'E';
        }
    }

    @Override
    public String toString() {
        return String.format(
            "Adresse IP : %d.%d.%d.%d\nClasse : %c",
            octets[0], octets[1], octets[2], octets[3], classe
        );
    }
}
*/
/*
public class AdresseiP {
    private int[] octets; // Pour stocker les octets de l'adresse IP
    private String classe; // Classe de l'adresse IP

    public AdresseiP(String ip) throws Invalidipexception  {
        this.octets = new int[4];
        validerAdresse(ip);
        this.classe = getClasse();
    }

    public void validerAdresse(String ip) throws Invalidipexception  {
        String[] parts = ip.split("\\.");
        if (parts.length != 4) {
            throw new Invalidipexception ("Adresse IP invalide !");
        }

        for (int i = 0; i < 4; i++) {
            try {
                octets[i] = Integer.parseInt(parts[i]);
                if (octets[i] < 0 || octets[i] > 255) {
                    throw new Invalidipexception ("Chaque octet doit être entre 0 et 255.");
                }
            } catch (NumberFormatException e) {
                throw new Invalidipexception ("Chaque octet doit être un nombre valide.");
            }
        }
    }

    public String getClasse() {
        if (octets[0] >= 1 && octets[0] <= 126) {
            return "A";
        } else if (octets[0] >= 128 && octets[0] <= 191) {
            return "B";
        } else if (octets[0] >= 192 && octets[0] <= 223) {
            return "C";
        } else if (octets[0] >= 224 && octets[0] <= 239) {
            return "D";
        } else {
            return "E";
        }
    }

    public int[] getOctets() {
        return octets;
    }

    public String getClasseIP() {
        return classe;
    }
}
*/

/*
public class Adresseip {
    private int[] octets = new int[4];
    private String classe;
    
    public Adresseip(String ip) throws Invalidipexception{
        if (!validerAdresse(ip)) {
            throw new Invalidipexception("Adresse IP invalide !");
        }
        // Code pour séparer l'adresse IP en octets
    }
    
    public String getClasse() {
        // Logique pour déterminer la classe de l'IP
        return this.classe;
    }
    
    public boolean validerAdresse(String ip) {
        // Valide l'adresse IP (format, plage des octets)
        return true; // Placeholder
    }
}
*/

public class Adresseip {
    private int[] octets = new int[4];
    private String classe;

    public Adresseip(String ip) throws Invalidipexception {
        if (!validerAdresse(ip)) {
            throw new Invalidipexception("Adresse IP invalide !");
        }
        // Séparer l'adresse IP en 4 octets
        String[] parts = ip.split("\\.");
        for (int i = 0; i < 4; i++) {
            this.octets[i] = Integer.parseInt(parts[i]);
        }
    }

    public String getClasse() {
        int premierOctet = this.octets[0];
        if (premierOctet >= 1 && premierOctet <= 127) {
            this.classe = "A";
        } else if (premierOctet >= 128 && premierOctet <= 191) {
            this.classe = "B";
        } else if (premierOctet >= 192 && premierOctet <= 223) {
            this.classe = "C";
        } else {
            this.classe = "Invalide";
        }
        return this.classe;
    }

    public boolean validerAdresse(String ip) {
        String[] parts = ip.split("\\.");
        if (parts.length != 4) {
            return false;
        }
        for (String part : parts) {
            try {
                int octet = Integer.parseInt(part);
                if (octet < 0 || octet > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}

