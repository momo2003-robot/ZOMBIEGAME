package actions;
import actors.*;
import board.*;
import java.util.*;


public class Move extends Action{
	List<Door> DoorsNearBy = new ArrayList<>();
	Board board;
	Survivor survivor;
	public Move() {
		super(1);
	}
	//the execution in s class would consist on the door that the survivor would be choosing to move to
	public void execute(Survivor s,DoorPosition choice) {
	    	if(s.getCell().getDoors().containsKey(choice)) {
	    		if(s.getCell().getDoors().get(choice).isOpen()) {
	    			if(choice==DoorPosition.LEFT) {
	    				s.setCell(s.getBoard().getCell(s.getCell().getX()-1,s.getCell().getY()));
	    				System.out.println("Déplacement à gauche");
	    			}else if(choice==DoorPosition.RIGHT) {
	    				s.setCell(s.getBoard().getCell(s.getCell().getX()+1,s.getCell().getY()));
	    				System.out.println("Déplacement à droite");
	    			}else if(choice==DoorPosition.TOP) {
	    				s.setCell(s.getBoard().getCell(s.getCell().getX(),s.getCell().getY()-1));
	    				System.out.println("Déplacement en haut");
	    			}else if(choice==DoorPosition.BOTTOM) {
	    				s.setCell(s.getBoard().getCell(s.getCell().getX(),s.getCell().getY()+1));
	    				System.out.println("Déplacement en bas");
	    			}
	    		} else {
	    			System.out.println("Vous ne pouvez pas passer par là.Cette porte est fermé.");
	    		}
	    	} else {
	    		System.out.println("Il n'existe pas d'issue par ici.");
	    	}
	    }
	//here we are trying to create a method where we see if there are any open doors near the survivor
	//if yes we will be collecting them in an arraylist
	/*
	public List<Door> getOpenDoorsNearBy() {
		int x = survivor.getCell().getX();
		int y = survivor.getCell().getY();
		int[] neighbourOffsests = {-1, 0, 1};
		for (int offsetX : neighbourOffsests) {
			for (int offsetY : neighbourOffsests) {
				if (offsetX == 0 && offsetY == 0) {
					continue;
				}
				Cell cell = s.board.getCell(x + offsetX, y + offsetY);
				cell.getDoor(offsetX)
//s method may still need some debuging

			}
		}
	}
	/*
	        int x = s.cell.getX();
        int y = s.cell.getY();
        int[] neighbourOffsests = {-1, 0, 1};
        for (int offsetX : neighbourOffsests) {
            for (int offsetY : neighbourOffsests) {
                if (offsetX == 0 && offsetY == 0) {
                    continue;
                }
                Cell c = s.board.getCell(x + offsetX, y + offsetY);
                zombiesNearby.addAll(c.getZombies());
            }
        }
        return zombiesNearby;
*/
}
