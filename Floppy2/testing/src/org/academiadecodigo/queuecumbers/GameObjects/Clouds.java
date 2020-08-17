package org.academiadecodigo.queuecumbers.GameObjects;

import org.academiadecodigo.queuecumbers.Field.FieldPosition;
import org.academiadecodigo.queuecumbers.FieldPositionFactory;
import org.academiadecodigo.queuecumbers.Randomizer;
import org.academiadecodigo.simplegraphics.pictures.Picture;
    public class Clouds extends NonHitableObjects {
        private FieldPosition fieldPosition;
        private String[] cloudsPNG = {"pictures\\cloud1.png", "pictures\\cloud1.png", "pictures\\cloud2.png", "pictures\\cloud3.png",
                "pictures\\cloud4.png", "pictures\\cloud5.png", "pictures\\cloud6.png", "pictures\\cloud7.png",
                "pictures\\cloud8.png", "pictures\\cloud9.png", "pictures\\cloud10.png", "pictures\\cloud11.png", "pictures\\cloud12.png"};
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


