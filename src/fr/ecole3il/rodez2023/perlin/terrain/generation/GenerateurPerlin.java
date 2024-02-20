package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.math.BruitPerlin2D;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public class GenerateurPerlin extends GenerateurCarte {

private BruitPerlin2D perlinHydrometrie;
private BruitPerlin2D perlinTemperature;

private BruitPerlin2D perlinAltitude;
    /**
     * Constructeur du générateur de carte.
     *
     * @param graine La graine utilisée pour la génération de la carte.
     */
    public GenerateurPerlin(long graine, double resolution) {
        super(graine);
        // Initialisation des générateurs de bruit de Perlin pour chaque élément du terrain
        this.perlinHydrometrie = new BruitPerlin2D(graine,resolution);
        this.perlinTemperature = new BruitPerlin2D(graine*2,resolution);
        this.perlinAltitude = new BruitPerlin2D(graine*4,resolution);
    }

    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
        // Normalisation des coordonnées (i, j) par rapport à la taille de la carte
        double x = (double) i / largeur;
        double y = (double) j / hauteur;
        // Génération des valeurs de bruit de Perlin pour chaque élément du terrain
        double hydrometrie = perlinHydrometrie.bruit2D(x, y);
        double temperature = perlinTemperature.bruit2D(x, y);
        double altitude = perlinAltitude.bruit2D(x, y);

        String nom = null; // Le nom n'est pas défini ici, à adapter selon vos besoins
        return new Terrain(hydrometrie,temperature,altitude,nom);
    }
}
