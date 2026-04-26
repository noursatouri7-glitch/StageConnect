import java.util.ArrayList;

public class GestionOffres {

    private ArrayList<OffreStage> listeOffres;

    public GestionOffres() {
        listeOffres = new ArrayList<>();
    }

    // Ajouter une offre
    public void ajouterOffre(OffreStage offre) {
        listeOffres.add(offre);
        System.out.println("Offre ajoutée avec succès.");
    }

    // Afficher toutes les offres
    public void afficherOffres() {
        if (listeOffres.isEmpty()) {
            System.out.println("Aucune offre disponible.");
        } else {
            System.out.println("===== Liste des offres =====");
            for (OffreStage o : listeOffres) {
                o.afficherOffre();
            }
        }
    }

    // Modifier une offre par ID
    public void modifierOffre(int id, String nouveauTitre, String nouveauLieu, int nouvelleDuree, double nouveauSalaire) {
        for (OffreStage o : listeOffres) {
            if (o.getId() == id) {
                o.setTitre(nouveauTitre);
                o.setLieu(nouveauLieu);
                o.setDuree(nouvelleDuree);
                o.setSalaire(nouveauSalaire);

                System.out.println("Offre modifiée avec succès.");
                return;
            }
        }

        System.out.println("Offre introuvable.");
    }

    // Supprimer une offre
    public void supprimerOffre(int id) {
        for (int i = 0; i < listeOffres.size(); i++) {
            if (listeOffres.get(i).getId() == id) {
                listeOffres.remove(i);
                System.out.println("Offre supprimée avec succès.");
                return;
            }
        }

        System.out.println("Offre introuvable.");
    }

    // Rechercher offre par lieu
    public void rechercherParLieu(String lieu) {
        boolean trouve = false;

        for (OffreStage o : listeOffres) {
            if (o.getLieu().equalsIgnoreCase(lieu)) {
                o.afficherOffre();
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Aucune offre trouvée à " + lieu);
        }
    }
}