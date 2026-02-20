package com.product;

public class Main {
    public static void main(String[] args) {

        Produit p1 = new Produit("Nike", 1000, "Chaussures");
        Produit p2 = new Produit("Adidas", 300, "T-shirt");

        p1.afficherDetail();
        System.out.println("---------------");
        p2.afficherDetail();
    }
}