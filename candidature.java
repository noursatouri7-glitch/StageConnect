import java.util.ArrayList;

public class OffreStage {

    private String titre;
    private Entreprise entreprise;
    private ArrayList<Candidature> candidatures = new ArrayList<>();

    public OffreStage(String titre, Entreprise entreprise) {
        this.titre = titre;
        this.entreprise = entreprise;
    }

    public String getTitre() {
        return titre;
    }

    public void ajouterCandidature(Candidature c) {
        candidatures.add(c);
    }

    public void afficher() {
        System.out.println(« Offre: «  + titre + «  | Entreprise: «  + entreprise.nom);
    }
}