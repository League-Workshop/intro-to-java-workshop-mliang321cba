int rocketX = 400;
int rocketY = 600;

void setup() {
  background(0, 0, 40);
  size(800, 800);
}

void draw() {
  background(0, 0, 0);
  fill(255, 255, 255);
  // 1. ▼ Write code BELOW this line to make stars ▼ 
  //    Example:
  //     circle(50, 50, 50);
circle(50, 50, 50);
circle(200, 160, 50);
circle(500, 300, 50);
  circle(400, 200, 50);
circle(600, 285, 50);
circle(150, 600, 50);
circle(700, 400, 50);
circle(750, 50, 50);
circle(648, 75, 50);
circle(100, 250, 50);
 
  fill(random(255), 0, 0);
  circle(rocketX, rocketY + 130, 90);
  fill(248, 128, 0);
  circle(rocketX, rocketY + 115, 70);
  fill(255, 153, 0);
  circle(rocketX, rocketY + 95, 35);
  fill(100, 100, 100);
  triangle(rocketX, rocketY + 10, rocketX + 50, rocketY + 100, rocketX - 50, rocketY + 100);
  // 2. ▼ Write code BELOW this line to make the rocket blast off ▼ 
  rocketY=rocketY-1;
  
    
 


  

}
