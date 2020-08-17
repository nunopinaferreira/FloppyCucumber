package org.academiadecodigo.queuecumbers.Game;


import org.academiadecodigo.queuecumbers.Field.Field;
import org.academiadecodigo.simplegraphics.graphics.Color;

import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.net.URL;


public class Menu {

    private Picture start;
    private Text play;


    public void mainMenu(){
        start = new Picture(20, 10, ("resources/MainMenu.jpg"));

        int startHeight = start.getHeight();
        int startWidth = start.getWidth();
        int fieldCol = Field.WIDTH;
        int fieldRow = Field.HEIGHT;
        int adjustX = fieldCol - startWidth;
        int adjustY = fieldRow - startHeight;
        start.grow(adjustX, adjustY);



        start.draw();
        play = new Text (500,270,"Play");
        play.setColor(Color.WHITE);
        play.grow(50,50);
        play.draw();
    }

    public static void menuGameOver(){
        Picture menuGameOver = new Picture(20, 10, "resources/GameOver.jpg");
        int menuGameOverHeight = menuGameOver.getHeight();
        int menuGameOverWidth = menuGameOver.getWidth();
        int fieldCol = Field.WIDTH;
        int fieldRow = Field.HEIGHT;
        int adjustX = fieldCol - menuGameOverWidth;
        int adjustY = fieldRow - menuGameOverHeight;
        menuGameOver.grow(adjustX, adjustY);
        menuGameOver.draw();
    }

    public void hideWelcome(){
        start.delete();
        play.delete();
    }
}