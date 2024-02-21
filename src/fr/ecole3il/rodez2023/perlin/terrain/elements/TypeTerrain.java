package fr.ecole3il.rodez2023.perlin.terrain.elements;
import fr.ecole3il.rodez2023.perlin.Utils;

import java.awt.image.BufferedImage;


public enum TypeTerrain {
    COLLINES("hills.png"),
    DESERT("desert.png"),
    FORET_CONIFERES("coniferous_forest.png"),
    FORET_FEUILLUS("deciduous_forest.png"),
    MARAIS("marsh.png"),
    MONTAGNE("mountain.png"),
    OCEAN("ocean.png"),
    PLAINE("plain.png"),
    TOUNDRA("tundra.png");


    private String fichier; // Nom du type de terrain

   TypeTerrain(String fichier) {
        this.fichier = fichier;
    }


    // Méthode pour obtenir l'image du terrain
    public BufferedImage getImage() {
        System.out.println(this.fichier);
        return Utils.chargerTuile(fichier);// Utilisation d'une méthode pour charger l'image
    }

    /**
     * Méthode toString
     */
    @Override
    public String toString() {
        return this.fichier;

    }
}