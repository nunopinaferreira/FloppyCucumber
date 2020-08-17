package org.academiadecodigo.queuecumbers.GameObjects;

import org.academiadecodigo.queuecumbers.Field.FieldPosition;
import org.academiadecodigo.queuecumbers.FieldPositionFactory;



public abstract class HitableObjects extends GameObjects {

    private boolean isCollectibe;
    private int hitableHeight = 50; // valor da altura do objecto hitable
    private int hitableWidth;

    public FieldPosition getFieldPosition() {
        return fieldPosition;
    }

    public void setFieldPosition(int col, int row) {
        fieldPosition.setCol(col);
        fieldPosition.setRow(row);
    }

    private FieldPosition fieldPosition;
    //private Picture bomb;



    // o blueprint do construtor de hitables. falta os collectibles.
    public HitableObjects() {
        isCollectibe = false;
        fieldPosition = FieldPositionFactory.createNewPosition();

        //bomb = new Picture(fieldPosition.getCol(), fieldPosition.getRow(), "pictures\\bomba2.png");
        //bomb.draw();


    }

    // método para alterar o estado booleano de isCollectible
    public void setHitable(boolean hitable) {
        isCollectibe = hitable;
    }


    // método para obter o valor da altura do objecto
    public int getHeight (){
        return hitableHeight;
    }

    // método para alterar a altura do objecto? para que é que isto serve?
    public void setHeight (int height){
        this.hitableHeight = height;
    }

    // método para obter o valor da largura do objecto
    public int getWidth (){
        return hitableWidth;
    }

    public void setWidth(int width){ // método para alterar a largura do objecto? para que é que isto serve?
        this.hitableWidth = width;
    }


    // método para obter a posição (inicial) do objecto. Inicial porque as novas posições depois do movimento não estão a ser guardadas em nenhuma variável nesta classe.
    public FieldPosition getPosition(){
        return this.fieldPosition;
    }


    public abstract void moveLeft(int num);
}

