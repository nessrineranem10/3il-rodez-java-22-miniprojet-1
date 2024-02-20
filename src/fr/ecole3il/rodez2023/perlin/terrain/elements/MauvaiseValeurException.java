package fr.ecole3il.rodez2023.perlin.terrain.elements;


// Définition de la classe MauvaiseValeurException qui étend IllegalArgumentException
public class MauvaiseValeurException extends IllegalArgumentException{
    // Constructeur prenant en paramètre un message d'erreur
    public MauvaiseValeurException(String t)


    {
        // Appel du constructeur de la classe parente IllegalArgumentException avec un message d'erreur approprié
        super("La valeur fournie est incorrecte: " + t);
    }
}
