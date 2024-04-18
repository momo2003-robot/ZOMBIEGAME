package equipements;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChainSawTest {

    @Test
    public void testChainSawConstructor() {
        ChainSaw chainSaw = new ChainSaw();

        // Since ChainSaw extends Weapon, we can use the getters from the Weapon class
        assertEquals(5, chainSaw.getThreshold());
        assertEquals(3, chainSaw.getDamage());
        assertEquals(0, chainSaw.getRange());
    }

   
}

