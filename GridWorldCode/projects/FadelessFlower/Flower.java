//Abimanyu Ananthu

import info.gridworld.actor.Actor;
import java.awt.Color;

public class Flower extends Actor
{
	private int colorchoose = (int)(Math.random()*9)+1;

    public Flower()
    {
        switch(colorchoose){
			case 1 : setColor(Color.RED);
			break;
			case 2 : setColor(Color.GREEN);
			break;
			case 3 : setColor(Color.BLUE);
			break;
			case 4 : setColor(Color.CYAN);
			break;
			case 5 : setColor(Color.YELLOW);
			break;
			case 6 : setColor(Color.ORANGE);
			break;
			case 7 : setColor(Color.MAGENTA);
			break;
			case 8 : setColor(Color.PINK);
			break;
		}
    }
    public void act(){
		if(colorchoose==9){
        int red = (int)(Math.random()*256);
        int green = (int)(Math.random()*256);
        int blue = (int)(Math.random()*256);

        setColor(new Color(red, green, blue));
		}
    }
}
