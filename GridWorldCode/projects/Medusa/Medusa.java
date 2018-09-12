//Abimanyu Ananthu 1A

import info.gridworld.actor.*;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.util.ArrayList;

public class Medusa extends Critter{

    public void act() {
        if (getGrid() == null)
            return;
            Location occupiedloc = getOccupiedLoc();
        processActors(occupiedloc);
        ArrayList<Location> moveLocs = getMoveLocations();
        Location loc = selectMoveLocation(moveLocs);
        makeMove(loc);
    }

    public Location getOccupiedLoc(){

		Location loc = getLocation();
		Location next= loc.getAdjacentLocation(getDirection());

		do{
			next = next.getAdjacentLocation(getDirection());
		}while(getGrid().isValid(next)&&getGrid().get(next)==null);

		if (getGrid().isValid(next))
			return next;
			return null;

	}
    public void processActors(Location loc){

		Grid<Actor> gr = getGrid();
		if(loc!=null){
			if(!(gr.get(loc) instanceof Rock)&&!(gr.get(loc) instanceof Flower)){
				if(gr.get(loc).getDirection()==(getDirection()+180)){
					getGrid().get(loc).removeSelfFromGrid();
					Statue a = new Statue();
					a.putSelfInGrid(getGrid(),loc);
				}
			}
		}
    }
    public void makeMove(Location loc)
    {
       setDirection(getLocation().getDirectionToward(loc));
       super.makeMove(loc);
    }
}
