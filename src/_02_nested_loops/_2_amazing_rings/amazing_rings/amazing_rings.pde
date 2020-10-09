
void setup() {
  size(800,800);
  
}
int x = 200;
 int y = 400;
 int a= 600;
void draw() {
  background(200,200,200);
  for(int i=0; i<40;i++){
 noFill();
    ellipse(x,y,400-10*i,400-10*i);
      ellipse(a,y,400-10*i,400-10*i);
      x+=1;
      a-=1;
      delay(5);
      
  }
  
  }
  
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
