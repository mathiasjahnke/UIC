package mj.processing.examples;

import mj.processing.button.PButtonGroup;
import mj.processing.button.PRadioButton;
import processing.core.PApplet;

public class ExamplePRadioButton extends PApplet{

	private PRadioButton rb1;
	private PRadioButton rb2;
	private PRadioButton rb3;
	
	private PButtonGroup bg1;
	
	public static void main(String[] args) {
		PApplet.main(ExamplePRadioButton.class.getName());
	}
	
	public void settings(){
		size(500, 500);
	}
	
	public void setup(){
		rb1 = new PRadioButton(50, 50, 6, "first radio button", this);
		rb1.setChecked(true);
		rb2 = new PRadioButton(50, 75, 6, "second radio button", this);
		rb3 = new PRadioButton(50, 100, 6, "third radio button", this);
		
		bg1 = new PButtonGroup();
		this.registerMethod("mouseEvent", bg1);
		bg1.add(rb1);
		bg1.add(rb2);
		bg1.add(rb3);
		
	}
	
	public void draw(){
		background(220);
		rb1.draw();
		rb2.draw();
		rb3.draw();
		
		if (rb1.isChecked()) {
			fill(color(120, 120, 120));
		} else if (rb3.isChecked()){
			fill(color(50, 126, 35));
		} else if(rb2.isChecked()){
			fill(color(120, 54, 189));
		}
		ellipseMode(CENTER);
		ellipse(250, 250, 100, 75);
		
	}

}
