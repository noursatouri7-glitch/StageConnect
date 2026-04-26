package com.stageconnect.models;

public class Candidature {

    private Etudiant etudiant;
    private OffreStage offre;
    private String statut;

    public Candidature(Etudiant etudiant, OffreStage offre) {
        this.etudiant = etudiant;
        this.offre = offre;
        this.statut = "En attente";
    }

    public void accepter() {
        statut = "Acceptée";
    }

    public void refuser() {
        statut = "Refusée";
    }

    public void afficher() {
        System.out.println(etudiant.getNom() + " -> " + offre.getTitre() + " (" + statut + ")");
    }

    public String getStatut() {
        return statut;
    }
}
