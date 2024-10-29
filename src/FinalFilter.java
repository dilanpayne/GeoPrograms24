public class FinalFilter extends World { // Defining the FinalFilter Class
    public int red; // Declaring the "red" variable - the amount of red in one pixel of the image
    public int blue; // Declaring the "blue" variable - the amount of blue in one pixel of the image
    public int green; // Declaring the "green" variable - the amount of green in one pixel of the image

    public void go() { // Method that executes all the visual elements shown on the image window
        plane.teleport(0, 0); // Method that moves the plane to the bottom left of the screen
        plane.loadBackGround("LilMiss.jpg"); // Method that loads the "LilMiss.jpg" image
        plane.showBackGround(); // Method that allows the image to appear on the screen

        // See underneath for method comments
        OneOneBow();
        TwoOneHat();
        ThreeOneOmbre();
        FourOneOmbreBody();
        plane.teleport(758, 90);
        FiveOneCheek();
        plane.teleport(803, 89);
        FiveOneCheek();
        plane.teleport(0, 0);
        SixOneBW();
        plane.teleport(0, 206);
        plane.turn(90); // Method that turns plane 90 degrees
        Line();
        OneTwoSkin();
        TwoTwoShoe();
        ThreeTwoFilter();
        FourTwoBow();
        FiveTwoAntler();

    }


    public void OneOneBow() { // Sets up method "OneOneBow"
        for (int y = 6; y < 180; y = y + 1) { // For loop that expresses that action should take place if y variable fits within the constraints (location on the screen)
            for (int x = 36; x < 181; x = x + 1) { // For loop that expresses that action should take place if x variable fits within the constraints (location on the screen)
                plane.teleport(x, y); // Method that moves plane to first x and y location

                red = plane.howMuchRed(); // Determines that variable red is equivalent to how red is in the pixel
                green = plane.howMuchGreen(); // Determines that variable green is equivalent to how green is in the pixel
                blue = plane.howMuchBlue(); // Determines that variable blue is equivalent to how blue is in the pixel

                if (red < 175 && red > 125 && green < 220 && green > 170 && blue < 55 && blue > 15) { // If statements that explain to do the action below if the colors fit within a certain range
                    plane.setPixelColor(255, 203, 15); // Method that changes the color of the first character's bow to be orange

                }
            }
        }
    }

    public void TwoOneHat() { // Sets up method "TwoOneHat," that changes second character's hat to be orange
        for (int y = 6; y < 190; y = y + 1) {
            for (int x = 190; x < 340; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red < 120 && red > 90 && green < 65 && green > 35 && blue < 160 && blue > 130) {
                    plane.setPixelColor(255, 166, 0);
                }
            }
        }
    }

    public void ThreeOneOmbre() { // Sets up method "ThreeOneOmbre" that changes the third character's hair to have color changing streaks
        for (int y = 10; y < 190; y = y + 1) {
            for (int x = 330; x < 550; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red < 350 && red > 150 && green < 330 && green > 130 && blue < 165 && blue > 0) {
                    plane.setPixelColor(550 - x, y, 190 - y); // Rather than remaining one color, the changing location of the pixels (x and y) define the colors in the hair. 550 and 190, the maximum x and y value, are included to ensure that the color does not go outside of the range
                }
            }
        }
    }

    public void FourOneOmbreBody() { // Sets up method "FourOneOmbre" that changes the fourth character's body to change in color
        for (int y = 10; y < 190; y = y + 1) {
            for (int x = 515; x < 690; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red < 170 && red > 120 && green < 130 && green > 90 && blue < 195 && blue > 150) {
                    plane.setPixelColor(690 - (x - 50), 90, 200);


                }
            }
        }
    }

    public void FiveOneCheek() { // Sets up method "FiveOneCheek" that draws two small squares to act as the fifth character's cheeks
        for (int y = 0; y < 4; y = y + 1) { // For loop that expresses that action should take place if y variable fits within the constraints (sides of a square)
            plane.isTrail = true; // Variable that causes the plane to leave a trail behind it as it moves
            plane.pausetime = 0; // Variable that defines how fast the plane moves
            plane.trailWidth = 4; // Variable that defines how wide the trail of the plane is
            plane.setColor(253, 253, 5); // Method that changes the color of the trail
            plane.move(2); // Method that causes the plane to move
            plane.turn(90); // Method that causes the plane to turn

        }
    }

    public void SixOneBW() { // Sets up method "SixOneBW" that filters the sixth character to be black and white
        for (int y = 10; y < 190; y = y + 1) {
            for (int x = 862; x < 995; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                plane.setPixelColor(green, green, green); // Method that assigns all the colors to one, changing value, meaning that while the character's colors will change, red, green, and blue are always the same at any given moment. The image is therefore black and white.
            }
        }
    }

    public void Line() { // Sets up method "Line" that draws a dotted line between the two rows of characters
        for (int x = 0; x < 50; x = x + 1) { // For loop that expresses that action should take place if x variable fits within the constraints (location on the screen on the x axis)
            plane.isTrail = true;
            plane.trailWidth = 4;
            plane.setColor(253, 253, 5);
            plane.move(10);
            plane.isTrail = false; // Method that causes plane to stop leaving a trail, creating the dotted line
            plane.move(10);
        }
    }

    public void OneTwoSkin() { // Sets up method "OneTwoSkin" that changes the color of the skin of the seventh character to be color changing
        for (int y = 230; y < 410; y = y + 1) {
            for (int x = 40; x < 260; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red < 270 && red > 220 && green < 240 && green > 205 && blue < 250 && blue > 210) {
                    plane.setPixelColor(280 - x, 189, green);
                }
            }
        }
    }

    public void TwoTwoShoe() { // Sets up method "TwoTwoShoe" that changes the color of the eighth character's shoes to be red
        for (int y = 210; y < 400; y = y + 1) {
            for (int x = 240; x < 460; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red < 190 && red > 100 && green < 260 && green > 175 && blue < 260 && blue > 180) {
                    plane.setPixelColor(255, 31, 83);
                }
            }
        }
    }

    public void ThreeTwoFilter() { // Sets up method "ThreeTwoFilter" that changes the ninth character to be green and purple
        for (int y = 210; y < 400; y = y + 1) {
            for (int x = 430; x < 650; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                plane.setPixelColor(green, red, green); // Method that assigns the amount of red in the original image to green and the amount of green in the original image to blue and red
            }
        }
    }

    public void FourTwoBow() { // Sets up method "FourTwoBows" that changes the two bows in the tenth character's hair to be pink
        for (int y = 210; y < 405; y = y + 1) {
            for (int x = 640; x < 860; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red < 265 && red > 190 && green < 50 && green > 0 && blue < 85 && blue > 20) {
                    plane.setPixelColor(219, 94, 196);

                }
            }
        }
    }

    public void FiveTwoAntler() { // Sets up method "FiveTwoAntler" that draws two antlers on the final character's head
        plane.teleport(894, 271);
        plane.isTrail = true;
        plane.setColor(74, 142, 203);
        plane.turn(90);
        plane.move(40);
        plane.teleport(940, 271);
        plane.move(40);
        plane.teleport(1000, 430);
    }
}
