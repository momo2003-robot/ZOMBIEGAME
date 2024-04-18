package actions ;
import java.util.*;
import equipements.*;
import board.*;

import actors.Survivor;

public class OpenDoor extends Action {
    private Door door;
    private Survivor survivor;
    private Board board;
 
    public OpenDoor() {
        super(1);
    }

    public void execute(Survivor s,DoorPosition choice) {
    	    	if(s.getCell().getDoors().containsKey(choice)) {
    	    		if(!(s.getCell().getDoors().get(choice).isOpen())) {
    	    			if(choice==DoorPosition.LEFT) {
    	    				s.getBoard().getHorizontalDoor(s.getCell().getX()-1,s.getCell().getY()).open();
    	    				System.out.println("La porte gauche est ouverte");
    	    			}else if(choice==DoorPosition.RIGHT) {
    	    				s.getBoard().getHorizontalDoor(s.getCell().getX()+1,s.getCell().getY()).open();
    	    				System.out.println("La porte droite est ouverte");
    	    			}else if(choice==DoorPosition.TOP) {
    	    				s.getBoard().getVerticalDoor(s.getCell().getX(),s.getCell().getY()-1).open();
    	    				System.out.println("La porte du haut est ouverte");
    	    			}else if(choice==DoorPosition.BOTTOM) {
    	    				s.getBoard().getVerticalDoor(s.getCell().getX(),s.getCell().getY()+1).open();
    	    				System.out.println("La porte du bas est ouverte");
    	    			}
    	    		} else {
    	    			System.out.println("Cette porte est déja ouverte");
    	    		}
    	    	} else {
    	    		System.out.println("Il n'y a pas de porte dans cette direction");
    	    	}
    	    }
}
