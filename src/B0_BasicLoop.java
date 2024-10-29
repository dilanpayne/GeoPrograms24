public class B0_BasicLoop extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 5000;
        plane.teleport(0, 0);
        plane.pausetime = 0;
        plane.setColor(21, 19, 71);
        plane.move(500);
        plane.turn(180);
        plane.move(500);
        plane.setColor(247, 255, 135);
        plane.trailWidth = 3;

        for (int x = 0; x < 70; x=x+1) {
            star(x*50, x*30);
        }

    }


    public void star(int positionx, int positiony) {
        plane.isTrail = true;
        plane.teleport(positionx, positiony);
        plane.trailWidth = 2;
        plane.pausetime = 5;
        plane.startingAngle(0);

        for (int x = 0; x < 5; x = x + 1) {
            System.out.println("line #" + x);
            plane.move(25);
            plane.turn(144);

        }
    }
     //   for(int x=0;x<9;x=x+1) { // define a variable, condition, and incremement;
            // the condition says "keep looping as long as this condition is true"
            // 1. check condition
            // 2. if condition is true, do the stuff
            // 3. if condition is false,skip to the end of the loop
        //    System.out.println("x #"+ x);
       //     plane.square(100);
      //  System.out.println("end of loop");
        //    for (int x=0; x<140; x=x+1){
        //      System.out.println("circle #" + x);
        //        plane.circle(3);
        //        plane.turn(3);
        //        flower();
        }
        //    public void flower() {
        //    for (int x=0; x<140; x=x+1){
         //       System.out.println("circle #" + x);
        //        plane.turn(3);
       // }


