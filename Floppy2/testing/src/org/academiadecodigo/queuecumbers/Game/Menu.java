package org.academiadecodigo.queuecumbers.Game;


import org.academiadecodigo.simplegraphics.graphics.Color;

import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Menu {

    private Picture start;
    private Text play;


    public void mainMenu(){
        start = new Picture(10, 10, "pictures\\MainMenu.jpg");
        start.draw();
        play = new Text (500,270,"Play");
        play.setColor(Color.WHITE);
        play.grow(50,50);
        play.draw();
    }

    public static void menuGameOver(){
        Picture background = new Picture(10, 10, "pictures\\GameOver.jpg");
        background.draw();
    }

    public void hideWelcome(){
        start.delete();
        play.delete();
    }
}