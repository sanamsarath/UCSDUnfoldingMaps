package GUImodule;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import processing.core.*;

public class MyDisplay extends PApplet {

 // setup method creates the display window	
    private PImage bg;
    
    Date dNow = new Date( );
    Calendar calendar = GregorianCalendar.getInstance();
    int hour;
	
	public void setup(){
	 size(displayWidth,displayHeight);
	 background(153);
	 String url = "C:\\Users\\sanam\\Downloads\\novak.jpg";
	 bg = loadImage(url,"jpg");
	 bg.resize(width,0);
     
 }
 
 //draw method displays the output
	public void draw(){
		image(bg, 0, 0);
		ellipse(width/8, height/8, width/8, width/8);
		
		hour = calendar.get(calendar.HOUR);
		int r = 255;
		int g = (255/12)*(12-hour);
		int b = 0;
		
		fill(255,g,b);
		//
	}

}