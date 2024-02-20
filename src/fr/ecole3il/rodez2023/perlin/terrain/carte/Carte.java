package fr.ecole3il.rodez2023.perlin.terrain.carte;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurCarte;
import java.util.Scanner;

public class Carte {
    private String nom;

    // Dimensions de la carte
    private int largeur;
    private int hauteur;
// Tableau de terrains représentant la carte
    private Terrain[][] terrains;
//Constructeur pour générer une nouvelle carte à partir d'un générateur
    public Carte(String nom, int largeur, int hauteur, GenerateurCarte generateurCarte) {
        this.nom = nom;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.terrains = generateurCarte.genererCarte(largeur, hauteur);

    }
    // Constructeur pour créer une carte à partir de données lues
    public Carte (String donnesCarte){
            Scanner scanner = new Scanner(donnesCarte);
            // Lecture du nom de la carte
            this.nom = scanner.nextLine();
            // Lecture des dimensions de la carte
            this.largeur = scanner.nextInt();
            this.hauteur = scanner.nextInt();
            this.terrains = new Terrain[largeur][hauteur];
// Lecture des données de terrain
        for (int i = 0; i < largeur; i++) {
            for (int j = 0; j < hauteur; j++) {
                int altitude = scanner.nextInt();
                int hydrometrie = scanner.nextInt();
                int temperature = scanner.nextInt();
                scanner.nextLine(); // pour consommer le retour à la ligne

                // Création du terrain avec les valeurs lues
                terrains[i][j] = new Terrain(hydrometrie, temperature,altitude,nom);
            }
        }

        scanner.close();
    }
    // Accesseur pour le nom de la carte
    public String getNom() {
        return nom;
    }


/*
    public void setNom(String nom) {
        this.nom = nom;
    }
*/


    // Accesseur pour la largeur de la carte
    public int getLargeur() {
        return largeur;
    }


/*
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
*/

    // Accesseur pour la hauteur de la carte
    public int getHauteur() {
        return hauteur;
    }


/*
    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
*/

    // Accesseur pour le tableau de terrains
    public Terrain[][] getTerrains() {
        return terrains;
    }


/*
    public void setTerrains(Terrain[][] terrains) {
        this.terrains = terrains;
    }
*/

    // Méthode pour obtenir un terrain à une position donnée
    public Terrain getTerrain(int x, int y) throws TerrainInexistant {
        if (x < 0 || x >= largeur || y < 0 || y >= hauteur) {
            throw new TerrainInexistant("La case demandée est en dehors des limites de la carte.");
        }
        return terrains[x][y];
    }

}
