import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;
import org.junit.Assert;
import org.junit.Test;


public class TypeTerrainTest {

    @Test
    public void getNomTerrainTest(){
        TypeTerrain t = TypeTerrain.OCEAN;
        Assert.assertEquals(t.toString(),"ocean.png");
    }
}
