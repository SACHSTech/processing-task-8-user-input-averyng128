/**
 * Description: Demonstrate learning objectives involving mouse and keyboard inputs
 * @Author: A. Ng
 * 
 */

import processing.core.PApplet;

public class Sketch extends PApplet {
	
  float fltR = 0;
  float fltG = 255;
  float fltB = 0;
  String strText = "";
  int intRectX = 0;
	int intRectY = 0;

  public void settings() {
    size(400, 400);
  }


  public void setup() {
    background(30);
  }


  public void draw() {

    //mouse input functions colour changing of shapes and text
    fill(fltR, fltG, fltB);
    rect(intRectX, intRectY, 75, 75);
    // Key variable
    textSize(200);
    text(key, 200, 200);
    //Keyboard input
    textSize(10);
    text(strText, 25, 150);

    //mouse pressed variables
    if (mousePressed){
      stroke(0);
      // mouseX and mouseY variables
      translate(mouseX, mouseY);

      // draw flowers when mouse is pressed
      for (int i = 0; i <= 8; i += 1) {
        rotate(radians(45));
        fill(255, 255, 224);
        ellipse(0, 0, width/100, height/20);  
      }
        fill(0, 0, 0);
        ellipse(0, 0, width/30, height/30);
      }    
    // keyPressed variable
    if(keyPressed){
      if (keyCode == UP) {
        intRectX += 1;
        intRectY += 1;
    } 
  }
    
  }

  //mouse input functions
  public void mousePressed() {
    fltR = 255;
    fltG = 0;
    fltB = 0;
  }
  //mouse input functions
  public void mouseReleased() {
    fltR = 255;
    fltG = 165;
    fltB = 0;
  }
  //mouse input functions
  // Combining input variables and event functions
  public void mouseClicked() {
    fill(255);
    ellipse(0, 0, 75, 75);
    
    fltR = 0;
    fltG = 0;
    fltB = 255;
  }
  //keyboard input function
  public void keyTyped() {
    strText += key;
  }

}