package com.product;

public class Produit {

    private String marque;
    private double prix;
    private String categorie;
    private double remise; // 0.1 = 10%

    // Constructeur
    public Produit(String marque, double prix, String categorie) {
        this.marque = marque;
        this.prix = prix;
        this.categorie = categorie;

        // تحديد remise حسب الثمن
        if (prix > 500) {
            this.remise = 0.2; // 20%
        } else {
            this.remise = 0.1; // 10%
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

    // Calcul prix avec remise
    public double calculerPrixAvecRemise() {
        return prix - (prix * remise);
    }

    // Affichage
    public void afficherDetail() {
        System.out.println("Marque : " + marque);
        System.out.println("Categorie : " + categorie);
        System.out.println("Prix initial : " + prix);
        System.out.println("Remise : " + (remise * 100) + "%");
        System.out.println("Prix final : " + calculerPrixAvecRemise());
    }
}