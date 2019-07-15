PImage mustache; PImage monka;
void setup(){ monka = loadImage ( "monka s.jpg");
  size (800,800);
  monka.resize(width,height);
mustache=loadImage("monkamustache.png");
}
void draw(){
  background(monka);
}
