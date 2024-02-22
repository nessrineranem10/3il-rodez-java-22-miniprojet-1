import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurAleatoire;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GenerateurAleatoireTest {

    @Test
    public void genererCarteTestEtTaille(){
        GenerateurAleatoire generateur = new GenerateurAleatoire(System.currentTimeMillis());
       Terrain[][] terrains =  generateur.genererCarte(8,5);
        assertEquals(terrains.length,8);

    }
}

