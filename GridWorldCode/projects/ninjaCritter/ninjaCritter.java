//Abimanyu Ananthu 1A
import info.gridworld.actor.*;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class ninjaCritter extends Critter
{
    public void act()
    {
        if (getGrid() == null)
            return;

        ArrayList<Location> moveLocs = getMoveLocations();
        Location loc = selectMoveLocation(moveLocs);
        makeMove(loc);

        if((int)(Math.random()*10)==1)
        	throwstar();
    }
  	public void throwstar(){
		Location next = getLocation().getAdjacentLocation(getDirection());
		if (getGrid().isValid(next)){
			if (getGrid().isValid(next)){
				if (!(getGrid().get(next) instanceof Rock)&&!(getGrid().get(next) instanceof Flower)){
					ThrowingStar a = new ThrowingStar(getDirection());
					a.putSelfInGrid(getGrid(), next);
				}
			}
		}

	}
   	public void makeMove(Location loc)
    {
        if (loc == null)
            removeSelfFromGrid();
        else
            moveTo(loc);
    }
}
