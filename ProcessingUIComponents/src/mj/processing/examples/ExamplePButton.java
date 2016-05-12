package mj.processing.examples;

import mj.processing.button.PButton;
import processing.core.PApplet;

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
