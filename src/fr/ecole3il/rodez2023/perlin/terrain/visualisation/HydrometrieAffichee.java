package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

// Définition de l'énumération HydrometrieAffichee qui représente les niveaux d'hydrométrie possibles
    public enum HydrometrieAffichee {
        SEC, // Niveau d'hydrométrie sec
        MOYEN, // Niveau d'hydrométrie moyen
        HUMIDE; // Niveau d'hydrométrie humide

    // Méthode statique pour déterminer le niveau d'hydrométrie en fonction de la valeur d'hydrométrie donnée
        public static HydrometrieAffichee determinerHydrometrie(double hydrometrie) {
            // Si l'hydrométrie est inférieure à 0.33, retourne SEC
            if (hydrometrie < 0.33) return SEC;
            // Si l'hydrométrie est inférieure à 0.66, retourne MOYEN
            if (hydrometrie < 0.66) return MOYEN;
            // Sinon, retourne HUMIDE
            return HUMIDE;
        }
}
