public class A1_HowToMove extends World {

// public class, for us, means new program, and functions the same as a file
// the "world" allows us to access things like the plane
// the bracket or parenthase always has a matching, closed bracket or parenthase

    public void go() { // this is a method - method: a recipe/set of steps, go is the name of the method
        // methods use parenthases
// two slashes like this "//" let you make a comment
// this is one unit of code, beginning with the opening bracket after go()
        System.out.println("This message will be printed to the window below.");
        // window below is called a "das window"
        // green means it is not technically code
        //varables usually have equal sings
        plane.pausetime = 1; // variable (integer/int variable)
        plane.startingAngle(40); //makes plane move at an angle of 40 degrees
        plane.isTrail = true;
        plane.move(200); //plane moves farther
        plane.isTrail = false; // variable (boolean variable)
        plane.move(40); // method
        plane.isTrail = true;
        plane.move(20); //changed the distance the plane moved

    }

} // end of class

// don't write code down here