package board;
import java.util.List;

import actors.*;
public class Manhole extends Cell{
	private List<Zombie>zombies ;
	public Manhole(Board board,int x , int y) {
		super(board,x,y);
		super.c = 'M';
	}
	
}
