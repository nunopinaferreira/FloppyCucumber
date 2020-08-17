package org.academiadecodigo.queuecumbers;

import org.academiadecodigo.queuecumbers.Field.Field;
import org.academiadecodigo.queuecumbers.Game.FloppyCucumber;
import org.academiadecodigo.queuecumbers.GameObjects.Collectibles;
import org.academiadecodigo.queuecumbers.GameObjects.Enemies;
import org.academiadecodigo.queuecumbers.GameObjects.Player;
import org.academiadecodigo.queuecumbers.SimpleGfx.FieldGfx;

public class CollisionDetector {


    public void checkCollision(Player player, Enemies enemy) throws InterruptedException {


        //Condition that verifies collision with player
        boolean isCrashed = false;
        int playerActualX1 = player.getFieldPosition().getCol();
        int playerActualY1 = player.getFieldPosition().getRow();
        int playerActualX2 = playerActualX1 + player.getCucumber().getWidth();
        int playerActualY2 = playerActualY1 + player.getCucumber().getHeight();
        int bombActualX1 = enemy.getFieldPosition().getCol();
        int bombActualY1 = enemy.getFieldPosition().getRow();
        int bombHeight = enemy.getHeight();
        int bombActualX2 = bombActualX1 + enemy.getWidth();
        int bombActualY2 = bombActualY1 + bombHeight;

        if (playerActualX2 >= bombActualX1 && playerActualX1 <= bombActualX2 && playerActualY1 <= bombActualY2 && playerActualY2 >= bombActualY1) {
            isCrashed = true; // isCrashed

            //System.out.println(isCrashed);
            enemy.hide();
            player.explosion();
            Thread.sleep(1700);
            FloppyCucumber.setGameOver(isCrashed);
        }

        if (playerActualY2 > Field.HEIGHT) { // se o canto superior do player for <= que a linha 0
            isCrashed = true;
            //System.out.println(isCrashed);
            player.explosion();
            Thread.sleep(1700);
            FloppyCucumber.setGameOver(isCrashed);
        }
    }

    public void checkCollision(Player player, Collectibles collectible, FieldGfx fieldGfx) {
        //Condition that verifies collision with player
        boolean isCrashed = false;
        int playerActualX1 = player.getFieldPosition().getCol();
        int playerActualY1 = player.getFieldPosition().getRow();
        int playerActualX2 = playerActualX1 + player.getCucumber().getWidth();
        int playerActualY2 = playerActualY1 + player.getCucumber().getHeight();
        int collectibleActualX1 = collectible.getFieldPosition().getCol();
        int collectibleActualY1 = collectible.getFieldPosition().getRow();
        int collectibleHeight = collectible.getHeight();
        int collectibleActualX2 = collectibleActualX1 + collectible.getWidth();
        int collectibleActualY2 = collectibleActualY1 + collectibleHeight;

        //fieldGfx.drawGrass();
        //fieldGfx.coverLeft();
        //fieldGfx.coverRight();


        if (playerActualX2 >= collectibleActualX1 && playerActualX1 <= collectibleActualX2 && playerActualY1 <= collectibleActualY2 && playerActualY2 >= collectibleActualY1) {
            isCrashed = true;
            if (!collectible.getCrashed()) {
                player.setScore(1);
                fieldGfx.drawScore(player);
            }
            collectible.setCrashed(true);
            collectible.hide();


            //System.out.println("collectibes" + isCrashed);
        }
    }



}


