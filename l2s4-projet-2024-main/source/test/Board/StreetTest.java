package Board;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Board.Street;

public class StreetTest {

    @Test
    public void testStreetInitialization() {
        int maxX = 10;
        int maxY = 10;

        Street street = new Street(maxX, maxY);

        // Ensure that start and end coordinates are within the specified bounds
        assertTrue(street.getStartSX() >= 0 && street.getStartSX() < maxX);
        assertTrue(street.getStartSY() >= 0 && street.getStartSY() < maxY);
        assertTrue(street.getEndSX() >= 0 && street.getEndSX() < maxX);
        assertTrue(street.getEndSY() >= 0 && street.getEndSY() < maxY);

        // Ensure that start and end coordinates are not the same
        assertNotEquals(street.getStartSX(), street.getEndSX());
        assertNotEquals(street.getStartSY(), street.getEndSY());
    }
}
