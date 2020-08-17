package org.academiadecodigo.queuecumbers.Game;
import org.academiadecodigo.queuecumbers.others.CollisionDetector;
import org.academiadecodigo.queuecumbers.GameObjects.*;
import org.academiadecodigo.queuecumbers.SimpleGfx.FieldGfx;

public class Game {

    private int gameTimer = 0;
    private Enemies[] enemyWave1;
    private Enemies[] enemyWave2;
    private Collectibles[] collectiblesWave1;
    private Collectibles[] collectiblesWave2;
    private Clouds[] cloudsWave1;
    private Trees[] treesWave1;
    private int creationCounter;
    private int spawnCounter;
    private int cloudAndTreeCounter1;
    private int cloudAndTreeCounter2;
    private Menu menu;





    public Game(int numElements) {
        enemyWave1 = new Enemies[numElements];
        enemyWave2 = new Enemies[numElements];
        collectiblesWave1 = new Collectibles[numElements];
        collectiblesWave2 = new Collectibles[numElements];
        cloudsWave1 = new Clouds[numElements];
        treesWave1 = new Trees[numElements];
        creationCounter = 0;
        spawnCounter = 0;
        cloudAndTreeCounter1 = 0;
        menu = new Menu();

    }

    public void init() throws InterruptedException {
        FieldGfx background = new FieldGfx();
        background.fieldGfx();
        CollisionDetector collisionDetector = new CollisionDetector();
        Player newPlayer = new Player(400, 300);
        menu.mainMenu();
        //newPlayer.keyboard();
        Thread.sleep(3000);
        menu.hideWelcome();
        background.drawScore(newPlayer);

        //coverLeft();
        background.coverRight();



        while (!FloppyCucumber.isGameOver()) {
            Thread.sleep(10);
            gameTimer++;
            newPlayer.gravity();
            //******************* CRIAÇÃO DE BOMBAS && COLLECTIBLES ****************
            if (spawnCounter == enemyWave2.length && creationCounter == enemyWave1.length) { // Terceiro
                creationCounter = 0;
                //System.out.println("wave1 has been refreshed!");
            }
            if (creationCounter == (enemyWave1.length -1) && spawnCounter == enemyWave2.length) { // Quarto
                spawnCounter = 0;
                //System.out.println("wave2 has been refreshed!");
            }
            if (gameTimer % 100 == 0 && creationCounter >= enemyWave1.length) { // Segundo
                enemyWave2[spawnCounter] = new Enemies();
                collectiblesWave2[spawnCounter] = new Collectibles();
                spawnCounter++;
                //System.out.println("a new wave2 object has been created!");
            }
            if (gameTimer % 100 == 0 && creationCounter < enemyWave1.length) { // Primeiro
                enemyWave1[creationCounter] = new Enemies();
                collectiblesWave1[creationCounter] = new Collectibles();
                creationCounter++;
                //System.out.println("a new wave1 object has been created!");
            }

            // ESTES 2 MÉTODOS ABAIXO ESTÃO A FODER TUDO.
            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!


            for (int i = 0; i < creationCounter; i++) { // isto está constantemente a correr...
                enemyWave1[i].moveLeft(3);
                collectiblesWave1[i].moveLeft(2);
                collisionDetector.checkCollision(newPlayer, enemyWave1[i]);
                collisionDetector.checkCollision(newPlayer, collectiblesWave1[i], background);
            }

            try { // aqui temos NullPointer até à 2a Onda começar! Daí ser necessária uma excepção.
                for (int i = 0; i < spawnCounter; i++) {
                    enemyWave2[i].moveLeft(3);
                    collectiblesWave2[i].moveLeft(2);
                    collisionDetector.checkCollision(newPlayer, enemyWave2[i]);
                    collisionDetector.checkCollision(newPlayer, collectiblesWave2[i], background);

                }

            } catch (Exception nullPointer) {} // diferente do original
            //******************* CRIAÇÃO DE BOMBAS && COLLECTIBLES ****************
            if (gameTimer%11500 == 0){
                cloudAndTreeCounter1 = 0;
                cloudAndTreeCounter2 = 0;
                //System.out.println("Clouds & Trees refreshed.");
            }
            if (gameTimer % 400 == 0 && cloudAndTreeCounter1 < cloudsWave1.length) {
                cloudsWave1[cloudAndTreeCounter1] = new Clouds();
                //System.out.println("a new Clouds object has been created!");
                cloudAndTreeCounter1++;
            }
            if (gameTimer % 500 == 0 && cloudAndTreeCounter2 < treesWave1.length) {
                treesWave1[cloudAndTreeCounter2] = new Trees();
                //System.out.println("a new Trees object has been created!");
                cloudAndTreeCounter2++;
            }
                /*if (gameTimer % 200 == 0 && cloudAndTreeCounter1 < cloudsWave1.length) {
                    int rand = Randomizer.getRandom(0,1);
                    switch (rand){
                        case (0): cloudsWave1[cloudAndTreeCounter1] = new Clouds();
                            System.out.println("a new Clouds object has been created!");
                            break;
                        case (1): treesWave1[cloudAndTreeCounter1] = new Trees();
                            System.out.println("a new Trees object has been created!");
                            break;
                    }
                    cloudAndTreeCounter1++;
                }*/


            try {
                for (int i = 0; i < cloudAndTreeCounter1; i++){
                    treesWave1[i].moveLeft();
                }
            } catch (Exception nullPointer) {

            }
            try {
                for (int i = 0; i < cloudAndTreeCounter1; i++){
                    cloudsWave1[i].moveLeft();
                }
            } catch (Exception nullPointer) {

            }
        }
    }
}

