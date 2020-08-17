package org.academiadecodigo.queuecumbers.Game;


import org.academiadecodigo.queuecumbers.GameObjects.*;
import org.academiadecodigo.queuecumbers.Randomizer;
import org.academiadecodigo.queuecumbers.SimpleGfx.FieldGfx;


public class GameTest {
/*
    public void moveAllObjects() {
        for (int i = 0; i < gameObjects.length; i++) {
            gameObjects[i].moveLeft();

        }
    }
*/

    Enemies[] enemies = new Enemies[10];
    Collectibles[] collectibles = new Collectibles[10];
    Clouds[] clouds = new Clouds[10];
    Trees[] trees = new Trees[10];

    //GameObjects[] gameObjects = new GameObjects[30];
    public void createEnemies() {
        for (int i = 0; i < enemies.length; i++) {
                enemies[i] = new Enemies();
        }
    }

    public void createCollectibles() {
        for (int i = 0; i < collectibles.length; i++) {
            collectibles[i] = new Collectibles();
        }
    }

    public void createClouds() {
        for (int i = 0; i < clouds.length; i++) {
            clouds[i] = new Clouds();
        }
    }

    public void createTrees() {
        for (int i = 0; i < trees.length; i++) {
            trees[i] = new Trees();
        }
    }




    public static void main(String[] args) throws InterruptedException {
       /* FieldGfx background = new FieldGfx();
        background.fieldGfx();

        // initialize game
        GameTest newGame = new GameTest();

        // initialize player
        Player newPlayer = new Player(250, 300);

        // initialize objects
        newGame.createEnemies();
        newGame.createClouds();
        newGame.createCollectibles();
        newGame.createTrees();


        int timer = 0;


*/

        GameTest2Edu newGame = new GameTest2Edu(20);

        newGame.init();
/*
        while (true) {
            Thread.sleep(40);





            if (timer % 10 == 0) {
                newGame.enemies[1].moveLeft();
                newGame.enemies[0].moveLeft();
                newGame.enemies[2].moveLeft();
                newGame.enemies[3].moveLeft();
                newGame.enemies[4].moveLeft();
                newGame.clouds[0].moveLeft();

            }
            newGame.clouds[4].moveLeft();
            newGame.collectibles[2].moveLeft();
            newGame.collectibles[5].moveLeft();
            newGame.collectibles[8].moveLeft();
            newGame.collectibles[6].moveLeft();


            background.drawGrass();


            timer++;


        }
*/
     /*
            //cucumber attributes
            int cucumberActualX1 = 100; // posição do Player para o teste
            int cucumberActualY1 = 200; // posição do Player para o teste
            int cucumberActualX2 = cucumberActualX1 + 25; //limite à direita
            int cucumberActualY2 = cucumberActualY1 + 45; //limite inferior
            boolean isCollided = false;
            //hitable attributes
            int hitableActualX1 = 125; // coordenada X do hitbox superior esquerdo dos objectos hitable
            int hitableActualY1 = 166; // coordenada Y do hitbox superior esquerdo dos objectos hitable
            int hitableHeight = 50; // valor da altura do objecto hitable
            int hitableActualY2 = hitableActualY1 + hitableHeight;

        }
*/


        }
    }

