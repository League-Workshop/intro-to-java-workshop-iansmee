PImage mustache;
PImage catface;
PImage hat;
void setup(){
  catface = loadImage("cat face.jpeg");
  size(800,600);
  catface.resize(width,height);
  mustache = loadImage("Moustache.png");
  mustache.resize(280,190);
  hat = loadImage("hat.png");
  hat.resize(400,400);
}
void draw(){
  background(catface);
  if(mousePressed){
  image(mustache,mouseX,mouseY);
  }
  if (mouseButton ==
  RIGHT) {
    image(hat,mouseX,mouseY);
  }
}
