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
		int pr = 0;
		int pg = 0;
		int pb = 0;
		while(pr < 8) {
		println( red(pixels[pr]));
			pr = pr + 1;

			
		}
		while(pg < 8) {
		println( red(pixels[pg]));
			pg = pg + 1;
	
  }
		while(pb < 8) {
		println( red(pixels[pb]));
			pb = pb + 1;
		

			}
		}