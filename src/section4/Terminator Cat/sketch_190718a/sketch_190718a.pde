PImage catPic;
int x=218;
int y=167;
int acceleration=5;


void setup() {
size(500,500);
catPic = loadImage ("kitten.jpeg");
catPic.resize(500,500);
background(catPic);
}
void draw() {
 fill(#056FFF);
  noStroke();
  ellipse(x, y, 15, 15);
ellipse(x+30,y,15,15);
if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}

}
 void keyPressed() {
                 x+=acceleration;
y+= acceleration;

 
 
 
 
 }
