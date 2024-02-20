package fr.ecole3il.rodez2023.perlin.terrain.elements;
import fr.ecole3il.rodez2023.perlin.Utils;

import java.awt.image.BufferedImage;


public enum TypeTerrain {
    COLLINES("Collines", "hills.png"),
    DESERT("Désert", "desert.png"),
    FORET_CONIFERES("Forêt de conifères", "coniferous_forest.png"),
    FORET_FEUILLUS("Forêt de feuillus", "deciduous_forest.png"),
    MARAIS("Marais", "marsh.png"),
    MONTAGNE("Montagne", "mountain.png"),
    OCEAN("Océan", "ocean.png"),
    PLAINE("Plaine", "plain.png"),
    TOUNDRA("Toundra", "tundra.png");

    private String nom; // Nom du type de terrain
    private String cheminImage; // Chemin vers l'image représentant le terrain
    private transient BufferedImage image; // Image du terrain (transient pour la sérialisation)

    // Constructeur
    TypeTerrain(String nomTerrain, String cheminImage){
        this.nom = nom;
        this.cheminImage = cheminImage;
    }

    // Méthode pour obtenir l'image du terrain
    public BufferedImage getImage() {
        // Si l'image n'a pas été chargée, on la charge
        if (image == null) {
            return Utils.chargerTuile(cheminImage);// Utilisation d'une méthode pour charger l'image
        }
        return image;
    }
/** Méthode toString */
    @Override
    public String toString(){
        return nom; // Retourne le nom du terrain
    }
}
