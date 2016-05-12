package mj.processing.examples;

import mj.processing.button.PCheckBox;
import mj.processing.constants.UIConstants;
import processing.core.PApplet;

public class ExamplePCheckBox extends PApplet{

	private PCheckBox checkBox1;
	private PCheckBox checkBox2;
	
	public static void main(String[] args) {
		PApplet.main(ExamplePCheckBox.class.getName());
	}
	
	public void settings(){
		size(500, 500);
		
	}
	
	public void setup(){
		checkBox1 = new PCheckBox(100, 100, 12, "first checkBox", this);
		checkBox1.setMarkerSymbol(UIConstants.CROSS);
		this.registerMethod("mouseEvent", checkBox1);
		
		checkBox2 = new PCheckBox(100, 120, 12, "second checkBox", this);
		checkBox2.setMarkerSymbol(UIConstants.TICKMARK);
		this.registerMethod("mouseEvent", checkBox2);
		
	}
	
	public void draw(){
		background(220);
		
		checkBox1.draw();
		checkBox2.draw();
		
		if(checkBox1.isChecked()){
			strokeWeight(1);
			fill(255);
			rect(200, 200, 50 ,50);
		}
		
		if(checkBox2.isChecked()){
			strokeWeight(1);
			fill(255);
			ellipse(200, 300, 50, 30);
		}
	
	}
	
}
