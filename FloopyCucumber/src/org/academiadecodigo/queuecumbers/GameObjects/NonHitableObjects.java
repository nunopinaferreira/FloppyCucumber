package org.academiadecodigo.queuecumbers.GameObjects;


import org.academiadecodigo.queuecumbers.others.FieldPositionInterface;



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
