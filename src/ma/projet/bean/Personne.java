package ma.projet.bean;

import ma.projet.inter.IPersonne;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Personne implements IPersonne {
    private int id;
    private String nom;
    private String prenom;
    private Date dateNaiss;
    private double salaire;
    private Profil profil;

    public Personne(int id, String nom, String prenom, Date dateNaiss, double salaire, Profil profil) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
        this.salaire = salaire;
        this.profil = profil;
    }

    @Override
    public void affiche() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        String dateFormatted = sdf.format(dateNaiss);
        
        System.out.println("Je suis " + (profil.getCode().equals("DIR") ? "le directeur " : "l'employé ") +
                nom.toUpperCase() + " " + prenom + " né le " + dateFormatted + " mon salaire est " + salaire + " dh");
    }

    @Override
    public double calculerSalaire() {
        if (profil.getCode().equals("DIR")) {
            return salaire * 1.2; 
        } else {
            return salaire * 1.1; 
        }
    }

    public void afficherNouveauSalaire() {
        System.out.println("Nouveau salaire après augmentation : " + calculerSalaire() + " dh");
    }
}
