package mj.processing.examples;

import mj.processing.button.PButton;
import processing.core.PApplet;

/**
 * Example for the usage of PButton.
 * 
 * @author Mathias Jahnke, Technische Universit&auml;t M&uuml;nchen, <a href="http://www.lfk.bgu.tum.de">Chair of Cartography</a>
 * @version 0.0.1
 * @since 12.05.2016
 *
 */
public class ExamplePButton extends PApplet{
	
	private PButton button1;
	private PButton button2;
	
	public static void main(String[] args) {
		PApplet.main(ExamplePButton.class.getName());
	}
	
	public void settings(){
		size(500, 500);
	}
	
	public void setup(){
		button1 = new PButton(200, 200, "first PButton", this);
		
		button2 = new PButton(200, 250, "second PButton", this);
	}
	
	public void draw(){
		background(220);
		
		button1.draw();
		
		button2.draw();
		
	
	}
	

}
