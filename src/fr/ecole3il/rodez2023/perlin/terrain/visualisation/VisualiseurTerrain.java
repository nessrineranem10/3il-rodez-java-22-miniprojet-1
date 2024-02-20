package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public class VisualiseurTerrain {
    private Carte carte;

    // Constructeur prenant une instance de Carte
    public VisualiseurTerrain(Carte carte) {
        this.carte = carte;
    }
    // Méthode pour récupérer la carte associée
    protected Carte getCarte(){
        return this.carte;
    }

    // Méthode pour obtenir l'altitude affichée à une position (x, y)
    public AltitudeAffichee getAltitudeAffichee(int x, int y){
        // Obtenir le terrain à la position (x, y) depuis la carte
        Terrain terrain = carte.getTerrain(x, y);
        // Déterminer l'altitude affichée à partir de l'altitude du terrain
        return AltitudeAffichee.determinerAltitude(terrain.getAltitude());
    }
    // Méthode pour obtenir l'hydrométrie affichée à une position (x, y)
    public HydrometrieAffichee getHydrometrieAffichee(int x, int y){
        // Obtenir le terrain à la position (x, y) depuis la carte
        Terrain terrain = carte.getTerrain(x, y);
        // Déterminer l'hydrométrie affichée à partir de l'hydrométrie du terrain
        return HydrometrieAffichee.determinerHydrometrie(terrain.getHydrometrie());
    }

    // Méthode pour obtenir la température affichée à une position (x, y)
    public TemperatureAffichee getTemperatureAffichee(int x, int y ){
        // Obtenir le terrain à la position (x, y) depuis la carte
        Terrain terrain = carte.getTerrain(x, y);
        // Déterminer la température affichée à partir de la température du terrain
        return TemperatureAffichee.determinerTemperature(terrain.getTemperature());
    }
}

