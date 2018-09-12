//Abimanyu Ananthu 1A
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import java.awt.Color;

public class ninjaRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(7, 2), new ninjaCritter());
        world.add(new Location(4, 4), new ninjaCritter());
        world.add(new Location(1, 4), new Rock());
        world.show();
    }
}