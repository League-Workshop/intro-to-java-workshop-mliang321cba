

void setup() {
  size(600,600);
}

void draw() {
  //color is greenish-yellow
  background(#AEFF24);
 
  if(mousePressed) {
    fill(#00D341);
    rect(300,300,100,100);
  }else{
    fill(#E35C57);
    ellipse(300,300,100,100);
  }
}
