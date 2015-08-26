//Helen Zhang, Block 1, OriginalDesign

boolean overOne, overTwo, overThree, overFour;
int txtSzOne = 10;
int txtSzTwo = 10;
int txtSzThree = 10;
int txtSzFour = 10;

void setup(){
  	size(400,800);
}
void draw(){
  	background(200, 213, 213);
  	sections();
}

void sections(){
	fill(70);
  	hover();
	firstA();
	secondA();
	thirdA();
	fourthA();
}

void firstA(){
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
void secondA(){
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
void thirdA(){
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
void fourthA(){
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
void hover(){
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