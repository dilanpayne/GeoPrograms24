public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    // goal make filter go over whole image and
    // decrease the green by 1/3

    public void go() {
        plane.loadBackGround("CharlieBrown.png");
        plane.showBackGround();

        CharlieShirt();

        SnoopyNose();


        for (int y = 390; y < 430; y = y + 1) {
            for (int x = 720; x < 790; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red < 15 && blue < 15 && green < 15) {
                    plane.setPixelColor(99, 242, 216);
                }
            }
        }

    }

    public void CharlieShirt() {
        for (int y = 350; y < 600; y = y + 1) {
            for (int x = 650; x < 900; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red < 260 && red > 230 && green > 180 && green < 220 && blue < 90) {
                    plane.setPixelColor(255, 117, 209);

                }
            }
        }

    }

    public void SnoopyNose() {
        for (int y = 45; y < 630; y = y + 1) {
            for (int x = 0; x < 590; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red > 150 && green < 90 && blue < 70) {
                    plane.setPixelColor(red / 2, green, blue);


                }
            }
        }

    }
}

