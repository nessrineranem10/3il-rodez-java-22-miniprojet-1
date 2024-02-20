package fr.ecole3il.rodez2023.perlin.terrain.elements;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;

public class Terrain {
    private double hydrometrie; // Niveau d'humidité du terrain
    private double temperature; // Température du terrain
    private double altitude; // Altitude du terrain
    private String nom; // Nom du terrain

    // Constructeur de la classe Terrain
    public Terrain(double hydrometrie, double temperature, double altitude, String nom) {
        this.hydrometrie = hydrometrie;
        this.temperature = temperature;
        this.altitude = altitude;
        this.nom = nom;
    }
// Méthode pour obtenir le niveau d'humidité du terrain
    public double getHydrometrie() {
        return hydrometrie;
    }

    // Méthode pour définir le niveau d'humidité du terrain
    public void setHydrometrie(double hydrometrie) {
        if (hydrometrie < 0 || hydrometrie > 1) {
            throw new MauvaiseValeurException("l'hydrométrie doit être comprises entre 0 et 1");
        }
        this.hydrometrie = hydrometrie;
    }

    // Méthode pour obtenir la température du terrain
    public double getTemperature() {
        return temperature;
    }

    // Méthode pour définir la température du terrain
    public void setTemperature(double temperature) {
        if (temperature < -1 || temperature > 1) {
            throw new MauvaiseValeurException("la température doit être comprise entre 0 et 1.");
        }
        this.temperature = temperature;
    }

    // Méthode pour obtenir l'altitude du terrain
    public double getAltitude() {
        return altitude;
    }

    // Méthode pour définir l'altitude du terrain
    public void setAltitude(double altitude) {
        if (altitude < 0 || altitude > 1) {
            throw new MauvaiseValeurException("l'altitude entre -1 et 1.");
        }

        this.altitude = altitude;
    }

    // Méthode pour obtenir le type de terrain en utilisant un détermineur de terrain
    public TypeTerrain getTypeTerrain(DetermineurTerrain dt) {
        return dt.determinerTerrain(hydrometrie,temperature,altitude);
    }
}
