package actions;
import actors.*;



public abstract class Action {
	protected int nbpoints;
	protected Zombie zombie;

	public Action(int nbpoints) {
		this.nbpoints = nbpoints;
		}
	public void execute(Survivor s) {
		
	}
	
	public String toString() {
		return "";
    }
}
