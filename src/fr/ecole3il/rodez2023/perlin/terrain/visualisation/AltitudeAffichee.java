package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

// Définition d'un enum pour représenter les différentes altitudes affichées
public enum AltitudeAffichee {
    FOND_MARIN, // Niveau d'altitude représentant le fond marin
    BASSE , // Altitude basse
    MOYENNE, //Altitude moyenne
    ELEVEE; // Altitude élevée

    // Méthode statique pour déterminer l'altitude affichée en fonction de l'altitude donnée

    public static AltitudeAffichee determinerAltitude(double altitude) {
        // Si l'altitude est inférieure à 0, retourner FOND_MARIN
        if (altitude < 0) return FOND_MARIN;
        // Si l'altitude est inférieure à 0.33, retourner BASSE
        if (altitude < 0.33) return BASSE;
        // Si l'altitude est inférieure à 0.66, retourner MOYENNE
        if (altitude < 0.66) return MOYENNE;
        // Sinon, retourner ELEVEE
        return ELEVEE;
    }
}