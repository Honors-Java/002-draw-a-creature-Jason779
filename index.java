void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍
  

  background(10,230, 120);
 //Line on the ground
 //Biggest line
line(100,350,300,350);
//Second Big line
line(130,360,270,360);
//Third Big line
line(160,370,240,370);
//Fourth Big line
line(190,380,210,380);



  //Arm1
  fill(255,174,0);
ellipse(150,200,40,40);
ellipse(120,210,40,40);
ellipse(95,225,40,40);

  //Arm2
ellipse(250,200,40,40);
ellipse(280,212,40,40);
ellipse(300,227,40,40);


 
  


  //Leg with wheel for Leg
  //wheel
fill(0);
  ellipse(200,320,50,55);
  //rectangle
  fill(250,10,150);
  rect(200,260,15,125);


  //Body
  fill(255,0,0);
  ellipse(200,200,95,150);
  //Eyes
  fill(0,42,255)
  ellipse(180,172,15,25);
  ellipse(220,172,15,25);
  //Nose
  fill(255,255,0);
  triangle(200,180,190,200,210,200 );

 //Hat

  fill(200, 145, 34);
  rect(200,120, 100, 30);
  rect(200,90, 40,30);
//Added to the Hat
fill(255,255,0)
triangle(220,75,220,105,250,105);
triangle(180,104,180,75,150,105);


//My Extra Additional things I have to add.

//Quadrilateral
// Its a meteor!!!

fill(255,0,0);
quad(10,10,85, 139,111,41,52,2);



 
	

}