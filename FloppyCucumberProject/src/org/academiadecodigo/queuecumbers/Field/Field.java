
package org.academiadecodigo.queuecumbers.Field;

import org.academiadecodigo.queuecumbers.FieldInterface;

public class Field implements FieldInterface {
    // em que COL e ROW equivalem à unidade de medida da grid em Height e Width.
    // pixels!!
    static final int HEIGHT = 800;
    static final int WIDTH = 1000;

   /*
    @Override
    public int getHEIGHT() {
        return HEIGHT;
    }

    @Override
    public int getWIDTH() {
        return WIDTH;
    }
*/



    @Override
    public int getCOL() {
        return WIDTH;
    }

    @Override
    public int getROW() {
        return HEIGHT;
    }


}