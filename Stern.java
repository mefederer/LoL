package model;

import processing.core.PApplet;

/**
repräsentiert Stern-Objekt 
 */
public class Stern{

	public float x;
	public float y;
	int myColor = 0xFFCCAAFF;

	public Stern(float x, float y){
		this.x = x;
		this.y = y;
	}

	/*public void draw(){
  fill(#FFFFFF);
  circle(x,y,10);
}*/

	public void draw(PApplet window){
		window.pushMatrix();
		window.translate(x,y);
		window.rotate(window.frameCount / 100.0f);
		star(0, 0, 8, 15, 5, window);
		window.popMatrix();
	}

	/**
	 * draws a star
	 */
	void star(float x, float y, float radius1, float radius2, int npoints, PApplet window) {
		float angle = PApplet.TWO_PI / npoints;
		float halfAngle = angle/2.0f;
		window.fill(this.myColor);
		window.stroke(255);
		window.beginShape();
		for (float a = 0; a < PApplet.TWO_PI; a += angle) {
			float sx = x + PApplet.cos(a) * radius2;
			float sy = y + PApplet.sin(a) * radius2;
			window.vertex(sx, sy);
			sx = x + PApplet.cos(a+halfAngle) * radius1;
			sy = y + PApplet.sin(a+halfAngle) * radius1;
			window.vertex(sx, sy);
		}
		window.endShape(PApplet.CLOSE);
	}

}