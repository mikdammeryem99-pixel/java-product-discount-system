package com.product;

public class Produit {

    private String marque;
    private double prix;
    private String categorie;
    private double remise;

    // Constructeur avec paramètres
    public Produit(String marque, double prix, String categorie) {
        this.marque = marque;
        this.prix = prix;
        this.categorie = categorie;

        // remise 0.2 ila prix > 500 sinon 0.1
        if (prix > 500) {
            this.remise = 0.2;
        } else {
            this.remise = 0.1;
        }
    }

    // Getters
    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public String getCategorie() {
        return categorie;
    }

    public double getRemise() {
        return remise;
    }

    // Setters
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;

        // update remise ila تبدل الثمن
        if (prix > 500) {
            this.remise = 0.2;
        } else {
            this.remise = 0.1;
        }
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    // afficher détails
    public void afficherDetails() {
        System.out.println("Marque: " + marque);
        System.out.println("Prix: " + prix);
        System.out.println("Categorie: " + categorie);
        System.out.println("Remise: " + remise);
        System.out.println("---------------------------");
    }

    // prix après remise
    public double prixRemise() {
        return prix * (1 - remise);
    }
}