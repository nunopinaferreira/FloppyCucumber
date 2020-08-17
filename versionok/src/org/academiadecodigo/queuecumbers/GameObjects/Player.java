package org.academiadecodigo.queuecumbers.GameObjects;
import org.academiadecodigo.queuecumbers.Field.FieldPosition;
import org.academiadecodigo.queuecumbers.FieldPositionFactory;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;


    public class Player implements KeyboardHandler {

        private Keyboard keyboard;
        private Picture cucumber;
        private Picture cucumberHappy;
        private Picture cucumberEyesClosed;
        private FieldPosition fieldPosition;
        private FieldPosition currentPosition;
        private Picture explosion;



        public Player(int col, int row) { // col e row são as coordenadas de inicialização

            fieldPosition = FieldPositionFactory.createNewPosition(col, row);

            cucumber = new Picture(col, row, "resources\\cucumber3.png");
            cucumber.draw();

            keyboard();

        }
        public FieldPosition getFieldPosition() {
            return fieldPosition;
        }


        public Picture getCucumber() {
            return cucumber;
        }

        public void keyboard() {
            keyboard = new Keyboard(this);
            KeyboardEvent inputJump = new KeyboardEvent();
            inputJump.setKey(KeyboardEvent.KEY_W);
            inputJump.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(inputJump);
        }

        private int totalScore = 0;
        private boolean isCrashed = false;

        public void crash() {
            isCrashed = true;
        }

        public void setScore(int score) { // recebe um int de pontuação de um Collectible, e altera o score actual
            totalScore += score;
        }

        public int getScore() {  // retorna o valor do score total
            return this.totalScore;
        }

        @Override
        public void keyPressed(KeyboardEvent inputJump) {
            int movement = -1;

            for(int i = 0; i < 50; i++) {
                cucumber.translate(0, movement);
                //track current position
                int initialPosition1 = fieldPosition.getRow();
                int finalPosition1 = initialPosition1 + movement;
                setFieldPosition(fieldPosition.getCol(), finalPosition1);
            }
            //- 5 com 20 iterações e delay
        }

        @Override
        public void keyReleased(KeyboardEvent inputJump) {
            //Release method
        }

        public FieldPosition getCurrentPosition() {
            return currentPosition;
        }

        public void setFieldPosition(int col, int row){
            fieldPosition.setCol(col);
            fieldPosition.setRow(row);
        }

        // movimento automático para baixo
        public void gravity(){
            int movement = 1;

            for(int i = 0; i < 2; i++) {
                cucumber.translate(0, movement);

                //track current position
                int initialPosition1 = fieldPosition.getRow();
                int finalPosition1 = initialPosition1 + movement;
                setFieldPosition(fieldPosition.getCol(), finalPosition1);
            }
        }

        public void explosion() {
            cucumber.delete();
            explosion = new Picture (fieldPosition.getCol()-80, fieldPosition.getRow()-50, "resources\\boom.PNG");
            explosion.draw();
        }

        /*
        public void playerGetsCollectible() {
            cucumber.delete();
            cucumberHappy = new Picture(fieldPosition.getCol(),fieldPosition.getRow(), "pictures\\cucumberEyesHappy.PNG");
                for (int i = 0; i < 60; i++) {
                    cucumberHappy.draw();
                }
            cucumberHappy.delete();
            //cucumberEyesClosed = new Picture(fieldPosition.getCol(), fieldPosition.getRow(), "pictures\\cucumberEyesClosed.PNG");
            //cucumberEyesClosed.draw();
            //cucumberEyesClosed.delete();
            cucumber.draw();
        }
        */




    }
