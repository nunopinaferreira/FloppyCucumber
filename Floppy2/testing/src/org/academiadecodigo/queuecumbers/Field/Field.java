
package org.academiadecodigo.queuecumbers.Field;

import org.academiadecodigo.queuecumbers.FieldInterface;

public class Field implements FieldInterface {
    // em que COL e ROW equivalem à unidade de medida da grid em Height e Width.
    // pixels!!
    public static final int HEIGHT = 800;
    public static final int WIDTH = 1400;




    @Override
    public int getCOL() {
        return WIDTH;
    }

    @Override
    public int getROW() {
        return HEIGHT;
    }


}