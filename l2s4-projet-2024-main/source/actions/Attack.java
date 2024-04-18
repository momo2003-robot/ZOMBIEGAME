package actions;
import equipements.*;
import listchooser.InteractiveListChooser;
import listchooser.ListChooser;

import java.util.ArrayList;
import java.util.List;

import actors.Survivor;
import actors.Zombie;

public class Attack extends Action{
	private int zombiesKilled;
	private Survivor survivor;
	private Weapon weapon;
	public Attack(Survivor s) {
		super(1);
		this.weapon = weapon;
		this.zombiesKilled = 0;

	}
	//in this method we will be using the list chooser
	//choosing which zombie to attack
	public Zombie zombieToAttack(Survivor s){
		List <Zombie> zombies = s.getZombieNearby();
		ListChooser<Zombie> chooser = new InteractiveListChooser<>();
        Zombie z = chooser.choose("Quel zombie vous voulez executer?",zombies);
		return z;
	}
	public void execute(Survivor s) {
	    int damageDealt = s.getWeapon().getDamage();
		zombie  = this.zombieToAttack(s);
	    zombie.takeDamage(damageDealt);
	    if (zombie.getLifePoints() ==0)
	        zombiesKilled++;
	    }
	}
	
