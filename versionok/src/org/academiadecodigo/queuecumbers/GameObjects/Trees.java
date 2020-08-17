package org.academiadecodigo.queuecumbers.GameObjects;

import org.academiadecodigo.queuecumbers.Field.FieldPosition;
import org.academiadecodigo.queuecumbers.FieldPositionFactory;
import org.academiadecodigo.queuecumbers.Randomizer;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Trees extends NonHitableObjects {


    private FieldPosition fieldPosition;
    private String[] treesPNG = {"resources\\tree.png", "resources\\treee2.png", "resources\\treee3.png", "resources\\treee4.png", "resources\\treee5.png",
            "resources\\treee6.png"};
    private Picture tree;


    public Trees() {
        fieldPosition = FieldPositionFactory.createNewPosition(Randomizer.getRandom(535, 535));
        tree = new Picture(this.fieldPosition.getCol(), this.fieldPosition.getRow(), treesPNG[Randomizer.getRandom(treesPNG.length - 1)]);
        tree.draw();
    }

    public void moveLeft() {
        tree.translate(-1, 0);// movimento da direita para a esquerda
    }


    @Override
    public int getCol() {
        return fieldPosition.getCol();
    }

    @Override
    public int getRow() {
        return fieldPosition.getRow();
    }

    @Override
    public void moveLeft(int num) {
        int movement = -1;
        for (int i = 0; i < num; i++) {
                tree.translate(movement, 0);
        }

    }

}

