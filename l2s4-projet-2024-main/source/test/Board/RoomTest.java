package Board;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Board.Room;

public class RoomTest {

    @Test
    public void testRoomInitialization() {
        Room room = new Room(1, 2);

        assertEquals(1, room.getX());
        assertEquals(2, room.getY());
    }
}
