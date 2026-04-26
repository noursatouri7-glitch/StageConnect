public class Entreprise {

    private String nom;
    private String email;
    private String telephone;

    public Entreprise(String nom, String email, String telephone) {
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
    }

    public void afficherEntreprise() {
        System.out.println("Entreprise : " + nom);
        System.out.println("Email : " + email);
        System.out.println("Téléphone : " + telephone);
        System.out.println("----------------------------");
    }

    public void publierOffre(GestionOffres gestion, OffreStage offre) {
        gestion.ajouterOffre(offre);
    }
}
