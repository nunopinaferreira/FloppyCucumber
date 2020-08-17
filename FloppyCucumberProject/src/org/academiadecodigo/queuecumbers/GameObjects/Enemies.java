


package org.academiadecodigo.queuecumbers.GameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Enemies extends HitableObjects {
    private Picture bomb;

    public Enemies() {   // Sempre quis escrever isto em código e nem sabia.
        this.setHeight(50);
        this.bomb = new Picture(super.getPosition().getCol(), super.getPosition().getRow(), "pictures\\bomba2.png");
        bomb.draw();


    }
/*
    public static void moveLeft() {
        pic.translate(-1, 0);// movimento da direita para a esquerda
    }
*/

    public void moveLeft() {
        bomb.translate(-1, 0);// movimento da direita para a esquerda
    }

    @Override
    public void moveLeft(int num) {
       int movement = -1;
        for (int i = 0; i < num; i++) {
                bomb.translate(movement, 0);


        }
    }



}