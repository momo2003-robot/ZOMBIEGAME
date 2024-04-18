package actors;

import equipements.Pistol;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SurvivorTest {

    @Test
    public void testSurvivorInitialization() {
        Role role = new Role("Warrior");
        Survivor survivor = new Survivor(1, 2, role);

        assertEquals(1, survivor.getX());
        assertEquals(2, survivor.getY());
        assertEquals(1, survivor.getLevel());
        assertNotNull(survivor.getWeapon());
        assertEquals(5, survivor.getLifePoints());
        assertEquals(role, survivor.getRole());

        // Assuming you have a Pistol class
        assertTrue(survivor.getWeapon() instanceof Pistol);
    }
}
