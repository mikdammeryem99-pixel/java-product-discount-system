package com.product;

public class Test {

    public static void main(String[] args) {

        Produit p1 = new Produit("PC HP", 8000.9, "Tech");
        Produit p2 = new Produit("Cle USB", 200, "Tech");

        p1.afficherDetails();
        p2.afficherDetails();

        System.out.println("Prix avec remise de " + p1.getMarque() + " = " + p1.prixRemise());
        System.out.println("Prix avec remise de " + p2.getMarque() + " = " + p2.prixRemise());
    }
}