


package org.academiadecodigo.queuecumbers.GameObjects;

import org.academiadecodigo.queuecumbers.Field.FieldPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Enemies extends HitableObjects {
    private Picture bomb;

    public Enemies() {   // Sempre quis escrever isto em código e nem sabia.
        this.setHeight(50);
        this.bomb = new Picture(super.getPosition().getCol(), super.getPosition().getRow(), "pictures\\bomba2.png");
        bomb.draw();


    }


    @Override
    public void moveLeft(int num) {

                for(int i = 0; i < num; i++ ) {
                    int movement = -1;
                    bomb.translate(movement, 0);
                    //track current position
                    int initialPosition1 = getFieldPosition().getCol();
                    int finalPosition1 = initialPosition1 + movement;
                    setFieldPosition(finalPosition1,getFieldPosition().getRow());

                }
    }

    public void hide() {
        bomb.delete();
    }

}