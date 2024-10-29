public class B1_MoreLoop extends World {

    public void go() {
        plane.pausetime = 0;

        // edit for loop to make a row of squares at the top of the screen
        // with trail width five side length ten all toiuching

        // level two = make anothe row of squares right below first one using another for loop

        // change that squares are size twenty but still touching and filling whole screen but no more


    for(int y=0; y<800; y=y+1) { // y+=1 is the same as y=y+1, y++ is the same as y=y+1

        for (int x = 0; x < 1000; x = x+1) {
            plane.pausetime=0;
//            plane.setColor(y/4, x/6, 120);
//            plane.trailWidth = 1;
            plane.teleport(x, y); // starts at (0, 150)
            plane.setPixelColor(250-x,200, 50);
//            square(1);
            System.out.println("x: " + x);
        }
    }

        // plane.teleport(300, 300);
        // hexagon(123);
    }

    public void square(int distance) { // distance is the parameter
        for (int x = 0; x < 4; x = x + 1) {
            plane.isTrail = true;
            plane.move(distance);
            plane.turn(90);
            System.out.println("x: " + x);
        }
    }

//  //  public void hexagon() {
//        for (int y = 0; y < 6; y = y + 1) {
//            plane.isTrail = true;
//            plane.move(50);
//            plane.turn(60);
//            System.out.println("y:" + y);


        }





// homework: draw a shape with "n" number of sides where "n" is a perameter

//public void polygon(int n, int sideLength){

