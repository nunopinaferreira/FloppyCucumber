package org.academiadecodigo.queuecumbers.GameObjects;

import org.academiadecodigo.queuecumbers.Field.FieldPosition;
import org.academiadecodigo.queuecumbers.others.FieldPositionFactory;
import org.academiadecodigo.queuecumbers.others.Randomizer;
import org.academiadecodigo.simplegraphics.pictures.Picture;

    public class Clouds extends NonHitableObjects {
        private FieldPosition fieldPosition;
        private String[] cloudsPNG = {"resources/cloud1.png", "resources/cloud1.png", "resources/cloud2.png", "resources/cloud3.png",
                "resources/cloud4.png", "resources/cloud5.png", "resources/cloud6.png", "resources/cloud7.png",
                "resources/cloud8.png", "resources/cloud9.png", "resources/cloud10.png", "resources/cloud11.png", "resources/cloud12.png"};
        private Picture cloud;


        public Clouds() {
            fieldPosition = FieldPositionFactory.createNewPosition(Randomizer.getRandom(10, 300));
            cloud = new Picture(this.fieldPosition.getCol(), this.fieldPosition.getRow(), cloudsPNG[Randomizer.getRandom(cloudsPNG.length - 1)]);
            cloud.draw();
        }


        public void moveLeft() {
            cloud.translate(-1, 0);
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
                cloud.translate(movement, 0);
        }
    }


}


