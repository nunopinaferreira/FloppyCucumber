package org.academiadecodigo.queuecumbers.GameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Collectibles extends HitableObjects {

    private Picture collectible;

    public Collectibles() {
        this.setHeight(50);
        collectible = new Picture(super.getPosition().getCol(), super.getPosition().getRow(), "pictures\\gift2.png");
        collectible.draw();
    }


    public void moveLeft() {
        collectible.translate(-1, 0);// movimento da direita para a esquerda
    }

    public void moveLeft(int num) {
            int movement = -1;
            for (int i = 0; i < num; i++) {
                collectible.translate(movement, 0);


            }
        }

    }
