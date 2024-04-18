package Board;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Board.Cell;

public class CellTest {

    @Test
    public void testCellInitialization() {
        Cell cell = new Cell(1, 2);

        assertEquals(1, cell.getX());
        assertEquals(2, cell.getY());

    }

    @Test
    public void testSetContent() {
        Cell cell = new Cell(1, 2);
        cell.setchar('X');

        assertEquals('X', cell.getC());
    }

}
