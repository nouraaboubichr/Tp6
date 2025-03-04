package ma.projet.bean;

public class Profil {
    private int id;
    private String code;
    private String libelle;

    public Profil(int id, String code, String libelle) {
        this.id = id;
        this.code = code;
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }
}
