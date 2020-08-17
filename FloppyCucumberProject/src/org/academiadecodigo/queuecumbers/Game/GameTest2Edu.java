package org.academiadecodigo.queuecumbers.Game;

import org.academiadecodigo.queuecumbers.GameObjects.*;
import org.academiadecodigo.queuecumbers.SimpleGfx.FieldGfx;

public class GameTest2Edu {


        private int gameTimer = 0;
        private Enemies[] enemyWave1;
        private Enemies[] enemyWave2;
        private Collectibles[] collectiblesWave1;
        private int creationCounter;
        private int spawnCounter;

        /*
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
        */

        public GameTest2Edu(int nrOfEnemies) {
            enemyWave1 = new Enemies[nrOfEnemies];
            enemyWave2 = new Enemies[nrOfEnemies];
            collectiblesWave1 = new Collectibles[nrOfEnemies];



            creationCounter = 0;
            spawnCounter = 0;
        }


        public void init() throws InterruptedException {
            FieldGfx background = new FieldGfx();
            background.fieldGfx();

            Player newPlayer = new Player(200, 300);


            while (true) {
                Thread.sleep(50);
                gameTimer++;
                newPlayer.gravity();
                if (spawnCounter == enemyWave2.length && creationCounter == enemyWave1.length) { // Terceiro
                    creationCounter = 0;
                    System.out.println("wave1 has been refreshed!");
                }
                if (creationCounter == (enemyWave1.length -1) && spawnCounter == enemyWave2.length) { // Quarto
                    spawnCounter = 0;
                    System.out.println("wave2 has been refreshed!");
                }
                if (gameTimer % 100 == 0 && creationCounter >= enemyWave1.length) { // Segundo
                    enemyWave2[spawnCounter] = new Enemies();
                    spawnCounter++;
                    System.out.println("a new wave2 object has been created!");
                }
                if (gameTimer % 100 == 0 && creationCounter < enemyWave1.length) { // Primeiro
                    enemyWave1[creationCounter] = new Enemies();
                    collectiblesWave1[creationCounter] = new Collectibles();
                    creationCounter++;
                    System.out.println("a new wave1 object has been created!");
                }
                for (int i = 0; i < creationCounter; i++) { // isto está constantemente a correr...
                    enemyWave1[i].moveLeft(4);
                    collectiblesWave1[i].moveLeft(2);
                }
                try { // aqui temos NullPointer até à 2a Onda começar! Daí ser necessária uma excepção.
                    for (int i = 0; i < spawnCounter; i++) {
                        enemyWave2[i].moveLeft(10);
                    }
                } catch (Exception nullPointer) {continue;}
            }
        }
    }


