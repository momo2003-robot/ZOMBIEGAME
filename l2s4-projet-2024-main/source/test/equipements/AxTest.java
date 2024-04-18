package equipements;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AxTest {

    @Test
    public void testAxConstructor() {
        Ax ax = new Ax();

        // Since Ax extends Weapon, we can use the getters from the Weapon class
        assertEquals(4, ax.getThreshold());
        assertEquals(2, ax.getDamage());
        assertEquals(0, ax.getRange());
    }

    
}
