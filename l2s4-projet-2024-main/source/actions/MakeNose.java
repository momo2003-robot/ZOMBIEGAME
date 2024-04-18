package actions;

import actors.Survivor;

public class MakeNose extends Action{
	public MakeNose() {
		super(1);
	}
	@Override
	public void execute(Survivor s) {
		if(this.nbpoints <= s.getActionPoints()) {
			s.getCell().increaseSound();
			s.setActionPoints(s.getActionPoints() - this.nbpoints);			
		}
	}
	@Override
	public String toString() {
        return "MakeNoise";
    }
}
