package org.academiadecodigo.queuecumbers.Field;


import org.academiadecodigo.queuecumbers.others.Randomizer;

public class FieldPosition {

    private int col;
    private int row;

    public FieldPosition () { // constructor que gera um novo "ponto"
        this.col = Field.WIDTH-40;
        this.row = Randomizer.getRandom(50, 600);
    }

    public FieldPosition (int col, int row){ //constructor para Player, com coordenadas fixas
        this.col = col;
        this.row = row;
    }

    public FieldPosition (int row) { //constructor para NonHitableObjects, cuja coordenada row será limitada em função do tipo.
        this.col = Field.WIDTH-100;
        this.row = row;
    }


    public void setCol (int x){
        this.col = x;
    }
    public void setRow (int y){
        this.row = y;
    }


    public int getCol() {
        return col;
    }
    public int getRow(){
        return row;
    }

    /**
     I'm here, don't shoot me.
     */


}

