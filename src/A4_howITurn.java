public class A4_howITurn extends World {

    public void go() {

        plane.startingAngle(90);
        plane.teleport(100, 100);
        plane.isTrail = true;
        elmo();
        plane.teleport(800, 800);
        plane.turn(270);
        elmo();
    }


    public void elmo() {

        plane.trailWidth = 70;
        plane.setColor(246,21,21);
        plane.turn(90);
        plane.move(120);
        plane.turn(90);
        plane.move(120);
        plane.turn(90);
        plane.move(120);
        plane.turn(90);
        plane.move(120);
        plane.turn(90);
        plane.move(60);
        plane.turn(90);
        plane.move(60);
        plane.trailWidth = 10;
        plane.setColor(255, 255, 255);
        plane.turn(90);
        plane.move(10);
        plane.turn(90);
        plane.move(10);
        plane.turn(90);
        plane.move(10);
        plane.turn(90);
        plane.move(10);
        plane.turn(180);
        plane.setColor(0, 0, 0);
        plane.move(2);
        plane.isTrail=false;
        plane.turn(90);
        plane.move(70);
        plane.turn(180);
        plane.move(10);
        plane.isTrail=true;
        plane.setColor(255, 255, 255);
        plane.turn(90);
        plane.move(10);
        plane.turn(90);
        plane.move(10);
        plane.turn(90);
        plane.move(10);
        plane.turn(90);
        plane.move(10);
        plane.turn(180);
        plane.setColor(0, 0, 0);
        plane.move(2);
        plane.turn(270);
        plane.isTrail=false;
        plane.move(40);
        plane.isTrail=true;
        plane.move(30);
        plane.turn(270);
        plane.move(80);
        plane.turn(270);
        plane.move(30);
        plane.isTrail=false;
        plane.turn(270);
        plane.move(30);
        plane.isTrail=true;
        plane.trailWidth=20;
        plane.setColor(236,131,24);
        plane.move(10);
    }


}
