package fr.ecole3il.rodez2023.perlin.terrain.carte;


// Définition d'une classe d'exception personnalisée pour signaler un terrain inexistant
public class TerrainInexistant extends IndexOutOfBoundsException{
    // Constructeur prenant en paramètre un message d'erreur
    public TerrainInexistant(String h) {
        // Appel du constructeur de la classe parente (IndexOutOfBoundsException) avec un message explicatif
        super("La case est invalide : " + h);
    }
}
