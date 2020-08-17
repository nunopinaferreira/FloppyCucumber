package org.academiadecodigo.queuecumbers.SimpleGfx;


import org.academiadecodigo.queuecumbers.Field.Field;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class FieldGfx {


    Field field = new Field();

    Picture lowerGrass = new Picture(10,678, "pictures\\lowergrass.png");
    //Picture middleGrass = new Picture(10, 650, "picture\\middlegrass.png");
    //Picture upperGrass = new Picture(10, 600, "picture\\uppergrass.png");


    public void fieldGfx() {
        Picture background = new Picture(10,10, "pictures\\floppycucumberbackgroundA.jpg");
        int backgroundHeight = background.getHeight();
        int backgroundWidth = background.getWidth();
        int fieldCol = field.getCOL();
        int fieldRow = field.getROW();

        int adjustX = fieldCol - backgroundWidth;
        int adjustY = fieldRow - backgroundHeight;

        background.grow(adjustX, adjustY);
        background.draw();



    }


    public void drawGrass () {
        lowerGrass.draw();
        //middleGrass.draw();
        //upperGrass.draw();
    }

}
