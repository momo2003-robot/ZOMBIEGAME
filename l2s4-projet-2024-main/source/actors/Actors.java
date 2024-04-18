package actors;

import board.Cell;


/**
 * Represents an actor in the game.
 */
public class Actors {
    protected Cell cell;
    protected int lifePoints;
    protected String name;


    /**
     * Constructs an actor with the specified life points, starting cell, and name.
     * @param lifePoints The life points of the actor.
     * @param cell The starting cell of the actor.
     * @param name The name of the actor.
     */
    public Actors(int lifePoints, Cell cell, String name){
        this.lifePoints = lifePoints;
        this.cell = cell;
        this.name = name;
       
    }

    /**
     * Gets the life points of the actor.
     * @return The life points of the actor.
     */
    public int getLifePoints() {
        return lifePoints;
    }
    public void setLifePoints(int amount){
        this.lifePoints = amount;
    }
    public Cell getCell(){
        return this.cell;
    }
    public void setCell(Cell cell){
        this.cell = cell;
    }

    /**
     * Gets the name of the actor.
     * @return The name of the actor.
     */
    public String getName() {
        return this.name;
    }
}
