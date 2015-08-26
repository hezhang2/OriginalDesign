import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

//Helen Zhang, Block 1, OriginalDesign

boolean overOne, overTwo, overThree, overFour;
int txtSzOne = 10;
int txtSzTwo = 10;
int txtSzThree = 10;
int txtSzFour = 10;

public void setup(){
  	size(400,800);
}
public void draw(){
  	background(200, 213, 213);
  	sections();
}

public void sections(){
	fill(70);
  	hover();
	firstA();
	secondA();
	thirdA();
	fourthA();
}

public void firstA(){
	if (overOne == true){
		if (txtSzOne<50){
		txtSzOne += 5;
		}
	}else{
		if(txtSzOne>10){
			txtSzOne -= 5;
		}
	}
	textSize(txtSzOne);
	text("O N E", 50, 100);
}
public void secondA(){
	if (overTwo == true){
		if(txtSzTwo<50){
			txtSzTwo += 5;
		}
	}else{
		if(txtSzTwo>10){
			txtSzTwo -= 5;
		}
	}
	textSize(txtSzTwo);
	text("T W O", 50, 300);
}
public void thirdA(){
	if (overThree == true){
		if(txtSzThree<50){
			txtSzThree += 5;
		}
	}else{
		if(txtSzThree>10){
			txtSzThree -= 5;
		}
	}
	textSize(txtSzThree);
	text("T H R E E", 50, 500);
}
public void fourthA(){
	if (overFour == true){
		if(txtSzFour<50){
			txtSzFour += 5;
		}
	}else{
		if(txtSzFour>10){
			txtSzFour -= 5;
		}
	}
	textSize(txtSzFour);
	text("F O U R", 50, 700);
}
public void hover(){
	if (mouseY >= 0 && mouseY <= 200){
		overOne = true;
		overTwo = false;
		overThree = false;
		overFour = false;
	}else if(mouseY >= 200 && mouseY <= 400){
		overOne = false;
		overTwo = true;
		overThree = false;
		overFour = false;
	}else if(mouseY >= 400 && mouseY <= 600){
		overOne = false;
		overTwo = false;
		overThree = true;
		overFour = false;
	}else if(mouseY >= 600 && mouseY <= 800){
		overOne = false;
		overTwo = false;
		overThree = false;
		overFour = true;
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
