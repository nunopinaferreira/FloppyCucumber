package org.academiadecodigo.queuecumbers.GameObjects;

import org.academiadecodigo.queuecumbers.Field.FieldPosition;
import org.academiadecodigo.queuecumbers.FieldPositionFactory;
import org.academiadecodigo.queuecumbers.FieldPositionInterface;
import org.academiadecodigo.queuecumbers.Randomizer;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class NonHitableObjects extends GameObjects implements FieldPositionInterface {





    @Override
    public void moveLeft() { }

    @Override
    public void moveLeft(int num) { }


    @Override
    public int getCol() {
        return 0;
    }

    @Override
    public int getRow() {
        return 0;
    }



}
