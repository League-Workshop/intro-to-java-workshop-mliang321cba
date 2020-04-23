 PImage catPic;
 int x = 436;
 int y = 135;
 int accel = 5;
  void setup(){
    size(600,600);
    catPic = loadImage("cat.jpg");
    catPic.resize(width, height);
    background(catPic);
  }
  void draw(){
    if(mousePressed){
    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
    fill(#FF605A);
    noStroke();
    ellipse(x, y, 50, 50);
    ellipse(x-75, y, 60, 50);
    if(x<0){
        background(catPic);
        x = 436;
        y = 135;
    }
  }
  void keyPressed() {
    x-=2*accel;
    y+=2*accel;
  }
