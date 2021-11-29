package model;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;

/**
 * die berühmte Robi-Klasse
 * @author sven
 *
 */
public class Robi{

	  private float x;
	  private float y;
	  private int score;
	  private int color;
	  private float speed = 3;
	  private int size = 50;
	  
	  Direction dir = Direction.N;
	  
	  /**
	   * dient der Darstellung der Richtung
	   * @author sven
	   *
	   */
	  public enum Direction {
		  N,E,S,W;
	  }
	  
	  
	  
	  /**
	  * Konstruktor, übernimmt Positionsvariablen und Farbe)
	  */
	  public Robi(float x, float y, int myColor){
		  
	    this.x = x;  //this --> greift auf das Attribut des aktuellen Objekts zu
	    this.y = y;
	    this.color = myColor;
	  }
	  
	  public void drawRobi(PApplet window){
		window.stroke(0);
		window.rectMode(window.CENTER);
		window.fill(color);
		window.rect(x,y,size, size, 10);
		window.fill(255);
		window.strokeWeight(3);
		window.circle(x - size/4, y, size/3);
		window.circle(x + size/4,y , size/3);
	  }
	  
	  public int getScore() {
		  return score;
	  }
	  
	  public void addScore(int points) {
		  score += points;
	  }
	  
	  public float getX() {
		  return x;
	  }
	  
	  public float getY() {
		  return y;
	  }
	  
	  public void setX(float x) {
		  this.x = x;
	  }
	  
	  public void setY(float y) {
		  this.y = y;
	  }
	  
	  public void setDirection(Direction dir) {
		  this.dir = dir;
	  }
	  
	  public void move(PApplet window) {
		  switch(dir) {
		  	case N: y = Math.max(0, y - speed); break;
		  	case E: x = Math.min(window.width, x + speed); break;
		  	case S: y = Math.min(window.height, y + speed); break;
		  	case W: x = Math.max(0, x - speed);
		  }
	  }
	  	
	  
	}