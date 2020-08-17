package org.academiadecodigo.queuecumbers.GameObjects;

import org.academiadecodigo.queuecumbers.Field.FieldPosition;
import org.academiadecodigo.queuecumbers.FieldPositionFactory;
import org.academiadecodigo.queuecumbers.FieldPositionInterface;
import org.academiadecodigo.queuecumbers.SimpleGfx.FieldPositionGfx;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public abstract class HitableObjects extends GameObjects {

    private boolean isCollectibe;
    private int hitableHeight = 50; // valor da altura do objecto hitable
    private int hitableWidth;
    private FieldPosition fieldPosition;
    //private Picture bomb;

    //hitable attributes
    int hitableActualX1 = 125; // coordenada X do hitbox superior esquerdo dos objectos hitable - a position clássica
    int hitableActualY1 = 166; // coordenada Y do hitbox superior esquerdo dos objectos hitable - a position clássica
    int hitableActualY2 = hitableActualY1 + hitableHeight;



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

    public void setPosition(){} // presumo que isto seja um método para alterar a posição do objecto. pode fazer sentido guardar as posições aqui?


    public int getCol() {
        return fieldPosition.getCol();
    }


    public int getRow() {
        return fieldPosition.getRow();
    }

    public abstract void moveLeft(int num);

/*
    @Override
    public void moveLeft() { }

    public void moveLeft(int num) { }

    @Override
    public void getInfo() { }


*/




//Object.traslate(x--,0);
    //pic.translate(-1,0);// movimento da direita para a esquerda

}