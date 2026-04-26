public class OffreStage {

    private int id;
    private String titre;
    private String description;
    private String lieu;
    private int duree;
    private double salaire;

    public OffreStage(int id, String titre, String description, String lieu, int duree, double salaire) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.lieu = lieu;
        this.duree = duree;
        this.salaire = salaire;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public void afficherOffre() {
        System.out.println("ID : " + id);
        System.out.println("Titre : " + titre);
        System.out.println("Description : " + description);
        System.out.println("Lieu : " + lieu);
        System.out.println("Durée : " + duree + " mois");
        System.out.println("Salaire : " + salaire + " DT");
        System.out.println("----------------------------");
    }
}
