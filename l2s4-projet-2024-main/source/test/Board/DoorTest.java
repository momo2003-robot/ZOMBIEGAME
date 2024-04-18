package Board ;
import org.junit.Test;
import static org.junit.Assert.*;

public class DoorTest {


    @Test
    public void testOpenDoor() {
        Door door = new Door(DoorPosition.RIGHT);
        assertFalse(door.isOpen());

        door.open();
        assertTrue(door.isOpen());
    }

    @Test
    public void testCloseDoor() {
        Door door = new Door(DoorPosition.TOP);
        door.open();
        assertTrue(door.isOpen());

        door.close();
        assertFalse(door.isOpen());
    }

    @Test
    public void testGetPosition() {
        Door door = new Door(DoorPosition.BOTTOM);
        assertEquals(DoorPosition.BOTTOM, door.getPosition());
    }
}
