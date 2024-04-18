import actors.FighterRole;
import actors.Role;
import actors.Survivor;
import board.*;

public class MainTest {

		public static void main(String[] args){
			Board board = new Board(5,5);
			board.printBoard();
			Survivor survivor1 = new Survivor(board,board.getCell(0,0),"survivor1");
			survivor1.getCell().displayDoors();
			survivor1.openDoor(DoorPosition.BOTTOM);
			
			
			
		}
}