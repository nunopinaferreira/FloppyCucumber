package org.academiadecodigo.queuecumbers.Game;

public class FloppyCucumber {


    static boolean gameOver = false;

    public static void setGameOver(boolean isCrashed) {
        gameOver = isCrashed;
    }

    public static boolean isGameOver() {
        return gameOver;
    }

    public static void main(String[] args) throws InterruptedException {



            Game newGame = new Game(20);

            newGame.init();

            Menu.menuGameOver();




        }
    }

