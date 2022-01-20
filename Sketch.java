import processing.core.PApplet;
import processing.core.PImage;
public class Sketch extends PApplet {
	
	PImage MusicPNG;

  public void settings() {
		//Load image Data
		MusicPNG = loadImage("musicvideo.png");
		//Makes height and width the same as the PNG
    size(MusicPNG.width, MusicPNG.height);
  }

  public void setup() {
    background(0);
		//Draw the image on screen
		image(MusicPNG,0,0);
		loadPixels();
		println( red(pixels[0]));
		println( green(pixels[0]));
		println( blue(pixels[0]));
  }
  public void draw() {
    fill(255);
    ellipse(mouseX, mouseY, 25, 25);
  }
}