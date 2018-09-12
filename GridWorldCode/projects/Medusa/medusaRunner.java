//Abimanyu Ananthu 1A

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

import java.awt.Color;

public class medusaRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(1, 8), new Medusa());
        world.add(new Location(2, 3), new Rock());
        world.show();
    }
}