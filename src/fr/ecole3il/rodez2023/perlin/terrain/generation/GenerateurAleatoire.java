package fr.ecole3il.rodez2023.perlin.terrain.generation;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurCarte;



public class GenerateurAleatoire extends GenerateurCarte {
    public GenerateurAleatoire(long graine){
        super(graine);

    }

    // Méthode pour générer une carte aléatoire
@Override
    public Terrain [][]genererCarte(int largeur, int hauteur){

    // Création d'un tableau de Terrain pour représenter la carte
        Terrain [][] carte = new Terrain[largeur][hauteur];

    // Parcours de la carte pour générer les terrains
    for (int i = 0; i < largeur; i++) {
        for (int j = 0; j < hauteur; j++) {
            // Générer des valeurs "aléatoires"
            String nom = "Terrain_" + i + "_" + j;
            int typeTerrain = (i + j) % 3; // Exemple de génération aléatoire simple
            int altitude = (i * j) % 100; // Exemple de génération aléatoire simple
            int hydrometrie = ((i + j) * 2) % 100; // Exemple de génération aléatoire simple

            // Créer un nouveau terrain avec les valeurs pseudo-aléatoires
            carte[i][j] = new Terrain(hydrometrie, typeTerrain, altitude, nom);
        }
    }

    return carte;
}

    // Méthode pour générer un terrain spécifique (non utilisée dans ce générateur)
    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
        return null;
    }


}

