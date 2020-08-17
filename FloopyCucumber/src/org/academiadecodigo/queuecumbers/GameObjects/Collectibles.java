package org.academiadecodigo.queuecumbers.GameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Collectibles extends HitableObjects {

    private Picture collectible;
    private boolean isCrashed = false;

    public void setCrashed(boolean crashed) {
        this.isCrashed = crashed;
    }

    public boolean getCrashed() {
        return isCrashed;
    }

    public Collectibles() {
        this.setHeight(50);
        collectible = new Picture(super.getPosition().getCol(), super.getPosition().getRow(), "resources/gift2.png");
        collectible.draw();
    }

    public void moveLeft(int num) {
        for (int i = 0; i < num; i++) {
            int movement = -1;
            collectible.translate(movement, 0);
            //track current position
            int initialPosition1 = getFieldPosition().getCol();
            int finalPosition1 = initialPosition1 + movement;
            setFieldPosition(finalPosition1, getFieldPosition().getRow());
        }
    }

    public void hide() {
        collectible.delete();
    }
}