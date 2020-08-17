package org.academiadecodigo.queuecumbers.SimpleGfx;

import org.academiadecodigo.queuecumbers.Field.Field;
import org.academiadecodigo.queuecumbers.GameObjects.Player;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class FieldGfx {


    Field field = new Field();
    private Text score = new Text(200, 50, "Score: ");
    //Picture lowerGrass = new Picture(10, 678, "pictures\\lowergrass.png");
    //Picture middleGrass = new Picture(10, 650, "picture\\middlegrass.png");
    //Picture upperGrass = new Picture(10, 600, "picture\\uppergrass.png");

    public Color scoreColor = new Color(0, 100, 0);

    public void fieldGfx() {
        Picture background = new Picture(10, 10, "pictures\\floppycucumberbackgroundA.jpg");
        int backgroundHeight = background.getHeight();
        int backgroundWidth = background.getWidth();
        int fieldCol = field.getCOL();
        int fieldRow = field.getROW();
        score.grow(50, 50);
        int adjustX = fieldCol - backgroundWidth;
        int adjustY = fieldRow - backgroundHeight;

        background.grow(adjustX, adjustY);
        background.draw();
    }

    public void drawScore(Player player) {
        score.delete();
        score.setText("Score: " + player.getScore());
        score.setColor(scoreColor);
        score.grow(30,10);
        score.draw();
        }


    /*
    public static void reDrawScore(Player player) {
        Text score = new Text(10, 10, "Score: " + player.getScore());
        score.setColor(Color.BLACK);
        score.draw();
    }
*/

/*
        public void drawGrass () {
            lowerGrass.draw();
            //middleGrass.draw();
            //upperGrass.draw();
        }
*/
    }

