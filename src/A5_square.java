public class A5_square extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 2;
        plane.setColor(253, 191, 255);
        plane.startingAngle(90);
        square(21); //one of the two things, "calling" the square method
// two things going on to make square happen:
        plane.teleport(200, 200);
        square(200);
    }


    public void square(int length) { // second of the two things, define the square method
        // "public void" is how you say "new method"
        // length is a perameter, which is a type of variable
        // a loop allows you to do the same or similar thing many times
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(length);
        plane.turn(90);
        plane.move(length);
        plane.turn(90);
        plane.move(length);
        plane.turn(90);
        plane.move(length);
        plane.turn(90);
    }

}


