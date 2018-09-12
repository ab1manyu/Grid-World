//Abimanyu Ananthu 1A
import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

public class ThrowingStar extends Flower{

    public ThrowingStar(int d){
		setDirection(d);
    }
    public void act(){
		move();
	}
	public void move(){
		Grid<Actor> g = getGrid();
		if(g==null){
			return;
		}
		Location loc = getLocation();
		Location next = getLocation().getAdjacentLocation(getDirection());
		if(g.isValid(next)){
			if(g.get(next)==null)
				moveTo(next);
			else if(g.get(next)instanceof Rock){
				removeSelfFromGrid();
			}
			else
				removeSelfFromGrid();
				g.get(next).removeSelfFromGrid();
		}
		else
			removeSelfFromGrid();
	}


}
