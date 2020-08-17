package org.academiadecodigo.queuecumbers.GameObjects;
import org.academiadecodigo.queuecumbers.Field.Field;
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
        private FieldPosition fieldPosition;
        private FieldPosition currentPosition;

        public Player(int col, int row) { // col e row são as coordenadas de inicialização

            fieldPosition = FieldPositionFactory.createNewPosition(col, row);

            cucumber = new Picture(col, row, "pictures\\cucumber3.png");
            cucumber.draw();

            keyboard();

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
            for (int i = 0; i < 80; i++) {
                cucumber.translate(0, movement);
            }


            //- 5 com 20 iterações e delay
        }

        @Override
        public void keyReleased(KeyboardEvent inputJump) {
            //Release method
        }

        public void start() throws InterruptedException {
            while (isCrashed == false) {
                Thread.sleep(300);
            }
        }

        public FieldPosition getCurrentPosition() {
            return currentPosition;
        }

        public void setCurrentPosition(FieldPosition currentPosition) {
            this.currentPosition = currentPosition;
        }

        // movimento automático para baixo
        public void gravity(){
            int movement = 1;
            for (int i = 0; i < 7; i++)
                cucumber.translate(0, movement);

        }


    }
