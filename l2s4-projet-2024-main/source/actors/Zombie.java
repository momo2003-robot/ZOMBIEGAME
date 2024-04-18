package actors;
import actions.*;
import board.Cell;

/**
 * Represents a zombie actor in the game.
 */
public class Zombie extends Actors  {
    protected int damage;
    private static int COUNTER = 0;

    /**
     * Constructs a zombie with the specified life points, starting cell, damage, and name.
     * @param lifePoints The life points of the zombie.
     * @param cell The starting cell of the zombie.
     * @param damage The damage inflicted by the zombie.
     * @param name The name of the zombie.
     */
    public Zombie(int lifePoints, Cell cell, int damage, String name){
        super(lifePoints, cell, "");
        this.damage = damage;
        this.name= "Zombie"+(Zombie.COUNTER++);    }

    /**
     * Returns a string representation of the zombie.
     * @return The name of the zombie.
     */
    public String toString() {
        return this.getName();
    }

    public void takeDamage(int damage){
        if (this.lifePoints >=0){
            this.lifePoints -=damage;
        }
    }
}
