PImage mustache;
PImage face;
void setup() {
  face = loadImage("face.jpg");
  size(800,600);
  face.resize(width, height);
  mustache = loadImage ("mustache.png");
  mustache.resize(215, 75);

}

void draw() {
  background(face);
  if(mousePressed){
    image(mustache, mouseX, mouseY);
  }

}
