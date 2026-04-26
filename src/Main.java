package com.stageconnect.models;

public class Main {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("     StageConnect - Démonstration V2");
        System.out.println("==========================================");

        /*
         * Scénario 1 : Inscription et authentification
         */
        System.out.println("\n📌 Scénario 1 : Inscription et authentification");

        System.out.println("1. Inscription de l'étudiant Ali...");
        Utilisateur.sInscrire("Ali", "ali@mail.com", "1234");

        System.out.println("2. Inscription de l'étudiante Sarra...");
        Utilisateur.sInscrire("Sarra", "sarra@mail.com", "abcd");

        System.out.println("3. Tentative d'inscription avec un email déjà utilisé...");
        Utilisateur.sInscrire("Ali2", "ali@mail.com", "9999");

        System.out.println("4. Connexion de Ali...");
        Utilisateur utilisateurConnecte = Utilisateur.seConnecter("ali@mail.com", "1234");

        if (utilisateurConnecte != null) {
            System.out.println("✅ Utilisateur connecté : " + utilisateurConnecte);
        }

        /*
         * Scénario 2 : Publication et gestion des offres
         */
        System.out.println("\n📌 Scénario 2 : Publication et gestion des offres de stage");

        GestionOffres gestionOffres = new GestionOffres();

        Entreprise entreprise1 = new Entreprise(
                "Tech Solutions Tunisie",
                "contact@techsolutions.tn",
                "71 000 111"
        );

        Entreprise entreprise2 = new Entreprise(
                "Digital Startup",
                "rh@digitalstartup.tn",
                "22 555 888"
        );

        OffreStage offre1 = new OffreStage(
                1,
                "Stage Développement Java",
                "Développement d'une application console en Java",
                "Tunis",
                3,
                450.0
        );

        OffreStage offre2 = new OffreStage(
                2,
                "Stage Data Analysis",
                "Analyse de données avec Excel et Python",
                "Sousse",
                4,
                500.0
        );

        OffreStage offre3 = new OffreStage(
                3,
                "Stage Marketing Digital",
                "Gestion des réseaux sociaux et campagnes publicitaires",
                "Tunis",
                2,
                350.0
        );

        System.out.println("1. Publication des offres par les entreprises...");
        entreprise1.publierOffre(gestionOffres, offre1);
        entreprise2.publierOffre(gestionOffres, offre2);
        entreprise1.publierOffre(gestionOffres, offre3);

        System.out.println("2. Affichage de toutes les offres disponibles...");
        gestionOffres.afficherOffres();

        /*
         * Scénario 3 : Recherche et filtrage des stages
         */
        System.out.println("\n📌 Scénario 3 : Recherche des stages par lieu");

        System.out.println("Recherche des offres disponibles à Tunis...");
        gestionOffres.rechercherParLieu("Tunis");

        /*
         * Scénario 4 : Candidature et suivi
         */
        System.out.println("\n📌 Scénario 4 : Candidature à une offre");

        Etudiant etudiant = new Etudiant("Ali");

        System.out.println("1. L'étudiant " + etudiant.getNom() + " choisit l'offre : " + offre1.getTitre());

        Candidature candidature1 = new Candidature(etudiant, offre1);

        System.out.println("2. Création de la candidature...");
        candidature1.afficher();

        System.out.println("3. Ajout de la candidature dans le dossier de l'étudiant...");
        etudiant.ajouterCandidature(candidature1);

        System.out.println("4. Affichage des candidatures de l'étudiant...");
        etudiant.afficherCandidatures();

        System.out.println("5. L'entreprise accepte la candidature...");
        candidature1.accepter();

        System.out.println("6. Nouveau statut de la candidature...");
        candidature1.afficher();

        /*
         * Scénario 5 : Tableau de bord administrateur
         */
        System.out.println("\n📌 Scénario 5 : Tableau de bord administrateur");

        Admin admin = new Admin("Nour");

        admin.afficherMessage();

        int nbEtudiants = 2;
        int nbEntreprises = 2;
        int nbOffres = 3;

        admin.afficherStatistiques(nbEtudiants, nbEntreprises, nbOffres);

        System.out.println("\nAction admin : suppression d'un utilisateur test.");
        admin.supprimerUtilisateur("Ali2");

        /*
         * Scénario 6 : Modification et suppression d'une offre
         */
        System.out.println("\n📌 Scénario 6 : Modification et suppression d'une offre");

        System.out.println("1. Modification de l'offre #2...");
        gestionOffres.modifierOffre(
                2,
                "Stage Data Analyst Junior",
                "Sfax",
                4,
                550.0
        );

        System.out.println("2. Liste des offres après modification...");
        gestionOffres.afficherOffres();

        System.out.println("3. Suppression de l'offre #3...");
        gestionOffres.supprimerOffre(3);

        System.out.println("4. Liste des offres après suppression...");
        gestionOffres.afficherOffres();

        System.out.println("\n==========================================");
        System.out.println("     Fin de la démonstration StageConnect V2");
        System.out.println("==========================================");
    }
}