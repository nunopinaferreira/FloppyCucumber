package org.academiadecodigo.queuecumbers.Field;

import org.academiadecodigo.queuecumbers.GameObjects.Player;
import org.academiadecodigo.queuecumbers.Randomizer;

public class FieldPosition {

    private int col;
    private int row;

    public FieldPosition () { // constructor que gera um novo "ponto"
        this.col = Field.WIDTH;
        this.row = Randomizer.getRandom(50, 600);
    }

    public FieldPosition (int col, int row){ //constructor para Player, com coordenadas fixas
        this.col = col;
        this.row = row;
    }

    public FieldPosition (int row) { //constructor para NonHitableObjects, cuja coordenada row será limitada em função do tipo.
        this.col = Field.WIDTH;
        this.row = row;
    }



    // Cada GameObject *terá* uma field position.
    // Cada Field Position será uma hitBox rectangular cujos limites são os pixéis compreendidos entre o seu canto superior esquerdo
    // e canto inferior direito.
    //private int width = 30;
    //private int height = 50; // isto terá de ser definido na factory para cada objecto, pois diferentes representações
    //gráficas do mesmo objecto terão cada uma a sua hitbox própria;
    //private int x;
    //private int y;
    //private Field field;
    /*
    Caixa de posições (cada uma um par de coordenadas) que define uma classe hit box?
    private coordinates[] box = {topLeft, bottomLeft, topRight, bottomRight};
    private int[] topLeft = {x, y};
    private int[] bottomLeft = {x, y - height};
    private int[] topRight = {x + width, y};
    private int[] bottomRight = {x + width, y - height};
    */
    // uma hit box tem de ter 4 cantos, certo? Como resolver isto?
    // a hit box tem de ser completamente tapada pelo "boneco" em simple graphics, pelo que não lhe dou color;
    // assume-se um field size fixo de 1000 x 800 pixéis & que field e grid são a mesma coisa;
    // lembrar que eixo x == colunas && eixo y == linhas



    public void setCol (int x){
        this.col = x;
    }
    public void setRow (int y){
        this.row = y;
    }

    /*
    public void setXY (int x1, int y1) {
        this.x = x;
        this.y = y;
    }

     */

    public int getCol() {
        return col;
    }
    public int getRow(){
        return row;
    }
    /**
     I'm here, don't shoot me.
     */

    /*
    // position -> jump method
    public void jump (int dist) {
        int field.getHEIGHT < (dist) ? this.setY(y+dist) : this.setY();
        this.setY(y + dist)
    }
    // position -> falling (moves down)
    public void moveDown(int dist) {
    }

     */
}
// field?
// Para ver: FieldPosition, FieldPositionFactory, FieldPositionGfx
// Liga com: GameObjects / HitablesFactory





/*
package org.academiadecodigo.queuecumbers.GameObjects;
        import org.academiadecodigo.simplegraphics.pictures.Picture;
public class Enemies extends HitableObjects {
    private static Picture pic;
    public Enemies (){   // Sempre quis escrever isto em código e nem sabia.
        this.setHeight(50);
        this.pic = new Picture(super.getPosition().getCol(), super.getPosition().getRow(), "pictures\\bomba2.png");
        pic.draw();
    }
    public static void moveLeft() {
        pic.translate(-1, 0);// movimento da direita para a esquerda
    }
    @Override
    public int getCol(){
        return 0;
    }
    @Override
    public int getRow() {
        return 0;
    }
}
09:50
@nuno pina ferreira
        09:54
        FieldPosition.java
        package org.academiadecodigo.queuecumbers.Field;
        import org.academiadecodigo.queuecumbers.GameObjects.Player;
        import org.academiadecodigo.queuecumbers.Randomizer;
public class FieldPosition {
    private int col;
    private int row;
    public FieldPosition () { // constructor que gera um novo "ponto"
        this.col = Field.WIDTH+50;
        this.row = Randomizer.getRandom(50, 600);
    }
    public FieldPosition (int num){
        this.col = 300;
        this.row = 100;
    }
    public int getCol() {
        return col;
    }
    public int getRow(){
        return row;
    }
    public void setCol (int x){
        this.col = x;
    }
    public void setRow (int y){
        this.row = y;
    }

 */
