package org.academiadecodigo.queuecumbers.GameObjects;

import org.academiadecodigo.queuecumbers.Field.FieldPosition;
import org.academiadecodigo.queuecumbers.FieldPositionFactory;
import org.academiadecodigo.queuecumbers.Randomizer;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Trees extends NonHitableObjects {


    private FieldPosition fieldPosition;


    private String[] treesPNG = {"pictures\\tree.png", "pictures\\treee2.png", "pictures\\treee3.png", "pictures\\treee4.png", "pictures\\treee5.png",
            "pictures\\treee6.png"};
    private Picture tree;


    public Trees() {
        fieldPosition = FieldPositionFactory.createNewPosition(Randomizer.getRandom(535, 535));
        tree = new Picture(fieldPosition.getCol(), fieldPosition.getRow(), treesPNG[Randomizer.getRandom(treesPNG.length - 1)]);
        tree.draw();
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
        switch (num) {
            case 2:
                tree.translate(-1, 0);
                tree.translate(-1, 0);
            case 3:
                tree.translate(-1, 0);
                tree.translate(-1, 0);
                tree.translate(-1, 0);
            case 4:
                tree.translate(-1, 0);
                tree.translate(-1, 0);
                tree.translate(-1, 0);
                tree.translate(-1, 0);
        }




    }

}
    /*
    @Override
    public void moveLeft(int num) {
        for (int i = 0; i == num; i++) {
            tree.translate(-1, 0);
        }
    }
     */


