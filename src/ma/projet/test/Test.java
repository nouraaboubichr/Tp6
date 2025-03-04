package ma.projet.test;

import ma.projet.bean.Personne;
import ma.projet.bean.Profil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dateNaiss = sdf.parse("02/06/1970");

            Profil directeurProfil = new Profil(1, "DIR", "Directeur");
            Profil employeProfil = new Profil(2, "EMP", "Employé");

            Personne directeur = new Personne(1, "SAIMI", "Karim", dateNaiss, 20000, directeurProfil);
            Personne employe = new Personne(2, "ALI", "Ahmed", dateNaiss, 8000, employeProfil);

            directeur.affiche();
            directeur.afficherNouveauSalaire();

            System.out.println();

            employe.affiche();
            employe.afficherNouveauSalaire();

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
