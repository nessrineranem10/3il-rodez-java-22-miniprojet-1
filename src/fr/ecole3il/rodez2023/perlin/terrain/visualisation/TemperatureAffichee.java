package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

    public enum TemperatureAffichee {
        FROID, TEMPERE, CHAUD;

// Méthode pour déterminer la catégorie de température en fonction de la valeur donnée
        public static TemperatureAffichee determinerTemperature(double temperature) {
            // Si la température est inférieure à 0.33, elle est considérée comme FROIDE
            if (temperature < 0.33) return FROID;
            // Si la température est inférieure à 0.66 mais supérieure ou égale à 0.33, elle est considérée comme TEMPEREE
            if (temperature < 0.66) return TEMPERE;
            // Sinon, la température est considérée comme CHAUDE
            return CHAUD;
        }
    }

